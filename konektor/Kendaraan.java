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
public class Kendaraan {
    private int id;
    private String jenis;
    private String merk;
    private String tipe;
    private String thn_produksi;
    private String bhn_bakar;
    private String kecepatan;
    private String kapasitas;
    private String mesin;
    private String harga;

    public Kendaraan() {
    }

    public Kendaraan(int id, String jenis, String merk, String tipe, String thn_produksi, String bhn_bakar, String kecepatan, String kapasitas, String mesin, String harga) {
        this.id = id;
        this.jenis = jenis;
        this.merk = merk;
        this.tipe = tipe;
        this.thn_produksi = thn_produksi;
        this.bhn_bakar = bhn_bakar;
        this.kecepatan = kecepatan;
        this.kapasitas = kapasitas;
        this.mesin = mesin;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getThn_produksi() {
        return thn_produksi;
    }

    public void setThn_produksi(String thn_produksi) {
        this.thn_produksi = thn_produksi;
    }

    public String getBhn_bakar() {
        return bhn_bakar;
    }

    public void setBhn_bakar(String bhn_bakar) {
        this.bhn_bakar = bhn_bakar;
    }

    public String getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(String kecepatan) {
        this.kecepatan = kecepatan;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getMesin() {
        return mesin;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    
}
