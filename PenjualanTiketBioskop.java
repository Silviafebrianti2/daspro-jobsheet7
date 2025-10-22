import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPendapatan = 0;
        double diskon = 0;
        double hargaSetelahDiskon;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Harap masukkan angka 0 atau lebih.");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double potongan = totalHarga * diskon;
            hargaSetelahDiskon = totalHarga - potongan;

            totalTiket += jumlahTiket;
            totalPendapatan += hargaSetelahDiskon;

            System.out.println("Harga sebelum diskon: Rp " + totalHarga);
            System.out.println("Diskon: " + (diskon * 100) + "% (Rp " + potongan + ")");
            System.out.println("Total bayar: Rp " + hargaSetelahDiskon);
            System.out.println("-----------------------------------");

        } while (true);

        System.out.println("===== RINGKASAN PENJUALAN HARI INI =====");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
        System.out.println("========================================");
        
        input.close();
    }
}
