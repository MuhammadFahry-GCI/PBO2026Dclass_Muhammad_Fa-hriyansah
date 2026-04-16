/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author LENOVO
 */
public class Hewan {
    private String namaHewan;
    private int jumlahKaki;

    public Hewan() {
    }

    public Hewan(String namaHewan, int jumlahKaki) {
        this.namaHewan = namaHewan;
        this.jumlahKaki = jumlahKaki;
    }
    
    

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
    
    public void info(){
        System.out.println("Nama: "+namaHewan);
        System.out.println("Jumlah Kaki:"+jumlahKaki);
    }
    
    public void suara(){
        System.out.println("Hewan bisa bersuara.");
    }
}
