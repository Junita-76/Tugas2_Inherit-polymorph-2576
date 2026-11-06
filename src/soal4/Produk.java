
package soal4;

/**
 * Merepresentasikan produk umum dalam toko digital
 */

public class Produk{
    protected String kode;
    protected String nama;
    protected double hargaDasar;

    /**
     * Membuat produk dengan kode, nama, dan harga dasar tertentu
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @throws IllegalArgumentException jika nama kosong atau harga dasar negatif
     */

    public Produk(String kode, String nama, double hargaDasar){

        if(nama == null || nama.trim().isEmpty()){
            throw new IllegalArgumentException("Nama produk tidak boleh kosong");
        }

        if (hargaDasar < 0){
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif");
        }

        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    /**
     * Mengembalikan kode produk
     * @return kode produk
     */

    public String getKode(){
        return kode;
    }

    /**
     * Mengembalikan nama produk
     * @return nama produk
     */

    public String getNama(){
        return nama;
    }

    /**
     * Mengembalikan harga dasar produk
     * @return harga dasar produk
     */

    public double getHargaDasar(){
        return hargaDasar;
    }

    /**
     * Menghitung harga akhir produk umum
     * @return harga dasar produk
     */

    public double hitungHargaAkhir(){
        return hargaDasar;
    }

    /**
     * Menghasilkan deskripsi produk umum
     * @return deskripsi produk
     */
    
    public String deskripsi(){
        return "produk umum";
    }
}
