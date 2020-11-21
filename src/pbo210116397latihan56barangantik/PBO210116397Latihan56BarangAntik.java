/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Umur Barang Antik
 */
package pbo210116397latihan56barangantik;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan56BarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio rdo = new Radio(234);
        rdo.setName("Radio AM");
        System.out.println("Nama Barang Antik : " + rdo.getName());
        rdo.tampilUmur();
    }
    
}
