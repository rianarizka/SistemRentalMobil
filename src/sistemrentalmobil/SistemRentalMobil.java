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
public class SistemRentalMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Petugas petugas1 = new Petugas ();
        try{
        petugas1.setId("137834");
        }
        catch (Exception e){
            System.out.println("Terjadi error" + " " + e.getMessage());
        }
        try{
        petugas1.setNama("Riana Rizka");
        }
        catch (Exception e){
            System.out.println("Terjadi error" + " " + e.getMessage());
        }
      
        petugas1.setNoHp("085760895678");
       
        
       
        
        Penyewa penyewa1 = new Penyewa () ;
        try{
        penyewa1.setNama("Muhammad Ilham Syarif");
        }
        catch (Exception e){
            System.out.println("Terjadi error" + " " + e.getMessage());
        }
        try{
        penyewa1.setNoKtp("1304086112950004");
        }
        catch (Exception e){
            System.out.println("Terjadi error" + " " + e.getMessage());
        }
        penyewa1.setNoHP("085766251124");
        try{
        penyewa1.setAlamat("Batusangkar");
        }
        catch (Exception e){
            System.out.println("Terjadi error" + " " + e.getMessage());
        }
        
        IdMobilRental idMobilRental1 = new IdMobilRental();
        try{
        idMobilRental1.setKodeMobil("TY");
        }
        catch (Exception e){
            System.out.println("Terjadi error" + " " + e.getMessage());
        }
        try{
        idMobilRental1.setNomor("212");
        }
        catch (Exception e){
            System.out.println("Terjadi error" + " " + e.getMessage());
        }
        
        Mobil mobil1 = new Mobil ();
        mobil1.setIdMobilRental(idMobilRental1);
        mobil1.setJenis("toyota");
        mobil1.setKapasitas("6");
        mobil1.setHargaSewa(350000);
        mobil1.setWarna("putih");
        
        Nopol nopol1 = new Nopol ();
        try{
        nopol1.setKodeWilayah("BA");
        }
        catch (Exception e){
            System.out.println("Terjadi error" + " " + e.getMessage());
        }
        try{
        nopol1.setNomor("1845");
        }
        catch (Exception e){
            System.out.println("Terjadi error" + " " + e.getMessage());
        }
        
        mobil1.setNopol(nopol1);
        
       
       
        Penyewaan penyewaan1 = new Penyewaan ();
        penyewaan1.setNoSewa("1234");
        penyewaan1.setMobil(mobil1);
        penyewaan1.setLamaSewa("2");
        penyewaan1.setTanggalSewa(new Date());
        
        Pengembalian pengembalian1 = new Pengembalian();
        pengembalian1.setKeterlambatan(2);
        pengembalian1.setDenda(pengembalian1.getKeterlambatan()*50000);
       
        Kwitansi kwitansi1 = new Kwitansi ();
        kwitansi1.setPetugas(petugas1);
        kwitansi1.setPenyewa(penyewa1);
        kwitansi1.setPenyewaan(penyewaan1);
        kwitansi1.setPengembalian(pengembalian1);
        kwitansi1.setMobil(mobil1);
        kwitansi1.setTotalBayar(mobil1.getHargaSewa()+pengembalian1.getDenda());
       
        
        cetakKwitansi (kwitansi1);
        // TODO code application logic here
    }
    
static void cetakKwitansi(Kwitansi kwitansi) {
         
System.out.println(" KWITANSI RENTAL MOBIL 2KS2");
System.out.println("No Sewa        : " + kwitansi.getPenyewaan().getNoSewa());
System.out.println("Nama Penyewa   : " + kwitansi.getPenyewa().getNama());
System.out.println("Alamat Penyewa : " + kwitansi.getPenyewa().getAlamat());
System.out.println("No Hp Penyewa  : " + kwitansi.getPenyewa().getNoHP());
System.out.println("No KTP Penyewa : " + kwitansi.getPenyewa().getNoKtp());
System.out.println("Nama Petugas   : " + kwitansi.getPetugas().getNama());
System.out.println("Id Petugas     : " + kwitansi.getPetugas().getId());
System.out.println("No Hp Petugas  : " + kwitansi.getPetugas().getNoHp());
System.out.println("Tanggal sewa   : " + kwitansi.getPenyewaan().getTanggalSewa());
System.out.println("IdMbilRntal(kd): " + kwitansi.getMobil().getIdMobilRental().getKodeMobil());
System.out.println("IdMbilRntal(no): " + kwitansi.getMobil().getIdMobilRental().getNomor());
System.out.println("Jenis MObil    : " + kwitansi.getMobil().getJenis());
System.out.println("Warna Mobil    : " + kwitansi.getMobil().getWarna());
System.out.println("Nopol (kode)   : " + kwitansi.getMobil().getNopol().getKodeWilayah());
System.out.println("Nopol (nomor)  : " + kwitansi.getMobil().getNopol().getNomor());
System.out.println("Kapasitas MObil: " + kwitansi.getMobil().getKapasitas()+ " Orang");System.out.println("Keterlambatan  : " + kwitansi.getPengembalian().getKeterlambatan()+ " hari");
System.out.println("total harga    : Rp " + kwitansi.getTotalBayar());
     }
    
}
