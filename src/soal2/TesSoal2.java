
package soal2;

/**
 * Menjalankan pengujian inheritance, polymorphism, overriding, dan downcasting pada Soal 2
 */

public class TesSoal2{

    /**
     * Menjalankan seluruh pengujian Soal 2.
     * @param args argumen command line
     */

    public static void main(String[] args){

        // Bagian A
        Hewan h = new Kucing("Tom");

        h.makan();
        h.suara();
        //h.panjat();

        Hewan h2 = new Hewan("Generik");

        if(h2 instanceof Kucing){
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        }
        else{
            System.out.println("h2 bukan objek Kucing");
        }

        // Bagian B
        new B();

        // Bagian C
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();

        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}
