import java.util.Scanner;

public class belanjabarang_grisli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama barang 1 ; ");
        String namaBarang = input.nextLine();
        System.out.println("Masukkan harga barang 1 ;");
        double hargaBarang = input.nextDouble();
        input.nextLine();
        System.out.println("Masukkan nama barang 2 ; ");
        String namaBarang1 = input.nextLine();
        System.out.println("Masukkan harga barang 2 ;");
        double hargaBarang1 = input.nextDouble();

        System.out.println("=============");
        System.out.println("Barang yang kamu beli adalah "+namaBarang + " dan " +namaBarang1+" dengan harga "+hargaBarang+" dan " +hargaBarang1 + " Rupiah");
    }
}
