/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konektor;

/**
 *
 * @author Aditya Nugraha
 */
public class Pembeli {
    private int id;
    private String no_identitas;
    private String nama;
    private String tgl_pembelian;
    private String id_barang;
    private String jumlah;
    private String tot_harga;
    private String dp;
    private String status;
    private String bonus;

    public Pembeli() {
    }

    public Pembeli(int id, String no_identitas, String nama, String tgl_pembelian, String id_barang, String jumlah, String tot_harga, String dp, String status, String bonus) {
        this.id = id;
        this.no_identitas = no_identitas;
        this.nama = nama;
        this.tgl_pembelian = tgl_pembelian;
        this.id_barang = id_barang;
        this.jumlah = jumlah;
        this.tot_harga = tot_harga;
        this.dp = dp;
        this.status = status;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo_identitas() {
        return no_identitas;
    }

    public void setNo_identitas(String no_identitas) {
        this.no_identitas = no_identitas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgl_pembelian() {
        return tgl_pembelian;
    }

    public void setTgl_pembelian(String tgl_pembelian) {
        this.tgl_pembelian = tgl_pembelian;
    }

    public String getId_barang() {
        return id_barang;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getTot_harga() {
        return tot_harga;
    }

    public void setTot_harga(String tot_harga) {
        this.tot_harga = tot_harga;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
    
    
}
