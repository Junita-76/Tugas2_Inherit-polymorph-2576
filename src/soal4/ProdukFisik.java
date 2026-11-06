
package soal4;

/**
 * Merepresentasikan produk fisik yang memiliki berat dan biaya pengiriman
 */

public class ProdukFisik extends Produk{
    private double beratKg;

    private static final double ONGKOS_KIRIM_PER_KG = 10000;

    /**
     * Membuat produk fisik dengan kode, nama, harga dasar, dan berat tertentu
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param beratKg berat produk dalam kilogram
     */

    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg){
        super(kode, nama, hargaDasar);
        this.beratKg = beratKg;
    }

    /**
     * Menghitung harga akhir produk fisik termasuk ongkos kirim
     * @return harga dasar ditambah ongkos kirim berdasarkan berat produk
     */

    @Override
    public double hitungHargaAkhir(){
        return hargaDasar + (beratKg * ONGKOS_KIRIM_PER_KG);
    }

    /**
     * Menghasilkan deskripsi produk fisik beserta beratnya
     * @return deskripsi produk dan berat dalam kilogram
     */

    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}
