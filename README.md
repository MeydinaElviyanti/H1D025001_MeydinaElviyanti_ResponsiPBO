# RESPONSI AKHIR PRAKTIKUM PBO

## Deskripsi Program

Permainan sederhana berbasis Java dengan tema Game Hero vs Enemy. 
Dalam permainan ini terdapat dua karakter Hero, yaitu Alucard dan Eudora, serta satu karakter Enemy, yaitu Lord. 
Setiap karakter memiliki kemampuan masing-masing, seperti menyerang, menggunakan skill khusus, dan menyembuhkan. 
Pertarungan berlangsung hingga salah satu karakter utama kalah, kemudian program akan menampilkan pemenangnya.

## 1. Identitas Mahasiswa

- Nama: Meydina Elviyanti
- NIM: H1D025002
- Tema: Game 

## 2. Struktur 
Project ResponsiPBO terdiri dari beberapa folder dan file, yaitu:

ResponsiPBO/
- Karakter.java
- Hero.java
- Enemy.java
- Penyerang.java
- Penyembuh.java
- Main.java
- README.md
- ssoutput(kedua).png
- ssoutput(pertama).png

## 3. Petunjuk Compile dan Run

Buka terminal pada folder utama project, kemudian jalankan perintah berikut.

**Compile:**
```bash
New-Item -ItemType Directory -Force out
javac -d out Karakter.java Penyerang.java Penyembuh.java Hero.java Enemy.java Main.java
```

**Run:**
```bash
java -cp out Main
```

## 4. Screenshot Luaran Program
Berikut merupakan screenshot hasil eksekusi program Game Hero vs Enemy yang menampilkan status awal karakter, proses pertarungan, hingga hasil akhir dan pemenang.
### Screenshot 1

![Screenshot Output 1](ssoutput(pertama).png)

### Screenshot 2

![Screenshot Output 2](ssoutput(kedua).png)
