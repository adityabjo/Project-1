/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.*;
import java.util.*;
import konektor.CRUDInterfaceSQLite;
import konektor.Kendaraan;

/**
 *
 * @author Aditya Nugraha
 */
public class CRUD_SQLite implements CRUDInterfaceSQLite {

    private Connection conn;

    @Override
    public void bukaKoneksi() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:kendaraan.db");
    }

    @Override
    public void tutupKoneksi() throws SQLException {
        conn.close();
    }

    @Override
    public ArrayList<Kendaraan> read() throws SQLException {
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from data;");
        ArrayList<Kendaraan> list = new ArrayList();
        while (rs.next()) {
            Kendaraan k = new Kendaraan();
            k.setId(rs.getInt(1));
            k.setJenis(rs.getString(2));
            k.setMerk(rs.getString(3));
            k.setTipe(rs.getString(4));
            k.setThn_produksi(rs.getString(5));
            k.setBhn_bakar(rs.getString(6));
            k.setKecepatan(rs.getString(7));
            k.setKapasitas(rs.getString(8));
            k.setMesin(rs.getString(9));
            k.setHarga(rs.getString(10));
            list.add(k);
        }
        return list;
    }

    @Override
    public Kendaraan readById(int id) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select * from data where id = ?;");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Kendaraan k = new Kendaraan();
        while (rs.next()) {
            k.setId(rs.getInt(1));
            k.setJenis(rs.getString(2));
            k.setMerk(rs.getString(3));
            k.setTipe(rs.getString(4));
            k.setThn_produksi(rs.getString(5));
            k.setBhn_bakar(rs.getString(6));
            k.setKecepatan(rs.getString(7));
            k.setKapasitas(rs.getString(8));
            k.setMesin(rs.getString(9));
            k.setHarga(rs.getString(10));
        }
        return k;
    }

    @Override
    public void create(Kendaraan k) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("insert into data(jenis,merk,tipe,thn_produksi,bhn_bakar,kecepatan,kapasitas,mesin,harga) values (?,?,?,?,?,?,?,?,?);");
        ps.setString(1, k.getJenis());
        ps.setString(2, k.getMerk());
        ps.setString(3, k.getTipe());
        ps.setString(4, k.getThn_produksi());
        ps.setString(5, k.getBhn_bakar());
        ps.setString(6, k.getKecepatan());
        ps.setString(7, k.getKapasitas());
        ps.setString(8, k.getMesin());
        ps.setString(9, k.getHarga());
        ps.execute();
    }

    @Override
    public void update(Kendaraan k) throws SQLException {
    PreparedStatement ps = conn.prepareStatement("update data set jenis=?,merk=?,tipe=?,thn_produksi=?,bhn_bakar=?,kecepatan=?,kapasitas=?,mesin=?,harga=? where id=?");
        ps.setString(1, k.getJenis());
        ps.setString(2, k.getMerk());
        ps.setString(3, k.getTipe());
        ps.setString(4, k.getThn_produksi());
        ps.setString(5, k.getBhn_bakar());
        ps.setString(6, k.getKecepatan());
        ps.setString(7, k.getKapasitas());
        ps.setString(8, k.getMesin());
        ps.setString(9, k.getHarga());
        ps.setInt(10, k.getId());
        ps.execute();    
    }

    @Override
    public void delete(Kendaraan k) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("delete from data where id=?");
        ps.setInt(1, k.getId());
        ps.execute();
    }

}
