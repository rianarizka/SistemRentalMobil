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
public class Pengembalian {
    
    private String noSewa;
    private Date tanggalKembali;
    private Mobil mobil;
    private int Keterlambatan;
    private int denda;

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
     * @return the Keterlambatan
     */
    public int getKeterlambatan() {
        return Keterlambatan;
    }

    /**
     * @param Keterlambatan the Keterlambatan to set
     */
    public void setKeterlambatan(int Keterlambatan) {
  
        this.Keterlambatan = Keterlambatan;
    }

    /**
     * @return the denda
     */
    public int getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     */
    public void setDenda(int denda) {
        
        this.denda = denda;
    }

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
    
    
}
