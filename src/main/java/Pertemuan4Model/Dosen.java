package Pertemuan4Model;

/**
 *
 * @author ASUS
 */
public class Dosen {
    

    private String nama;
    private String NIP;
    private int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getNIP() {
        return NIP;
    }

    public int getUmur() {
        return umur;
    }

    public void cetakBiodata() {
        System.out.println("=======================");
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + NIP);
        System.out.println("Umur: " + umur);
        System.out.println("=======================");
    }
}