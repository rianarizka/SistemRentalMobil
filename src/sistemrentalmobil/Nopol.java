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
public class Nopol {
    private String kodeWilayah;
    private String nomor ;

    /**
     * @return the kodeWilayah
     */
    public String getKodeWilayah() {
        return kodeWilayah;
    }

    /**
     * @param kodeWilayah the kodeWilayah to set
     */
    public void setKodeWilayah(String kodeWilayah)  throws Exception{
        if (kodeWilayah.length() >0 && kodeWilayah.length() <= 2){
        this.kodeWilayah = kodeWilayah;
        }
        else{throw new Exception ("kode wilayah harus kurang atau sama dengan 2");
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
