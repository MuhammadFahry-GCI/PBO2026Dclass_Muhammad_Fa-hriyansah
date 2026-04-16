package Pertemuan2;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    public String nama;
    public String nim;
    public int umur;
    
    public void cetakBiodata(){
        System.out.println("====================");
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Umur: "+umur);
        System.out.println("====================");
    }
    
    public void sapa(String yangDiSapa){
        System.out.println("====================");
        System.out.println("Assalamualaikum "+yangDiSapa);
        System.out.println("Nama saya "+nama);
        System.out.println("====================");
    }
    
    public double nilaiAngka(double UAS, double UTS, double tugas, double kuis){
        double nilaiAkhir = 0.3*UAS+0.3*UTS+0.2*tugas+0.2*kuis;
        return nilaiAkhir;
    }
    
    public double nilaiAngka(double UAS, double UTS){
        double nilaiAkhir = 0.6*UAS+0.4*UTS;
        return nilaiAkhir;
    }
    
    public String nilaiHuruf(double nilaiAkhir){
        String nilaiHuruf = "";
        
        if (nilaiAkhir >= 80){
            nilaiHuruf = "A";
        }
        else{
            nilaiHuruf = "B";
        }
        
        return nilaiHuruf;
    }
    
    public static void infoJurusan(){
        System.out.println("==================");
        System.out.println("Sistem Informsi");
        System.out.println("Tindakan Nyata!");
        System.out.println("==================");
    }
}