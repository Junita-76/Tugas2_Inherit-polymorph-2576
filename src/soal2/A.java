
package soal2;

/**
 * Merepresentasikan kelas A untuk menguji pemanggilan method init saat objek dibuat
 */

public class A{

    /**
     * Membuat objek A dan memanggil method init
     */
    
    public A(){
        System.out.println("A dibuat");
        init();
    }

    void init(){
        System.out.println("init A");
    }
}
