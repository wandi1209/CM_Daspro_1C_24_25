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
            input.nextLine();

            switch (pilihan) {
                case 1:
                    viewData(menu, stok);
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

    static void viewData(String[][] menu, int[] stok) {
        System.out.println("===== DATA INVENTORI =====");
        System.out.printf("%-5s %-15s %-15s %-15s", "No", "Nama Item", "Kategori", "Stok");
        System.out.println("\n---------------------------------------------------------------------------");
        for (int i = 0; i < menu.length; i++) {
                System.out.printf("%-5d %-15s %-15s %-15d", (i+1), (menu[i][0]), (menu[i][1]), (stok[i]));
               
        }        
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
        System.out.println("===== TAMBAH ITEM BARU =====");
        System.out.print("Masukkan nama item baru: ");
        String menuBaru = input.nextLine();
        System.out.print("Masukkan kategori item baru: ");
        String kategoriBaru = input.nextLine();
        System.out.print("Masukkan jumlah stok awal: ");
        int stokBaru = input.nextInt();
        System.out.printf("Item baru berhasil ditambahkan: %s (%s) - Stok: %d\n", menuBaru, kategoriBaru, stokBaru);
        
        viewData(menu, stok);
    }
}
