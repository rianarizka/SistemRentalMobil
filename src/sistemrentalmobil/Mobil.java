/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemrentalmobil;

/**
 *
 * @author Riana Rizka
 */
public class Mobil {
    
    private IdMobilRental idMobilRental ;
    private String jenis ;
    private String warna ;
    private String kapasitas ;
    private int hargaSewa;
    private Nopol nopol ;
   
    
    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

   

    /**
     * @return the kapasitas
     */
    public String getKapasitas() {
        return kapasitas;
    }

    /**
     * @param kapasitas the kapasitas to set
     */
    public void setKapasitas(String kapasitas) {
       
        this.kapasitas = kapasitas;
    }

    /**
     * @return the hargaSewa
     */
    public int getHargaSewa() {
        return hargaSewa;
    }

    /**
     * @param hargaSewa the hargaSewa to set
     */
    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    /**
     * @return the nopol
     */
    public Nopol getNopol() {
        return nopol;
    }

    /**
     * @param nopol the nopol to set
     */
    public void setNopol(Nopol nopol) {
        this.nopol = nopol;
    }

    /**
     * @return the Status
     */
  
    
    public IdMobilRental getIdMobilRental() {
        return idMobilRental;
    }
    
    public void setIdMobilRental(IdMobilRental idMobilRental) {
        this.idMobilRental = idMobilRental;
    }
}
