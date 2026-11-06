
package soal4;

/**
 * Merepresentasikan produk digital yang memiliki ukuran file dan diskon khusus
 */

public class ProdukDigital extends Produk{
    protected double ukuranMb;

    protected static final double DISKON_DIGITAL = 0.10;

    /**
     * Membuat produk digital dengan kode, nama, harga dasar, dan ukuran tertentu
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param ukuranMb ukuran produk dalam megabyte
     */

    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb){
        super(kode, nama, hargaDasar);
        this.ukuranMb = ukuranMb;
    }

    /**
     * Menghitung harga akhir produk digital setelah diskon
     * @return harga produk setelah dikurangi diskon digital
     */

    @Override
    public double hitungHargaAkhir(){
        return hargaDasar * (1 - DISKON_DIGITAL);
    }

    /**
     * Menghasilkan deskripsi produk digital beserta ukuran filenya
     * @return deskripsi produk dan ukuran dalam megabyte
     */

    @Override
    public String deskripsi(){
        return "digital " + ukuranMb + " MB";
    }
}
