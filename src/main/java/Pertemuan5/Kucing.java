/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author LENOVO
 */
public class Kucing extends Hewan{
    
    private String jenisKucing;

    public Kucing() {
    }

    public Kucing(String jenisKucing) {
        this.jenisKucing = jenisKucing;
    }

    public Kucing(String jenisKucing, String namaHewan, int jumlahKaki) {
        super(namaHewan, jumlahKaki);
        this.jenisKucing = jenisKucing;
    }
    
    

    public String getJenisKucing() {
        return jenisKucing;
    }

    public void setJenisKucing(String jenisKucing) {
        this.jenisKucing = jenisKucing;
    }
    
    @Override
    public void suara(){
        System.out.println("Suara kucing: Meong...");
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Jenis Kucing: "+jenisKucing);
    }
}