/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemrentalmobil;

import java.util.Date;

/**
 *
 * @author Riana Rizka
 */
public class Kwitansi {
    private Petugas petugas;
    private Penyewa penyewa;
    private Mobil mobil ;
    private Penyewaan penyewaan;
    private Pengembalian pengembalian;
    private Date tanggalKembali ;
    private int totalBayar ;


    /**
     * @return the petugas
     */
    public Petugas getPetugas() {
        return petugas;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    /**
     * @return the penyewa
     */
    public Penyewa getPenyewa() {
        return penyewa;
    }

    /**
     * @param penyewa the penyewa to set
     */
    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }

    /**
     * @return the mobil
     */
    public Mobil getMobil() {
        return mobil;
    }

    /**
     * @param mobil the mobil to set
     */
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    
   
    /**
     * @return the penyewaan
     */
    public Penyewaan getPenyewaan() {
        return penyewaan;
    }

    /**
     * @param penyewaan the penyewaan to set
     */
    public void setPenyewaan(Penyewaan penyewaan) {
        this.penyewaan = penyewaan;
    }

    /**
     * @return the pengembalian
     */
    public Pengembalian getPengembalian() {
        return pengembalian;
    }

    /**
     * @param pengembalian the pengembalian to set
     */
    public void setPengembalian(Pengembalian pengembalian) {
        this.pengembalian = pengembalian;
    }

    /**
     * @return the totalBayar
     */
    public int getTotalBayar() {
        return totalBayar;
    }

    /**
     * @param totalBayar the totalBayar to set
     */
    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
       
    }

    /**
     * @return the tanggalKembali
     */
    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    /**
     * @param tanggalKembali the tanggalKembali to set
     */
    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    
   
}
