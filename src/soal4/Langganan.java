
package soal4;

/**
 * Merepresentasikan produk langganan digital dengan durasi berlangganan tertentu
 */

public class Langganan extends ProdukDigital{
    private int durasiBulan;

    private static final int BATAS_DISKON_BULAN = 12;
    private static final double DISKON_LANGGANAN = 0.20;

    /**
     * Membuat produk langganan dengan kode, nama, harga dasar, ukuran, dan durasi
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk per bulan
     * @param ukuranMb ukuran produk dalam megabyte
     * @param durasiBulan lama berlangganan dalam bulan
     */

    public Langganan(String kode, String nama, double hargaDasar, double ukuranMb, int durasiBulan){
        super(kode, nama, hargaDasar, ukuranMb);
        this.durasiBulan = durasiBulan;
    }

    /**
     * Menghitung harga langganan berdasarkan durasi dan diskon jika memenuhi syarat
     * @return total harga langganan setelah diskon jika berlaku
     */

    @Override
    public double hitungHargaAkhir(){
        double total = hargaDasar * durasiBulan;

        if (durasiBulan >= BATAS_DISKON_BULAN){
            total *= (1 - DISKON_LANGGANAN);
        }

        return total;
    }

    /**
     * Menghasilkan deskripsi produk langganan beserta durasinya
     * @return deskripsi langganan dalam bulan
     */

    @Override
    public String deskripsi(){
        return "langganan " + durasiBulan + " bulan";
    }
}
