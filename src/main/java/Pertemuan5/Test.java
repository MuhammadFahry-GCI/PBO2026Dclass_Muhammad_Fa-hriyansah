/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author LENOVO
 */
public class Test {
    public static void main(String[] args) {
        Kucing kcg = new Kucing();
        
        kcg.setNamaHewan("Kucing");
        kcg.setJumlahKaki(4);
        kcg.setJenisKucing("Anggora");
        
        kcg.info();
        
        System.out.println("=======================");
        System.out.println("");
        
        kcg.suara();
        System.out.println("=======================");
        System.out.println("");
        
        Anjing ajg = new Anjing();
        ajg.suara();
        System.out.println("=======================");
        System.out.println("");
        
        Kucing kcg2 = new Kucing("Kampung", "Kucing", 4);
        kcg2.info();
        System.out.println("=======================");
        System.out.println("");
    }
}