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
public class Penyewa {
    
    private String nama ;
    private String noHP ;
    private String noKtp ;
    private String alamat ;
    
    

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) throws Exception {
        for (char c : nama.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Nama tidak boleh "
                        + "mengandung angka");
            }
        }
        this.nama = nama;
    }

    /**
     * @return the noHP
     */
    public String getNoHP() {
        return noHP;
    }

    /**
     * @param noHP the noHP to set
     */
    public void setNoHP(String noHP) {
         
        this.noHP = noHP;
    }

    /**
     * @return the noKtp
     */
    public String getNoKtp() {
        return noKtp;
    }

    /**
     * @param noKtp the noKtp to set
     */
    public void setNoKtp(String noKtp)throws Exception {
        if (noKtp.length() == 16) { this.noKtp = noKtp;}
        else{
        throw new Exception ( "No KTP Harus berisi 16 angka");}
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
