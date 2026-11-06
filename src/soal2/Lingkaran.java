
package soal2;

/**
 * Merepresentasikan lingkaran berdasarkan panjang jari-jarinya
 */

public class Lingkaran{
    double jariJari;

    /**
     * Membuat objek lingkaran dengan jari-jari tertentu
     * @param jariJari panjang jari-jari lingkaran
     */

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    double luas(){
        return Math.PI * jariJari * jariJari;
    }

    double keliling(){
        return 2 * Math.PI * jariJari;
    }
}
