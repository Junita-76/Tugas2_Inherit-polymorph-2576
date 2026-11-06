package soal1;

/**
 * kelas induk yang merepresentasikan perangkat elektronik
 */

public class Perangkat{
    private String merek;
    protected double harga;
    private int garansiBulan;

    private static final double TARIF_PAJAK = 0.10;

    /**
     * Membuat perangkat dengan merek, harga, dan garansi
     *
     * @param merek merek perangkat
     * @param harga harga perangkat
     * @param garansiBulan masa garansi dalam bulan
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */

    public Perangkat(String merek, double harga, int garansiBulan){
        if(merek == null || merek.isBlank()){
            throw new IllegalArgumentException("Merek tidak boleh kosong");
        }
        if(harga < 0){
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }

        this.merek = merek;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    /**
     * Mengembalikan merek perangkat
     * @return merek perangkat
     */

    public String getMerek(){
        return merek;
    }

    /**
     * Mengembalikan masa garansi
     * @return masa garansi dalam bulan
     */

    public int getGaransiBulan(){
        return garansiBulan;
    }

    /**
     * Menghitung pajak perangkat
     * @return pajak sebesar 10 persen dari harga
     */

    public double hitungPajak(){
        return harga * TARIF_PAJAK;
    }

    /**
     * Menghasilkan informasi singkat perangkat
     * @return informasi merek dan garansi
     */

    public String infoSingkat(){
        return merek + " | garansi " + garansiBulan + " bulan";
    }
}

   

