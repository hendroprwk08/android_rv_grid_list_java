# Mobile Programming: Java RecyclerView Master Class

Proyek ini merupakan aplikasi Android berbasis **Java** yang berfokus pada implementasi lanjutan komponen UI, khususnya fleksibilitas **RecyclerView** dalam menyajikan data.

## 🚀 Fokus Utama Proyek
Aplikasi ini mendemonstrasikan bagaimana mengelola data yang sama namun disajikan dengan pengalaman pengguna (UX) yang berbeda melalui:

*   **Dynamic Layout Manager**: Implementasi perpindahan tampilan antara **List View** (Linear) untuk detail yang lebih jelas, dan **Grid View** (Staggered/Grid) untuk tampilan yang lebih visual.
*   **Transition Animations**: Penggunaan animasi halus saat perpindahan antar layout atau saat berpindah layar (Activity), memberikan kesan aplikasi yang modern dan responsif.

## 🛠 Teknologi yang Digunakan
- **Language**: Java
- **UI Component**: RecyclerView (List & Grid Mode)
- **Design System**: Material 3 (M3)

## 📱 Tampilan Antarmuka (List & Grid)
Berikut adalah perbedaan tampilan antara mode List dan mode Grid yang diimplementasikan dalam aplikasi ini:

<p align="center">
  <img src="https://github.com/user-attachments/assets/73ba7602-cb87-48ea-9f0c-442b00c196c3" width="250" />
  <img src="https://github.com/user-attachments/assets/7e08dd6a-43ee-4767-b3ce-3d430298a481" width="250" />
</p>

## 📂 Konsep Pemrograman yang Diterapkan
1.  **RecyclerView Adapter**: Menggunakan satu adapter yang fleksibel untuk menangani berbagai tipe layout.
2.  **Layout Switching Logic**: Logika Java untuk mengganti `LayoutManager` secara runtime tanpa kehilangan posisi scroll pengguna.
3.  **Shared Element Transitions**: Animasi transisi antar elemen saat pengguna memilih buku dari daftar untuk masuk ke layar detail.

---
*Proyek ini merupakan bagian dari modul pembelajaran Mobile Programming dengan fokus pada optimasi UI/UX.*
