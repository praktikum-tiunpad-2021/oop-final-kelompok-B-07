# Snake Game

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran. 

[Challenge Guidelines](challenge-guideline.md)

**Please create a description for this project here**

## Credits
| NPM           | Name        |
| ------------- |-------------|
| 140810200010  | Rizky Mahardika    |
| 140810200046  | M Nabil Fikri    |
| 140810200066  | Muthia Azzahra |

## Change log
- **[Sprint Planning](changelog/sprint-planning.md) - (16/11/2021)** 
   -  Diskusi awal
   - perencanaan changelog

- **[Sprint 1](changelog/sprint-1.md) - (date from 16/11/2021 to 22/11/2021)** 
   - Make a window
   - Creating 5 block snake

- **[Sprint 2](changelog/sprint-2.md) - (date from 23/11/2021 to 30/11/2021)** 
   - Generate random food
   - Create snake movement
   
- **[Sprint 3](changelog/sprint-3.md) - (date from 01/12/2021 to 07/12/2021)** 
   - Increase Snake Length when eating
   - Game over
   - Highscore
   - Leaderboard

## Running The App

Jalankan file utama dengan perintah :
gradle run

Tombol keyboard yang digunakan pada aplikasi :
- Gunakan tombol spasi untuk memulai dan mem-pause permainan
- Gunakan tombol panah atas, kanan, kiri, bawah untuk menggerakkan ular pada permainan
- Gunakan tombol shift untuk mempercepat gerak ular pada permainan

## Classes Used

https://user-images.githubusercontent.com/66240799/144626575-097e3c89-1165-4f45-998c-92f90c213e1f.jpg
![UML project oop](https://user-images.githubusercontent.com/66240799/144626575-097e3c89-1165-4f45-998c-92f90c213e1f.jpg)


## Notable Assumption and Design App Details

Desain Aplikasi
   - Tema warna default adalah putih (White).
   - Makanan ular akan muncul pada tempat yang random
   - Jika ular menabrak dinding atau menabrak tubuhnya sendiri, maka game akan selesai.
   - Ketika game selesai, maka akan muncul scorenya (setiap ular memakan makanannya, score bertambah 40 poin)
