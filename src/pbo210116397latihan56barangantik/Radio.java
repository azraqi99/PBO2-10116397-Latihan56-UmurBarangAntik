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
public class Radio extends BarangAntik{
    private String name;

    public Radio(int umur){
        super(umur);
        this.umur = umur;
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
