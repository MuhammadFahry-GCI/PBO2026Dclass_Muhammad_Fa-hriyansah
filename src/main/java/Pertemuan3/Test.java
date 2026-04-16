package Pertemuan3;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) {
        Mahasiswa fahri = new Mahasiswa("Muhammad Fahri", "1234", 19);
        
        fahri.cetakBiodata();
        
        Mahasiswa andre = new Mahasiswa();
        andre.nama = "Andrew Chan";
        andre.nim = "2345";
        andre.umur = 19;
        
        andre.cetakBiodata();
    }
}
