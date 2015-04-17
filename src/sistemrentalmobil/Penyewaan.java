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
public class Penyewaan {
    
    private String noSewa;
    private Mobil mobil ;
    private Date tanggalSewa ;
    private String lamaSewa ;
    private Date tanggalKembali ;
   

    /**
     * @return the noSewa
     */
    public String getNoSewa() {
        return noSewa;
    }

    /**
     * @param noSewa the noSewa to set
     */
    public void setNoSewa(String noSewa) {
        this.noSewa = noSewa;
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
     * @return the tanggalSewa
     */
    public Date getTanggalSewa() {
        return tanggalSewa;
    }

    /**
     * @param tanggalSewa the tanggalSewa to set
     */
    public void setTanggalSewa(Date tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    /**
     * @return the lamaSewa
     */
    public String getLamaSewa() {
        return lamaSewa;
    }

    /**
     * @param lamaSewa the lamaSewa to set
     */
    public void setLamaSewa(String lamaSewa) {
        this.lamaSewa = lamaSewa;
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
