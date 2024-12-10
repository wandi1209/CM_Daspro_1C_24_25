import java.util.Scanner;

public class ManajemenInventory {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        String[][] menu = new String[10][2];
        int[] stok = new int[10];

        while (true) {
            System.out.println("===== MENU INVENTORI KAFE =====");
            System.out.println("1. Tampilkan Inventory");
            System.out.println("2. Tambah Stok Untuk Item Yang Ada");
            System.out.println("3. Tambah Item Baru");
            System.out.println("4. Keluar");
            System.out.print("Pilihan menu: ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    viewData();
                    break;
                case 2:
                    addStock();
                    break;
                case 3:
                    newData(menu,stok);
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    static void viewData() {

    }

    static void addStock() {

    }

    static void newData(String[][] menu, int[] stok) {
        
    }
}
