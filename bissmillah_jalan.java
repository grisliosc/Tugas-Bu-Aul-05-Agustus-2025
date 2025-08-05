import java.util.Scanner;
public class bissmillah_jalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input barang 1
        System.out.print("Masukkan nama barang 1: ");
        String namaBarang1 = input.nextLine();
        System.out.print("Masukkan harga barang 1: ");
        double hargaBarang1 = input.nextDouble();

        // Validasi harga 1
        if (hargaBarang1 < 0) {
            System.out.println("Harga barang 1 tidak boleh negatif!");
            return;
        }

        input.nextLine(); // Buang newline

        // Input barang 2
        System.out.print("Masukkan nama barang 2: ");
        String namaBarang2 = input.nextLine();
        System.out.print("Masukkan harga barang 2: ");
        double hargaBarang2 = input.nextDouble();

        // Validasi harga 2
        if (hargaBarang2 < 0) {
            System.out.println("Harga barang 2 tidak boleh negatif!");
            return;
        }

        // Hitung total
        double total = hargaBarang1 + hargaBarang2;
        double diskon = 0;

        // Percabangan: Jika total di atas 100.000, beri diskon
        if (total >= 100000) {
            diskon = total * 0.1; // 10% diskon
            System.out.println("Kamu mendapatkan diskon 10%!");
        } else if (total >= 50000) {
            diskon = total * 0.05; // 5% diskon
            System.out.println("Kamu mendapatkan diskon 5%!");
        } else {
            System.out.println("Tidak ada diskon untuk total belanja kamu.");
        }

        double totalBayar = total - diskon;

        // Output hasil akhir
        System.out.println("=============");
        System.out.println("Barang yang kamu beli:");
        System.out.println("- " + namaBarang1 + " seharga " + hargaBarang1);
        System.out.println("- " + namaBarang2 + " seharga " + hargaBarang2);
        System.out.println("Total sebelum diskon: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total yang harus dibayar: " + totalBayar + " Rupiah");
    }
}

