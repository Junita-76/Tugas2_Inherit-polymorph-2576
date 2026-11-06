# Tugas 2 – Inheritance dan Polymorphism

## 1. Judul dan Identitas

- **Nama:** Junita Dwi Rahayu
- **NPM:** 250810701100076
- **Kelas Praktikum:** A
- **Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek

## 2. Deskripsi Singkat

Tugas ini membahas penerapan konsep Object-Oriented Programming (OOP) menggunakan bahasa Java. Materi yang diterapkan meliputi inheritance, polymorphism, method overriding, method overloading, composition, encapsulation, dan penggunaan collection.

Tugas terdiri dari empat soal yang masing-masing membahas konsep OOP melalui implementasi program dan pengujian menggunakan kelas `TesSoal`.

## 3. Fitur Utama

- Implementasi inheritance menggunakan superclass dan subclass.
- Penerapan method overriding dan method overloading.
- Penggunaan polymorphism melalui dynamic method dispatch.
- Penerapan composition dan defensive copy.
- Penggunaan `ArrayList` untuk menyimpan kumpulan objek.
- Validasi data dan penanganan exception.
- Pengujian program menggunakan kelas utama pada setiap soal.

## 4. Konsep OOP yang Diterapkan

| Konsep | Penerapan |
|---|---|
| Inheritance | Kelas `Laptop` mewarisi kelas `Perangkat`, serta kelas produk mewarisi kelas `Produk`. |
| Encapsulation | Penggunaan atribut dengan access modifier dan method untuk mengakses data. |
| Polymorphism | Pemanggilan method yang implementasinya berbeda sesuai objek sebenarnya. |
| Method Overriding | Subclass mendefinisikan kembali method dari superclass, seperti `suara()` dan `hitungHargaAkhir()`. |
| Method Overloading | Penggunaan beberapa constructor `Garis` dengan parameter berbeda. |
| Composition | Kelas `Garis` memiliki dua objek `Titik` sebagai titik awal dan titik akhir. |
| Defensive Copy | Penyalinan objek `Titik` agar perubahan objek dari luar tidak memengaruhi data internal `Garis`. |
| Exception Handling | Penggunaan exception untuk menangani kode produk duplikat dan data yang tidak valid. |
| Collection | Penggunaan `ArrayList` untuk menyimpan objek produk dalam keranjang. |

## 5. Struktur Project

