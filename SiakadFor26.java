import java.util.Scanner;

public class SiakadFor26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa, nilai;
        int tertinggi = 0;
        int terendah = 100;
        int lulus = 0;        
        int tidakLulus = 0;   
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextInt();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Nilai Tertinggi   : " + tertinggi);
        System.out.println("Nilai Terendah    : " + terendah);
        System.out.println("Jumlah Lulus      : " + lulus);
        System.out.println("Jumlah Tidak Lulus: " + tidakLulus);
        
        sc.close();
    }
}
