
package soal2;

/**
 * Merepresentasikan titik sebagai turunan dari kelas Lingkaran
 */

public class Titik extends Lingkaran{

    /**
     * Membuat objek titik dengan memanggil constructor Lingkaran
     * menggunakan jari-jari 0
     */

    public Titik(){
        super(0);
    }

    @Override
    double luas(){
        return 0.0;
    }

    @Override
    double keliling(){
        return 0.0;
    }
}
