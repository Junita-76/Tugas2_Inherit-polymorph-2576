
package soal3;

/**
 * Merepresentasikan garis yang dibentuk oleh dua objek Titik
 */

public class Garis{
    private Titik awal;
    private Titik akhir;

    /**
     * Membuat garis berdasarkan dua objek titik
     * Data titik disalin menggunakan defensive copy
     * @param awal titik awal garis
     * @param akhir titik akhir garis
     */

    public Garis(Titik awal, Titik akhir){
        this.awal = new Titik(awal.getX(), awal.getY());
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Membuat garis berdasarkan koordinat kedua ujungnya
     * @param x1 koordinat x titik awal
     * @param y1 koordinat y titik awal
     * @param x2 koordinat x titik akhir
     * @param y2 koordinat y titik akhir
     */

    public Garis(double x1, double y1, double x2, double y2){
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    /**
     * Mengembalikan salinan titik awal garis
     * @return salinan objek titik awal
     */

    public Titik getAwal(){
        return new Titik(awal.getX(), awal.getY());
    }

    /**
     * Mengembalikan salinan titik akhir garis
     * @return salinan objek titik akhir
     */

    public Titik getAkhir(){
        return new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Mengubah titik awal garis dengan menyalin data titik
     * @param awal objek titik awal yang baru
     */

    public void setAwal(Titik awal){
        this.awal = new Titik(awal.getX(), awal.getY());
    }

    /**
     * Mengubah titik akhir garis dengan menyalin data titik
     * @param akhir objek titik akhir yang baru
     */

    public void setAkhir(Titik akhir){
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Menghitung panjang garis berdasarkan jarak kedua titik
     * @return panjang garis
     */

    public double getPanjang(){
        return awal.jarakKe(akhir);
    }

    /**
     * Menghasilkan representasi garis dalam bentuk teks
     * @return koordinat titik awal dan titik akhir garis
     */

    @Override
    public String toString() {
        return awal.toString() + " - " + akhir.toString();
    }
}
