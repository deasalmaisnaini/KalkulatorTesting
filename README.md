# KalkulatorTesting
Project ini terdiri dari program kalkulator beserta automation testingnya yang menggunakan JUnit. Project ini dibuat untuk memenuhi penugasan mata kuliah pengujian perangkat lunak.

## Author
- Dea Salma Isnaini (211524038)
  
- Falia Davina Gustaman (211524041)
  
- Syifa Khairina (211524063)

## Tools
1. JUnit
   
2. JaCoCo

JaCoCo adalah library open source untuk Java yang didistribusikan di bawah lisensi publik Eclipse. Library ini biasanya digunakan pada project untuk mengukur cakupan unit test.
Semua tools ini dijalankan pada Gradle Environment

## Program Kalkulator

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

