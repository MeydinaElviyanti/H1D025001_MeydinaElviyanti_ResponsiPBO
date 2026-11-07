# RESPONS I AKHIR PRAKTIKUM PBO

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

ResponsiPBO (folder utama)

README.md

screenshot-output.png

src (folder source code)

    responsi (package)

        Karakter.java

        Hero.java

        Enemy.java

        Penyerang.java

        Penyembuh.java

        Main.java

out (folder hasil compile program)

## 3. Petunjuk Compile dan Run

Buka terminal pada folder utama project, kemudian jalankan perintah berikut.

**Compile:**
```bash
javac -d out src/responsi/Karakter.java src/responsi/Penyerang.java src/responsi/Penyembuh.java src/responsi/Hero.java src/responsi/Enemy.java src/responsi/Main.java
```

**Run:**
```bash
java -cp out responsi.Main
```

## 4. Screenshot Luaran Program
Berikut merupakan screenshot hasil eksekusi program Game Hero vs Enemy yang menampilkan status awal karakter, proses pertarungan, hingga hasil akhir dan pemenang.
### Screenshot 1

![Screenshot Output 1](ssoutput(pertama).png)

### Screenshot 2

![Screenshot Output 2](ssoutput(kedua).png)