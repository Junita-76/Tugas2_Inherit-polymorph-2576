
package soal1;

/**
 * Merepresentasikan laptop sebagai perangkat elektronik
 */

public class Laptop extends Perangkat{
    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Membuat laptop dengan spesifikasi tertentu
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan masa garansi
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     */

    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci){
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga laptop setelah diskon
     * @param diskonPersen persentase diskon
     * @return harga setelah diskon
     * @throws IllegalArgumentException jika diskon kurang dari 0 atau lebih dari 100
     */

    public double hitungHargaPromo(double diskonPersen){
        if (diskonPersen < 0 || diskonPersen > 100){
            throw new IllegalArgumentException("Diskon harus antara 0 sampai 100 persen");
        }

        return harga - (harga * diskonPersen / 100);
    }

    /**
     * Menghasilkan informasi singkat laptop
     * @return informasi perangkat dan spesifikasi laptop
     */

    @Override
    public String infoSingkat(){
        return super.infoSingkat() + " | RAM " + ramGb + " GB" + " | layar " + ukuranLayarInci + " inci";
    }
}
