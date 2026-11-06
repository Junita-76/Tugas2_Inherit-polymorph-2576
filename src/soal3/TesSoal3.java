
package soal3;

/**
 * Menguji constructor overloading dan defensive copy pada kelas Garis
 */

public class TesSoal3{

    /**
     * Menjalankan pengujian constructor overloading dan aliasing
     * @param args argumen command line
     */

    public static void main(String[] args){
        // Pengujian constructor overload
        Garis g = new Garis(0, 0, 3, 4);
        System.out.println(g + " panjang=" + g.getPanjang());

        // Pengujian aliasing
        Titik t = new Titik(1, 1);
        Garis g2 = new Garis(t, new Titik(5, 5));
        t.setX(100);
        System.out.println(g2);
    }
}
