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
public class IdMobilRental {
    private String kodeMobil ;
    private String nomor;

    /**
     * @return the kodeMobil
     */
    public String getKodeMobil() {
        return kodeMobil;
    }

    /**
     * @param kodeMobil the kodeMobil to set
     */
    public void setKodeMobil(String kodeMobil) throws Exception{
        if (kodeMobil.length() > 0
                && kodeMobil.length() <= 2)
        {this.kodeMobil = kodeMobil;}
        else
        {throw new Exception ("kode mobil harus kurang atau sama dengan 2");
        }
    }

    /**
     * @return the nomor
     */
    public String getNomor() {
        return nomor;
    }

    /**
     * @param nomor the nomor to set
     */
    public void setNomor(String nomor) throws Exception {
        try{
            Integer.parseInt(nomor);
        } catch (Exception e){
            throw new Exception("Harus berupa angka semua");
        }
        this.nomor = nomor;
    }
    
    
}
