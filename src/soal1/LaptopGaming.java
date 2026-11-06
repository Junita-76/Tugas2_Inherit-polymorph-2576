package soal1;

/**
 * Merepresentasikan laptop gaming dengan kartu grafis khusus
 */

public class LaptopGaming extends Laptop{
    private String kartuGrafis;
    private static final int TAMBAHAN_GARANSI = 6;

    /**
     * Membuat laptop gaming dengan tambahan masa garansi 6 bulan
     * @param merek merek laptop gaming
     * @param harga harga laptop gaming
     * @param garansiBulan masa garansi dasar dalam bulan
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis jenis kartu grafis
     */

    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis){
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    /**
     * Menghasilkan informasi singkat laptop gaming.
     * @return informasi perangkat, spesifikasi laptop, dan kartu grafis
     */

    @Override
    public String infoSingkat(){
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}