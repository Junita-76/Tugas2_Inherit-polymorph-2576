
package soal2;

/**
 * Merepresentasikan hewan dengan nama dan perilaku dasar
 */

public class Hewan{
    protected String nama;

    /**
     * Membuat objek hewan dengan nama tertentu
     * @param nama nama hewan
     */

    public Hewan(String nama){
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /**
     * Menampilkan suara dasar hewan.
     */

    public void suara(){
        System.out.println("...");
    }

    /**
     * Menampilkan perilaku hewan saat makan
     * dan memanggil method suara().
     */

    public void makan(){
        System.out.println(nama + " makan");
        suara();
    }
}