```text
Tugas2_Inherit-polymorph-2576/
│
├── src/
│   ├── soal1/
│   │   ├── Perangkat.java
│   │   ├── Laptop.java
│   │   ├── Smartphone.java
│   │   └── TesSoal1.java
│   │
│   ├── soal2/
│   │   ├── Hewan.java
│   │   ├── Kucing.java
│   │   ├── A.java
│   │   ├── B.java
│   │   ├── Titik.java
│   │   ├── Lingkaran.java
│   │   └── TesSoal2.java
│   │
│   ├── soal3/
│   │   ├── Titik.java
│   │   ├── Garis.java
│   │   └── TesSoal3.java
│   │
│   └── soal4/
│       ├── Produk.java
│       ├── ProdukFisik.java
│       ├── ProdukDigital.java
│       ├── Langganan.java
│       ├── Keranjang.java
│       └── TesSoal4.java
│
├── out/
├── README.md
└── .gitignore

## 6. Prasyarat

Untuk menjalankan seluruh program pada tugas ini, diperlukan beberapa perangkat lunak dan kebutuhan berikut.

### A. Java Development Kit (JDK)

JDK digunakan untuk melakukan kompilasi dan menjalankan program Java. Kompilasi dilakukan menggunakan perintah `javac`, sedangkan eksekusi program dilakukan menggunakan perintah `java`.

Untuk memastikan JDK telah terpasang, jalankan perintah berikut pada terminal:

~~~powershell
java -version
javac -version
~~~

Jika kedua perintah menampilkan informasi versi Java, JDK telah tersedia dan dapat digunakan.

### B. Visual Studio Code

Visual Studio Code digunakan sebagai editor untuk menulis, mengelola, dan menjalankan kode Java. Folder project dibuka melalui Visual Studio Code agar seluruh package dan file dapat dikelola dalam satu workspace.

### C. Terminal

Terminal digunakan untuk melakukan proses kompilasi dan menjalankan program. Pada sistem operasi Windows, terminal yang digunakan dalam pengerjaan tugas ini adalah PowerShell.

### D. Folder Project

Seluruh file Java harus disimpan sesuai dengan package masing-masing, yaitu `soal1`, `soal2`, `soal3`, dan `soal4` di dalam folder `src`.

## 7. Cara Menjalankan Program

Program dijalankan melalui terminal dengan tahapan kompilasi dan eksekusi. Seluruh perintah berikut dilakukan dari direktori utama repository.

### A. Membuka Project

Buka folder project melalui Visual Studio Code, kemudian buka terminal melalui menu Terminal > New Terminal.

Pastikan terminal berada di direktori utama project, yaitu direktori yang berisi folder `src` dan file `README.md`.

### B. Kompilasi Seluruh Program

Jalankan perintah berikut untuk mengompilasi seluruh file Java pada keempat package:

~~~powershell
javac -d out src/soal1/*.java src/soal2/*.java src/soal3/*.java src/soal4/*.java
~~~

Keterangan:
- `javac` digunakan untuk mengompilasi file Java.
- `-d out` menentukan folder penyimpanan hasil kompilasi.
- `src/soal1/*.java` sampai `src/soal4/*.java` menunjukkan seluruh file Java yang akan dikompilasi.

Jika tidak terdapat pesan error, proses kompilasi berhasil.

### C. Menjalankan Soal 1

~~~powershell
java -cp out soal1.TesSoal1
~~~

Perintah tersebut menjalankan kelas `TesSoal1` yang berisi pengujian program soal pertama.

### D. Menjalankan Soal 2

~~~powershell
java -cp out soal2.TesSoal2
~~~

Perintah tersebut menjalankan kelas `TesSoal2` untuk menguji inheritance, overriding, casting, polymorphism, dan dynamic method dispatch.

### E. Menjalankan Soal 3

~~~powershell
java -cp out soal3.TesSoal3
~~~

Perintah tersebut menjalankan kelas `TesSoal3` untuk menguji composition, aliasing, dan defensive copy.

### F. Menjalankan Soal 4

~~~powershell
java -cp out soal4.TesSoal4
~~~

Perintah tersebut menjalankan kelas `TesSoal4` untuk menguji pengelolaan produk, perhitungan harga, polymorphism, dan penggunaan collection.

Setiap soal dapat dijalankan secara terpisah setelah seluruh program berhasil dikompilasi.

## 8. Hasil Pengujian Program

Bagian ini menampilkan output aktual yang diperoleh setelah program dijalankan menggunakan kode akhir yang telah diperbaiki.

### A. Soal 1

~~~text
Asus | garansi 24 bulan | RAM 16 GB | layar 14.0 inci
Samsung | garansi 12 bulan | 128 GB | 3 kamera
MSI | garansi 18 bulan | RAM 32 GB | layar 15.6 inci | GPU RTX 4060
Pajak laptop: Rp800000
Promo laptop 10 persen: Rp7200000
~~~

Hasil pengujian menunjukkan bahwa program berhasil menampilkan informasi perangkat beserta hasil perhitungan pajak dan harga promo.

### B. Soal 2

~~~text
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Hewan dibuat: Generik
h2 bukan objek Kucing
A dibuat
init B, nilai=0
B dibuat, nilai=5
78.53981633974483
0.0
0.0
~~~

Hasil pengujian menunjukkan bahwa program berhasil dijalankan tanpa `ClassCastException` setelah dilakukan perbaikan menggunakan `instanceof`. Program juga menampilkan hasil pengujian constructor dan dynamic method dispatch.

### C. Soal 3

~~~text
(0.0, 0.0) - (3.0, 4.0) panjang=5.0
(1.0, 1.0) - (5.0, 5.0)
~~~

Hasil pengujian menunjukkan bahwa panjang garis berhasil dihitung sebesar `5.0`. Perubahan koordinat pada objek titik dari luar juga tidak memengaruhi titik yang tersimpan di dalam objek garis setelah penerapan defensive copy.

### D. Soal 4

~~~text
F01 | Keyboard Mekanik | fisik 1.5 kg | Rp515000
D01 | Ebook Java | digital 20.0 MB | Rp90000
L01 | Kelas Online | langganan 12 bulan | Rp1440000
TOTAL: Rp2045000
Fisik: 1, Digital: 1, Langganan: 1
Gagal: Kode produk sudah ada
~~~

Hasil pengujian menunjukkan bahwa setiap produk berhasil menampilkan deskripsi dan harga akhir sesuai jenisnya. Program juga berhasil menghitung total harga, jumlah produk berdasarkan jenis, serta menolak penambahan produk dengan kode yang sudah digunakan.

## 9. Jawaban Soal dan Analisis Pengujian

Bagian ini memuat prediksi sebelum program dijalankan, hasil aktual setelah pengujian, dan analisis kesesuaian antara keduanya.

### A. Soal 1 – Pengujian Access Modifier

**Prediksi sebelum dijalankan**

Apabila atribut `harga` pada kelas `Perangkat` diubah menjadi `private`, method `hitungHargaPromo()` pada kelas `Laptop` diperkirakan akan mengalami compile-time error. Hal tersebut terjadi karena atribut dengan access modifier `private` hanya dapat diakses secara langsung dari dalam kelas yang mendeklarasikannya, sehingga tidak dapat diakses langsung oleh subclass.

**Hasil setelah dijalankan**

~~~text
src\soal1\Laptop.java:38: error: harga has private access in Perangkat
     return harga - (harga * diskonPersen / 100);
           ^
src\soal1\Laptop.java:38: error: harga has private access in Perangkat
     return harga - (harga * diskonPersen / 100);
                    ^
2 errors
~~~

**Analisis**

Hasil pengujian sesuai dengan prediksi. Compiler menghasilkan error karena atribut `harga` memiliki access modifier `private`, sedangkan method yang mengaksesnya berada pada kelas `Laptop` yang merupakan subclass dari `Perangkat`. Oleh karena itu, atribut tersebut tidak dapat diakses secara langsung dari kelas `Laptop`. Penggunaan `protected` memungkinkan subclass mengakses atribut tersebut secara langsung.

### B. Soal 2 – Polymorphism dan Inheritance

#### 1. Prediksi Output Program Sebelum Dijalankan

**Prediksi**

Program diperkirakan menghasilkan output berikut sebelum mengalami `ClassCastException`.

~~~text
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
Exception in thread "main" java.lang.ClassCastException
~~~

Program diperkirakan mengalami `ClassCastException` ketika baris `Kucing k2 = (Kucing) h2;` dijalankan karena objek `h2` merupakan objek dari kelas `Hewan`, bukan `Kucing`. Dengan demikian, proses casting tidak dapat dilakukan dan pemanggilan method `k2.panjat()` tidak dapat dilanjutkan.

**Hasil setelah dijalankan**

Program berhasil dikompilasi, tetapi mengalami error ketika dijalankan.

~~~text
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
Exception in thread "main" java.lang.ClassCastException: class soal2.Hewan cannot be cast to class soal2.Kucing (soal2.Hewan and soal2.Kucing are in unnamed module of loader 'app')
    at soal2.TesSoal2.main(TesSoal2.java:19)
~~~

**Analisis**

Hasil pengujian sesuai dengan prediksi. Program berhasil menjalankan proses pembuatan objek `Kucing`, pemanggilan method `makan()`, overriding method `suara()`, dan pemanggilan method `panjat()` melalui hasil downcasting objek `h`. Namun, program berhenti ketika melakukan casting objek `h2` dari kelas `Hewan` menjadi `Kucing`. Hal ini menyebabkan `ClassCastException` karena objek `h2` sebenarnya merupakan objek `Hewan`, bukan `Kucing`.

#### 2. Error yang Muncul Jika Komentar `h.panjat()` Dihapus

**Prediksi**

Diprediksi terjadi compile-time error karena variabel `h` bertipe `Hewan`, sedangkan method `panjat()` hanya dimiliki oleh kelas `Kucing`. Meskipun objek yang dibuat adalah `Kucing`, method tersebut tidak dapat dipanggil melalui variabel yang bertipe `Hewan`.

**Hasil setelah dijalankan**

~~~text
src\soal2\TesSoal2.java:11: error: cannot find symbol
    h.panjat();
     ^
  symbol:   method panjat()
  location: variable h of type Hewan
1 error
~~~

**Analisis**

Hasil pengujian sesuai dengan prediksi. Terjadi compile-time error karena variabel `h` bertipe `Hewan`, sedangkan method `panjat()` hanya tersedia pada kelas `Kucing`. Meskipun objek yang dibuat adalah `Kucing`, method tersebut tidak dapat dipanggil melalui variabel yang bertipe `Hewan`. Compiler memeriksa method berdasarkan tipe referensi sehingga method `panjat()` tidak dikenali pada tipe `Hewan`.

#### 3. Baris yang Menyebabkan ClassCastException dan Cara Memperbaikinya

**Prediksi**

Baris yang diperkirakan menyebabkan `ClassCastException` adalah:

~~~java
Kucing k2 = (Kucing) h2;
~~~

Kesalahan terjadi karena objek `h2` merupakan objek `Hewan`, bukan `Kucing`. Perbaikannya adalah menggunakan `instanceof` untuk memeriksa tipe objek sebelum melakukan casting, sehingga casting hanya dilakukan jika objek benar-benar merupakan instance dari `Kucing`.

**Hasil setelah diuji**

Program berhasil dikompilasi dan dijalankan tanpa `ClassCastException`. Output yang dihasilkan:

~~~text
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Hewan dibuat: Generik
h2 bukan objek Kucing
A dibuat
init B, nilai=0
B dibuat, nilai=5
78.53981633974483
0.0
0.0
~~~

**Analisis**

Hasil pengujian sesuai dengan prediksi. Baris casting diperbaiki dengan menambahkan pemeriksaan `instanceof` sebelum melakukan downcasting. Karena `h2` bukan objek `Kucing`, kondisi menghasilkan `false` dan program menjalankan blok `else` dengan menampilkan pesan `h2 bukan objek Kucing`. Dengan demikian, penggunaan `instanceof` berhasil mencegah `ClassCastException`.

#### 4. Method `suara()` yang Dijalankan

**Prediksi dan analisis**

Method `suara()` yang dijalankan adalah method milik kelas `Kucing`, meskipun variabel referensi `h` bertipe `Hewan`. Hal ini terjadi karena objek sebenarnya yang dibuat adalah `Kucing`, dan kelas tersebut melakukan overriding terhadap method `suara()` milik kelas `Hewan`.

**Hasil setelah dijalankan**

Output yang menunjukkan pemanggilan method tersebut adalah:

~~~text
Tom makan
meong
meong
~~~

Hasil tersebut menunjukkan penerapan dynamic method dispatch. Ketika method `suara()` dipanggil, Java menjalankan implementasi berdasarkan jenis objek sebenarnya, yaitu `Kucing`, bukan berdasarkan tipe referensi `Hewan`.

#### 5. Prediksi Output `new B()`

**Prediksi sebelum dijalankan**

~~~text
A dibuat
init B, nilai=0
B dibuat, nilai=5
~~~

Ketika objek `B` dibuat, constructor kelas `A` akan dijalankan terlebih dahulu. Constructor `A` memanggil method `init()` yang dioverride oleh kelas `B`. Pada saat itu, atribut `nilai` milik kelas `B` belum diinisialisasi sehingga masih menggunakan nilai default `0`. Setelah constructor `A` selesai, atribut `nilai` diinisialisasi menjadi `5`, kemudian constructor `B` menampilkan nilainya.

**Hasil setelah dijalankan**

~~~text
A dibuat
init B, nilai=0
B dibuat, nilai=5
~~~

**Analisis**

Hasil pengujian sama dengan prediksi. Nilai `nilai` pada pemanggilan `init B` masih `0` karena constructor kelas `A` memanggil method `init()` milik kelas `B` sebelum atribut `nilai` diinisialisasi. Risiko memanggil method yang dapat dioverride dari dalam constructor adalah method subclass dapat dijalankan sebelum objek selesai diinisialisasi. Akibatnya, method tersebut dapat mengakses atribut yang belum siap dan menimbulkan perilaku yang tidak diharapkan.

#### 6. Pengujian Method `luas()` dan Prinsip Liskov Substitution

**Prediksi sebelum dijalankan**

Output yang diharapkan:

~~~text
78.53981633974483
0.0
0.0
~~~

Pada objek `l3`, tipe referensinya adalah `Lingkaran`, sedangkan tipe objek sebenarnya adalah `Titik`. Ketika `l3.luas()` dipanggil, Java menjalankan method `luas()` milik kelas `Titik` karena method tersebut dioverride. Oleh karena itu, hasilnya adalah `0.0`, bukan luas lingkaran.

Hubungan is-a antara `Titik` dan `Lingkaran` tidak tepat karena titik bukan merupakan lingkaran. Jika `Titik` dijadikan turunan `Lingkaran`, program yang mengharapkan objek `Lingkaran` dengan luas positif bisa menerima objek `Titik` yang menghasilkan luas `0.0`. Hal ini dapat menyebabkan hasil yang tidak sesuai harapan dan melanggar prinsip substitusi Liskov (Liskov Substitution Principle).

**Hasil setelah dijalankan**

~~~text
78.53981633974483
0.0
0.0
~~~

**Analisis**

Hasil pengujian sesuai dengan output yang diprediksi. Objek `l1` menghasilkan luas lingkaran sebesar `78.53981633974483`, sedangkan objek `l2` dan `l3` menghasilkan `0.0` karena method `luas()` yang dijalankan merupakan implementasi milik kelas `Titik`.

### C. Soal 3 – Composition dan Aliasing

#### 1. Prediksi Output Sebelum Menggunakan Defensive Copy

**Prediksi**

Pada baris kedua diperkirakan akan dicetak:

~~~text
(100.0, 1.0) - (5.0, 5.0)
~~~

Hal ini terjadi karena `Garis` menyimpan referensi ke objek `Titik` yang sama dengan variabel `t`. Ketika `t.setX(100)` dipanggil, koordinat x pada titik yang digunakan oleh `g2` ikut berubah.

**Hasil setelah dijalankan**

~~~text
(0.0, 0.0) - (3.0, 4.0) panjang=5.0
(100.0, 1.0) - (5.0, 5.0)
~~~

**Analisis**

Hasil pengujian sesuai dengan prediksi. Pada baris kedua tercetak `(100.0, 1.0) - (5.0, 5.0)` karena objek `Garis` masih menyimpan referensi ke objek `Titik` yang sama dengan variabel `t`. Ketika koordinat x pada objek `t` diubah menjadi `100` menggunakan `setX(100)`, perubahan tersebut juga terlihat pada objek `Garis` (`g2`). Hal ini menunjukkan terjadinya aliasing.

#### 2. Prediksi Output Setelah Menggunakan Defensive Copy

**Prediksi**

Setelah constructor `Garis` menggunakan defensive copy, output baris kedua diperkirakan menjadi:

~~~text
(1.0, 1.0) - (5.0, 5.0)
~~~

Hal ini karena `Garis` menyimpan salinan objek `Titik`, bukan referensi langsung ke objek `t`. Dengan demikian, ketika `t.setX(100)` dipanggil, perubahan koordinat x pada objek `t` tidak akan memengaruhi titik yang tersimpan di dalam `g2`.

**Hasil setelah dijalankan**

~~~text
(0.0, 0.0) - (3.0, 4.0) panjang=5.0
(1.0, 1.0) - (5.0, 5.0)
~~~

**Analisis**

Hasil pengujian sesuai dengan prediksi. Setelah constructor `Garis` menggunakan defensive copy, perubahan koordinat x pada objek `t` menjadi `100` tidak memengaruhi titik yang tersimpan di dalam `g2`. Hal ini terjadi karena `Garis` menyimpan salinan objek `Titik`, sehingga perubahan pada objek asli tidak mengubah salinannya.

#### 3. Kapan Perilaku Sebelum dan Sesudah Perbaikan Lebih Tepat Digunakan?

Perilaku sebelum perbaikan lebih tepat digunakan ketika perubahan pada objek `Titik` memang diharapkan ikut memengaruhi objek `Garis` yang menyimpan referensinya. Sementara itu, perilaku sesudah perbaikan menggunakan defensive copy lebih tepat ketika objek `Garis` harus memiliki data titik sendiri dan tidak boleh terpengaruh oleh perubahan objek dari luar. Dengan demikian, penggunaan keduanya bergantung pada kebutuhan program. Jika objek perlu berbagi data, perilaku sebelum perbaikan dapat digunakan, sedangkan jika objek harus menjaga datanya agar tetap mandiri, defensive copy lebih tepat.

#### 4. Masalah Jika `Garis` Dibuat dengan `extends Titik`

Jika kelas `Garis` dibuat dengan `extends Titik`, akan muncul masalah pada hubungan antarobjek karena garis bukan merupakan jenis titik (is-a). Garis seharusnya memiliki dua objek titik, yaitu titik awal dan titik akhir (has-a). Jika menggunakan inheritance, `Garis` hanya mewarisi atribut dan method dari satu objek `Titik`, sehingga tidak dapat merepresentasikan kedua ujung garis dengan tepat. Oleh karena itu, composition lebih sesuai digunakan karena `Garis` dapat menyimpan dua objek `Titik` sebagai bagian dari penyusunnya.

### D. Soal 4 – Inheritance, Polymorphism, dan Collection

Soal keempat menerapkan inheritance melalui kelas `Produk` sebagai superclass dan kelas `ProdukFisik`, `ProdukDigital`, serta `Langganan` sebagai subclass. Setiap subclass memiliki aturan perhitungan harga akhir dan deskripsi masing-masing melalui method overriding.

Kelas `Keranjang` menggunakan `ArrayList<Produk>` untuk menyimpan berbagai jenis produk. Method `cetakStruk()` dan `hitungTotal()` memanfaatkan polymorphism sehingga setiap objek dapat menjalankan method sesuai dengan implementasi kelasnya. Sementara itu, `hitungPerJenis()` menggunakan `instanceof` dan downcasting untuk membedakan serta menghitung jumlah produk berdasarkan jenisnya.

Pengujian juga menunjukkan bahwa validasi kode produk duplikat berhasil dilakukan dengan melempar `IllegalStateException`. Selain itu, validasi harga dasar negatif dan nama kosong dilakukan menggunakan `IllegalArgumentException`.

### E. Analisis Konsep OOP

#### 1. Perbedaan Method Overriding dan Method Overloading

Method overriding adalah kondisi ketika subclass mendefinisikan kembali method dari superclass dengan nama dan parameter yang sama. Contohnya terdapat pada kelas `Kucing` yang mengubah implementasi method `suara()` dari kelas `Hewan` menjadi menampilkan "meong". Sementara itu, method overloading adalah penggunaan beberapa method atau constructor dengan nama yang sama, tetapi memiliki parameter yang berbeda. Contohnya terdapat pada kelas `Garis` yang memiliki dua constructor, yaitu `Garis(Titik awal, Titik akhir)` dan `Garis(double x1, double y1, double x2, double y2)`. Overriding berkaitan dengan inheritance dan mendukung polymorphism, sedangkan overloading memungkinkan penggunaan nama method atau constructor yang sama dengan cara pemanggilan berbeda.

#### 2. Kapan Memilih Inheritance dan Kapan Memilih Composition?

Inheritance digunakan ketika terdapat hubungan is-a, yaitu suatu kelas merupakan jenis khusus dari kelas lain dan dapat mewarisi atribut serta method-nya. Contohnya, `ProdukFisik` dan `ProdukDigital` merupakan turunan dari kelas `Produk` karena keduanya merupakan jenis produk. Sementara itu, composition digunakan ketika suatu objek memiliki atau tersusun dari objek lain (has-a). Contohnya, kelas `Garis` memiliki dua objek `Titik`, yaitu titik awal dan titik akhir. Dengan demikian, inheritance cocok untuk hubungan pewarisan, sedangkan composition cocok untuk menyusun suatu objek dari objek lainnya.

#### 3. Mengapa `cetakStruk()` Tidak Memerlukan `instanceof`, Sedangkan `hitungPerJenis()` Memerlukannya?

Method `cetakStruk()` tidak memerlukan `instanceof` karena menggunakan polymorphism untuk memanggil method `deskripsi()` dan `hitungHargaAkhir()` sesuai dengan jenis objek produk yang tersimpan dalam keranjang. Setiap subclass sudah memiliki implementasi method masing-masing sehingga Java dapat menjalankan method yang sesuai secara otomatis. Sementara itu, `hitungPerJenis()` memerlukan `instanceof` karena harus membedakan dan menghitung jumlah produk berdasarkan jenisnya, seperti produk fisik, digital, dan langganan. Downcasting tidak selalu aman karena objek yang akan diubah tipenya belum tentu merupakan instance dari kelas tujuan, sehingga dapat menyebabkan `ClassCastException`. Oleh karena itu, pemeriksaan `instanceof` dilakukan sebelum downcasting untuk memastikan tipe objek sesuai.

## 10. Batasan dan Pengembangan Lanjutan

### A. Batasan Program

Program ini dibuat untuk memenuhi kebutuhan latihan penerapan konsep Object-Oriented Programming menggunakan bahasa Java. Oleh karena itu, terdapat beberapa batasan dalam implementasinya.

1. **Penggunaan Terminal**

   Program dijalankan melalui terminal dan belum menggunakan antarmuka grafis (GUI). Interaksi dengan program masih dilakukan melalui proses eksekusi dan output berbentuk teks.

2. **Penyimpanan Data**

   Data perangkat, titik, garis, dan produk masih dibuat melalui kode program. Program belum menggunakan database atau penyimpanan permanen sehingga data tidak disimpan secara otomatis setelah program dihentikan.

3. **Pengelolaan Produk**

   Pada soal keempat, keranjang sudah dapat menambahkan produk, menghitung total harga, mencetak struk, dan menghitung jumlah produk berdasarkan jenisnya. Namun, fitur pengelolaan seperti mengubah dan menghapus produk belum diterapkan.

4. **Validasi Input**

   Program telah menerapkan validasi terhadap beberapa kondisi, seperti kode produk duplikat, harga dasar negatif, dan nama kosong. Namun, validasi masih dapat dikembangkan untuk menangani lebih banyak kemungkinan kesalahan input.

5. **Pengujian Program**

   Pengujian dilakukan melalui kelas `TesSoal1`, `TesSoal2`, `TesSoal3`, dan `TesSoal4`. Pengujian tersebut digunakan untuk memeriksa perilaku program sesuai dengan konsep yang dipelajari, tetapi belum menggunakan framework automated testing khusus.

### B. Pengembangan Lanjutan

Berdasarkan batasan tersebut, terdapat beberapa pengembangan yang dapat dilakukan agar program menjadi lebih lengkap.

1. **Menambahkan Antarmuka Grafis**

   Program dapat dikembangkan menggunakan Java Swing atau JavaFX agar pengguna dapat berinteraksi melalui tampilan aplikasi tanpa harus menjalankan perintah melalui terminal.

2. **Mengintegrasikan Database**

   Penyimpanan data dapat dikembangkan menggunakan database seperti MySQL atau SQLite agar data produk dapat disimpan dan diakses kembali meskipun program telah dihentikan.

3. **Menambahkan Fitur Pengelolaan Produk**

   Kelas `Keranjang` dapat dikembangkan dengan fitur untuk mengubah, menghapus, dan mencari produk berdasarkan kode sehingga pengelolaan produk menjadi lebih fleksibel.

4. **Mengembangkan Validasi dan Penanganan Kesalahan**

   Validasi dapat diperluas untuk menangani berbagai kondisi input yang tidak sesuai. Penanganan exception juga dapat dikembangkan agar pesan kesalahan lebih informatif dan mudah dipahami pengguna.

5. **Menambahkan Automated Testing**

   Pengujian dapat dikembangkan menggunakan framework seperti JUnit untuk memastikan setiap method berjalan sesuai harapan dan membantu mendeteksi kesalahan ketika kode mengalami perubahan.

Dengan pengembangan tersebut, program yang awalnya dibuat untuk mempelajari konsep dasar OOP dapat dikembangkan menjadi aplikasi yang lebih terstruktur, mudah digunakan, dan memiliki fungsi yang lebih lengkap.