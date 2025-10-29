public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.getAll();
        
    }
};

class Menu {

    Object[][] daftarMenu = {
        {"Nasi Goreng", 10000, "Makanan"},
        {"Mie Ayam", 12000, "Makanan"},
        {"Ayam Bakar", 15000, "Makanan"},
        {"Bakso", 20000, "Makanan"},
        {"Es Teh", 5000, "Minuman"},
        {"Es Jeruk", 6000, "Minuman"},
        {"Es Susu", 8000, "Minuman"},
        {"Jus Alpukat", 10000, "Minuman"}
    };

    public void getAll() {
        System.out.println("========== DAFTAR MENU ==========");
        System.out.println("Makanan:");
        if (daftarMenu[0][2].equals("Makanan"))
            System.out.println("1. " + daftarMenu[0][0] + " - Rp" + daftarMenu[0][1]);
        if (daftarMenu[1][2].equals("Makanan"))
            System.out.println("2. " + daftarMenu[1][0] + " - Rp" + daftarMenu[1][1]);
        if (daftarMenu[2][2].equals("Makanan"))
            System.out.println("3. " + daftarMenu[2][0] + " - Rp" + daftarMenu[2][1]);
        if (daftarMenu[3][2].equals("Makanan"))
            System.out.println("3. " + daftarMenu[3][0] + " - Rp" + daftarMenu[3][1]);

        System.out.println("\nMinuman:");
        if (daftarMenu[4][2].equals("Minuman"))
            System.out.println("1. " + daftarMenu[4][0] + " - Rp" + daftarMenu[4][1]);
        if (daftarMenu[5][2].equals("Minuman"))
            System.out.println("2. " + daftarMenu[5][0] + " - Rp" + daftarMenu[5][1]);
        if (daftarMenu[6][2].equals("Minuman"))
            System.out.println("3. " + daftarMenu[6][0] + " - Rp" + daftarMenu[6][1]);
        if (daftarMenu[7][2].equals("Minuman"))
            System.out.println("3. " + daftarMenu[7][0] + " - Rp" + daftarMenu[7][1]);
    }
}