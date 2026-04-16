package Pertemuan4Model;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) {
        Dosen paktakim = new Dosen();

        paktakim.setNama("Mustakim");
        paktakim.setNIP("123456");
        paktakim.setUmur(17);

        paktakim.cetakBiodata();

        System.out.println("Umur pak takim: " + paktakim.getUmur());
    }

}