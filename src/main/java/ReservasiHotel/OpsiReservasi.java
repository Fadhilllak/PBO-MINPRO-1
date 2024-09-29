package ReservasiHotel;

import java.util.Scanner;

public class OpsiReservasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== Menu Reservasi Hotel =====");
            System.out.println("1. Buat Reservasi");
            System.out.println("2. Lihat Reservasi");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear newline character

            switch (pilihan) {
                case 1:
                    // Buat reservasi
                    CreateReservasi reservasi = CreateReservasi.inputReservasi();
                    CreateReservasi.tambahReservasi(reservasi);
                    break;

                case 2:
                    // Lihat semua reservasi
                    LihatReservasi.tampilkanSemuaReservasi();
                    break;

                case 3:
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);
        
        scanner.close(); // Menutup scanner saat program selesai
    }
}
