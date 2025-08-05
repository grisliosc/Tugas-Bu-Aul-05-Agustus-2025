import java.util.Scanner;

public class belanjabarang_grisli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama barang ; ");
        String namaBarang = input.nextLine();
        System.out.println("Masukkan harga barang ;");
        double hargaBarang = input.nextDouble();

        System.out.println("=============");
        System.out.println("Barang yang kamu beli adalah "+namaBarang+" dengan harga "+hargaBarang+" Rupiah");
    }
}
