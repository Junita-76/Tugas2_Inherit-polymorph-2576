
package soal3;

/**
 * Merepresentasikan titik dalam bidang koordinat dua dimensi
 */

public class Titik{
    private double x;
    private double y;

    /**
     * Membuat titik pada koordinat (0, 0)
     */

    public Titik(){
        this(0, 0);
    }

    /**
     * Membuat titik dengan koordinat tertentu
     * @param x koordinat horizontal
     * @param y koordinat vertikal
     */

    public Titik(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Mengembalikan koordinat horizontal
     * @return nilai koordinat x
     */

    public double getX(){
        return x;
    }

    /**
     * Mengembalikan koordinat vertikal
     * @return nilai koordinat y
     */

    public double getY(){
        return y;
    }

    /**
     * Mengubah koordinat horizontal
     * @param x nilai koordinat horizontal yang baru
     */

    public void setX(double x){
        this.x = x;
    }

    /**
     * Mengubah koordinat vertikal
     * @param y nilai koordinat vertikal yang baru
     */

    public void setY(double y){
        this.y = y;
    }

    /**
     * Menghitung jarak antara titik ini dan titik lain
     * @param titikLain objek titik yang menjadi tujuan pengukuran
     * @return jarak antara kedua titik
     */

    public double jarakKe(Titik titikLain){
        double dx = this.x - titikLain.x;
        double dy = this.y - titikLain.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Menghasilkan representasi koordinat titik dalam bentuk teks
     * @return koordinat titik dengan format (x, y)
     */

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
