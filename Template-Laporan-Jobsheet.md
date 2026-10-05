# JOBSHEET 4 - PEMILIHAN 1

**Identitas Mahasiswa:**
* **Nama:** [Nama Mahasiswa]
* **NIM:** [NIM Mahasiswa]
* **Kelas / No. Presensi:** [1A / 01]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu memahami konsep dasar struktur pemilihan (*conditional statement*).
2. Mahasiswa mampu mengimplementasikan perintah `if`, `if-else`, dan `switch-case` pada Java.
3. Mahasiswa mampu menganalisis alur eksekusi logika percabangan.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Penerapan Struktur IF-ELSE

Ini adalah paragraf contoh yang menjelaskan gambaran singkat mengenai percobaan pertama. Pada bagian ini, mahasiswa diminta untuk menerapkan kondisi `if-else` sederhana.

#### 2.1.1 Kode Program Java
```java
// Contoh kode program dummy Percobaan 1
import java.util.Scanner;

public class Percobaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        if (nilai >= 75) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Contoh Gambar Output Percobaan 1](/contoh-gambar.png)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa fungsi dari perintah `if`?
  * **Jawab:** Perintah `if` digunakan untuk mengeksekusi sebuah blok kode hanya jika kondisi bernilai `true`.
* **Pertanyaan 2:** Apa yang terjadi jika kondisi bernilai `false`?
  * **Jawab:** Program akan melewati blok `if` dan mengeksekusi blok `else` (jika ada).

---

### 2.2 Percobaan 2: Penerapan Structure SWITCH-CASE

Paragraf ini menjelaskan ringkasan Percobaan 2. Percobaan ini berfokus pada penggunaan `switch-case` untuk memilih menu atau opsi berdasarkan nilai yang bersifat spesifik.

#### 2.2.1 Tabel Pengujian Parameter Output

Berikut adalah hasil uji coba program dengan beberapa variasi masukan *dummy*:

| No | Input Parameter | Output yang Dihasilkan | Status Eksekusi |
| :---: | :--- | :--- | :---: |
| 1 | `Case 1` | "Pilihan 1 Dipilih" | Valid |
| 2 | `Case 2` | "Pilihan 2 Dipilih" | Valid |
| 3 | `Default` | "Pilihan Tidak Tersedia" | Invalid |

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Mengubah struktur `if-else` menjadi *Ternary Operator*.
- [x] **Tugas 2:** Membuat program berdasarkan *Flowchart* penentuan SKS.
- [ ] **Tugas 3:** Mengimplementasikan studi kasus parkir & antrean.

### 3.1 Implementasi Kode Tugas

```java
// Contoh Kode Program Tugas Mandiri
public class TugasMandiri {
    public static void main(String[] args) {
        int sks = 20;
        String status = (sks <= 24) ? "KRS Valid" : "Melebihi Batas";
        System.out.println(status);
    }
}
```

---

## 4: KESIMPULAN

Tuliskan paragraf kesimpulan di sini. Secara singkat, struktur pemilihan sangat penting digunakan untuk mengatur alur jalannya program (*flow control*) berdasarkan variabel atau pilihan yang ditentukan oleh pengguna.
