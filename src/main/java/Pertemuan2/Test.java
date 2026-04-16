package Pertemuan2;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) {
        Mahasiswa adam = new Mahasiswa();
        Mahasiswa aqil = new Mahasiswa();
        Mahasiswa wardah = new Mahasiswa();
        
        adam.nama = "M. Adam";
        adam.nim = "1234";
        adam.umur = 20;
        
        aqil.nama = "M. Aqil";
        aqil.nim = "5678";
        aqil.umur = 19;
        
        wardah.nama = "Wardah Harahap";
        wardah.nim = "3456";
        wardah.umur = 19;
        
        adam.cetakBiodata();
        aqil.cetakBiodata();
        wardah.cetakBiodata();
        
        aqil.sapa("Zilfa");
        
        double nilaiAkhir = aqil.nilaiAngka(90, 85, 75, 85);
        String nilaiHuruf = aqil.nilaiHuruf(nilaiAkhir);
                
        System.out.println("Nilai akhir aqil: "+nilaiAkhir);
        System.out.println("Nilai huruf aqil: "+nilaiHuruf);
        
        double nilaiAkhirWardah = aqil.nilaiAngka(90, 80);
        
        Mahasiswa.infoJurusan();
    }
}