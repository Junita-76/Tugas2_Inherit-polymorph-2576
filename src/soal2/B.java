
package soal2;

/**
 * Merepresentasikan kelas B yang merupakan turunan dari kelas A untuk menguji method overriding dan pemanggilan constructor
 */

public class B extends A{
    int nilai = 5;

    /**
     * Membuat objek B dengan memanggil constructor kelas A
     * terlebih dahulu.
     */
    
    public B(){
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    @Override
    void init(){
        System.out.println("init B, nilai=" + nilai);
    }
}
