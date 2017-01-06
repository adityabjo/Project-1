/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;
import java.util.ArrayList;
import konektor.CRUDInterfaceMySQL;
import konektor.Pembeli;
/**
 *
 * @author Aditya Nugraha
 */
public class CRUD_MySQL implements CRUDInterfaceMySQL{
    private Connection conn;
    
    @Override
    public void bukaKoneksi() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/pembeli","root","");
    }

    @Override
    public void tutupKoneksi() throws SQLException {
        conn.close();
    }

    @Override
    public ArrayList<Pembeli> read() throws SQLException {
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from data");
        ArrayList<Pembeli> list = new ArrayList();
        while (rs.next()) {
            Pembeli p = new Pembeli();
            p.setId(rs.getInt(1));
            p.setNo_identitas(rs.getString(2));
            p.setNama(rs.getString(3));
            p.setTgl_pembelian(rs.getString(4));
            p.setId_barang(rs.getString(5));
            p.setJumlah(rs.getString(6));
            p.setTot_harga(rs.getString(7));
            p.setDp(rs.getString(8));
            p.setStatus(rs.getString(9));
            p.setBonus(rs.getString(10));
            list.add(p);
        }
        return list;
    }

    @Override
    public Pembeli readById(int id) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select * from data where id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Pembeli p = new Pembeli();
        while (rs.next()){
            p.setId(rs.getInt(1));
            p.setNo_identitas(rs.getString(2));
            p.setNama(rs.getString(3));
            p.setTgl_pembelian(rs.getString(4));
            p.setId_barang(rs.getString(5));
            p.setJumlah(rs.getString(6));
            p.setTot_harga(rs.getString(7));
            p.setDp(rs.getString(8));
            p.setStatus(rs.getString(9));
            p.setBonus(rs.getString(10));
        }
        return p;
    }

    @Override
    public void create(Pembeli p) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("insert into data(no_identitas,nama,tgl_pembelian,id_barang,jumlah,tot_harga,dp,status,bonus) values (?,?,?,?,?,?,?,?,?)");
        ps.setString(1, p.getNo_identitas());
        ps.setString(2, p.getNama());
        ps.setString(3, p.getTgl_pembelian());
        ps.setString(4, p.getId_barang());
        ps.setString(5, p.getJumlah());
        ps.setString(6, p.getTot_harga());
        ps.setString(7, p.getDp());
        ps.setString(8, p.getStatus());
        ps.setString(9, p.getBonus());
        ps.execute();
    }

    @Override
    public void update(Pembeli p) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("update data set no_identitas=?,nama=?,tgl_pembelian=?,id_barang=?,jumlah=?,tot_harga=?,dp=?,status=?,bonus=? where id=?");
        ps.setString(1, p.getNo_identitas());
        ps.setString(2, p.getNama());
        ps.setString(3, p.getTgl_pembelian());
        ps.setString(4, p.getId_barang());
        ps.setString(5, p.getJumlah());
        ps.setString(6, p.getTot_harga());
        ps.setString(7, p.getDp());
        ps.setString(8, p.getStatus());
        ps.setString(9, p.getBonus());
        ps.setInt(10, p.getId());
        ps.execute();
    }

    @Override
    public void delete(Pembeli p) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("delete from data where id=?");
        ps.setInt(1, p.getId());
        ps.execute();
    }
    
}
