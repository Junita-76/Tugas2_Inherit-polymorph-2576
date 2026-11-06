
package soal4;

import java.util.ArrayList;

/**
 * Merepresentasikan keranjang belanja yang menyimpan berbagai jenis produk
 */

public class Keranjang{
    private ArrayList<Produk> daftarProduk;

    /**
     * Membuat keranjang belanja kosong
     */

    public Keranjang(){
        daftarProduk = new ArrayList<>();
    }

    /**
     * Menambahkan produk ke dalam keranjang
     * @param produk produk yang akan ditambahkan
     * @throws IllegalStateException jika kode produk sudah ada di keranjang
     */

    public void tambah(Produk produk){
        for(Produk p : daftarProduk){

            if(p.getKode().equals(produk.getKode())) {
                throw new IllegalStateException("Kode produk sudah ada");
            }
        }

        daftarProduk.add(produk);
    }

    /**
     * Menghitung total harga seluruh produk dalam keranjang
     * @return total harga seluruh produk
     */

    public double hitungTotal(){
        double total = 0;

        for(Produk p : daftarProduk){
            total += p.hitungHargaAkhir();
        }

        return total;
    }

    /**
     * Mencetak struk yang berisi informasi produk dan total belanja
     */

    public void cetakStruk(){
        for(Produk p : daftarProduk){
            System.out.printf("%s | %s | %s | Rp%.0f%n", p.getKode(), p.getNama(), p.deskripsi(), p.hitungHargaAkhir());
        }

        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung dan menampilkan jumlah produk berdasarkan jenisnya
     */

    public void hitungPerJenis(){
        int jumlahFisik = 0;
        int jumlahDigital = 0;
        int jumlahLangganan = 0;

        for (Produk p : daftarProduk){
            if(p instanceof Langganan){
                Langganan langganan = (Langganan) p;
                jumlahLangganan++;
            }
            else if(p instanceof ProdukDigital){
                ProdukDigital digital = (ProdukDigital) p;
                jumlahDigital++;
            }
            else if(p instanceof ProdukFisik){
                ProdukFisik fisik = (ProdukFisik) p;
                jumlahFisik++;
            }
        }

        System.out.println("Fisik: " + jumlahFisik + ", Digital: " + jumlahDigital + ", Langganan: " + jumlahLangganan);
    }
}
