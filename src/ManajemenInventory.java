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
            System.out.println("\n===== MENU INVENTORI KAFE =====");
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
                    addStock(menu, stok);
                    break;
                case 3:
                    newData(menu, stok);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia. Silahkan coba lagi.");
            }
        }
    }

    static void viewData() {

    }

    static void addStock(String[][] menu, int[] stok) {
        System.out.println("\n===== TAMBAH STOK =====");
        System.out.print("Masukkan Nomor Item: ");
        int item = input.nextInt();

        if(item > menu.length || menu[item-1][0] == null) {
            System.out.println("Item tidak ditemukan. Silahkan coba lagi.");
        } else {
            System.out.print("Masukkan Jumlah Stok yang ingin ditambahkan: ");
            int tambah = input.nextInt();
    
            stok[item-1] += tambah;
            System.out.println("Stok " + menu[item-1][0] + " berhasil ditambah. Stok Sekarang: " + stok[item-1]);
        }
    }

    static void newData(String[][] menu, int[] stok) {
        
    }
}
