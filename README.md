<a name="readme-top"></a>

[![GitHub contributors](https://img.shields.io/github/contributors/deasalmaisnaini/KalkulatorTesting.svg)](https://github.com/deasalmaisnaini/KalkulatorTesting/graphs/contributors)


<!-- TABLE OF CONTENTS -->
## Table of Contents
- [Table of Contents](#table-of-contents)
- [About The Project](#about-the-project)
  - [Method Aplikasi](#method-aplikasi)
  - [Pengujian JUnit \& JaCoCo](#pengujian-junit--jacoco)
  - [Author](#author)
  - [Tools](#tools)
- [Getting Started](#getting-started)
  - [Penggunaan](#penggunaan)
  - [Script for run](#script-for-run)
  - [Script for testing](#script-for-testing)
  - [Create Test Case](#create-test-case)
  - [Generate Report](#generate-report)

<!-- ABOUT THE PROJECT -->
## About The Project
Proyek ini adalah sebuah aplikasi kalkulator sederhana yang memungkinkan pengguna untuk melakukan operasi matematika dasar (tambah, kurang, kali, bagi) pada dua buah operand. Aplikasi ini dibangun menggunakan bahasa pemrograman Java dan manajemen proyek menggunakan Gradle. Pengujian dilakukan dengan menggunakan framework JUnit dan pengukuran cakupan pengujian dilakukan dengan JaCoCo.

### Method Aplikasi
Pengujian dilakukan per-method dengan daftar item uji sebagai berikut:
| No. | Nama Class | Nama Method |
| :---: | :--------- | :----------- |
| 1 | MainApp | Main |
| 2 | Calculator | add |
|   |         | subtract |
|   |         | multiply |
|   |         | divide |
| 3 | Validator | validateOperand |
|   |         | validateOperator |
|   |         | validateInput |
| 4 | Computation | compute |

### Pengujian JUnit & JaCoCo
- Pengujian dilakukan menggunakan JUnit untuk memastikan fungsionalitas kalkulator berjalan dengan benar. Hasil dari pengujian sebagai berikut:
  - Total test: 45
  - Successful: 45 (100%)
  - Failed: 0
  - Ignored: 9
  
  ![Laporan Pengujian JUnit](https://drive.google.com/uc?id=1n6vS36-tmDaNDwdzbOxkf7sq22NZzwye)

- Laporan JaCoCo digunakan untuk melihat cakupan pengujian kode dan memastikan kode teruji dengan baik. Cakupan pengujian kode dari laporan JaCoCo:
  - Coverage Instruction: 94%
  - Coverage Branch: 100%
  
  ![Laporan Pengujian Jacoco](https://drive.google.com/uc?id=1rNm1Tivz8q4NPLf6NH_0ySo4Hu3Ik53s)

  
### Author
- Dea Salma Isnaini (211524038)
  
- Falia Davina Gustaman (211524041)
  
- Syifa Khairina (211524063)

### Tools
* [![Gradle](https://img.shields.io/badge/Gradle-6.7.1-blue)](https://gradle.org/)
  Gradle digunakan sebagai build tool untuk mengelola proyek Java secara efisien. Versi yang digunakan adalah 6.7.1. [Kunjungi situs Gradle](https://gradle.org/) untuk informasi lebih lanjut.

* [![Java](https://img.shields.io/badge/Java-11-red)](https://www.java.com/)
  Java adalah bahasa pemrograman yang digunakan dalam proyek ini. Versi yang digunakan adalah Java 11. [Kunjungi situs Java](https://www.java.com/) untuk informasi lebih lanjut.

* [![JUnit](https://img.shields.io/badge/JUnit-4-green)](https://junit.org/)
  JUnit digunakan untuk menulis dan menjalankan unit test dalam proyek Java. Versi yang digunakan adalah JUnit 4. [Kunjungi situs JUnit](https://junit.org/) untuk informasi lebih lanjut.

* [![JaCoCo](https://img.shields.io/badge/JaCoCo-coverage-lightgrey)](https://www.jacoco.org/)
  JaCoCo adalah alat yang digunakan untuk menghasilkan laporan cakupan kode dalam proyek Java. JaCoCo digunakan untuk memastikan bahwa kode teruji dengan baik. [Kunjungi situs JaCoCo](https://www.jacoco.org/) untuk informasi lebih lanjut.


## Getting Started 
### Penggunaan
1. Pastikan Anda telah menginstal Java JDK versi 11 dan telah mendownload gradle versi 6.7.1.
2. Jika belum menginstall java dan gradle:
   -  Download Java : `https://www.oracle.com/id/java/technologies/javase/jdk11-archive-downloads.html`
   -  Download Gradle : `https://gradle.org/releases/
   -  Tambahkan Gradle dan Java pada system variable
   -  Periksa dengan mengetikan java --version untuk java dan gradle --version untuk gradle
4. Clone repositori ini ke perangkat.
5. Buka proyek menggunakan IDE.
   
### Script for run
```
gradle run
```

### Script for testing
1. Jacoco
```
./gradlew test jacocoTestReport
```
   
2. Junit
```
gradle test
```

### Generate Report
Setelah menjalankan perintah-perintah testing, laporan akan di-generate dan disimpan pada lokasi berikut:

1. **Laporan Pengujian JUnit**: `app\build\reports\tests\test\index.html`
2. **Laporan Pengujian JaCoCo**: `app\build\reports\jacoco\test\html\index.html`

### CREATE TEST CASE
1. **Buat file pengujian pada path**: `app\src\test\java\kalkulator`
2. **Buat method dengan anotasi @Test**
3. **Siapkan Test Data dan juga expected result**
4. **Panggil method yang akan diuji**
5. **Simpan hasil dari method yang diuji**
6. **Bandingkan hasil dari actual result dengan expected result**

