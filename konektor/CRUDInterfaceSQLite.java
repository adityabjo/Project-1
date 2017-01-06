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
public interface CRUDInterfaceSQLite {
    public void bukaKoneksi() throws ClassNotFoundException, SQLException;
    public void tutupKoneksi() throws SQLException;
    public ArrayList<Kendaraan> read() throws SQLException;
    public Kendaraan readById(int id) throws SQLException;
    public void create (Kendaraan k) throws SQLException;
    public void update (Kendaraan k) throws SQLException;
    public void delete (Kendaraan k) throws SQLException;
    
}
