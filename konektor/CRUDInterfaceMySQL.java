/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konektor;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Aditya Nugraha
 */
public interface CRUDInterfaceMySQL {
    public void bukaKoneksi() throws ClassNotFoundException, SQLException;
    public void tutupKoneksi() throws SQLException;
    public ArrayList<Pembeli> read() throws SQLException;
    public Pembeli readById(int id) throws SQLException;
    public void create (Pembeli p) throws SQLException;
    public void update (Pembeli p) throws SQLException;
    public void delete (Pembeli p) throws SQLException;
}
    