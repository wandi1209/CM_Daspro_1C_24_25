import java.util.Scanner;

public class ManajemenInventory {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        while (true) {
            System.out.println("===== MENU INVENTORI KAFE =====");
            System.out.println("1. Tampilkan Inventory");
            System.out.println("2. Tambah Stok Untuk Item Yang Ada");
            System.out.println("3. Tambah Item Baru");
            System.out.println("4. Keluar");
            System.out.print("Pilihan menu: ");
            int pilihan = input.nextInt();
            if (pilihan == 1) {
                viewData();
            } else if (pilihan == 2) {
                addStock();
            } else if (pilihan == 3) {
                newData();
            } else if (pilihan == 4) {
                System.exit(0);
            }
        }
    }

    static void viewData() {

    }

    static void addStock() {

    }

    static void newData() {

    }
}
