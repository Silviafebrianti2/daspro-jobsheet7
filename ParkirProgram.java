import java.util.Scanner;

public class ParkirProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenis = input.nextInt();

            if (jenis == 0) {
                break;
            }
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid. Masukkan hanya 1, 2, atau 0.");
            }

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
        System.out.println("Program selesai. Terima kasih!");
        
        input.close();
    }
}
