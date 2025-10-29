public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.getAll();
        menu.Create("Nasi Goreng", 2);
        menu.Create("Nasi Goreng", 2, "Bakso", 3);
        menu.Create("Nasi Goreng", 2, "Mie Ayam", 1, "Es Teh", 2);
        menu.Create("Nasi Goreng", 2, "Ayam Bakar", 2, "Es Jeruk", 2, "Es Susu", 2);
        
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
            System.out.println("4. " + daftarMenu[3][0] + " - Rp" + daftarMenu[3][1]);

        System.out.println("\nMinuman:");
        if (daftarMenu[4][2].equals("Minuman"))
            System.out.println("1. " + daftarMenu[4][0] + " - Rp" + daftarMenu[4][1]);
        if (daftarMenu[5][2].equals("Minuman"))
            System.out.println("2. " + daftarMenu[5][0] + " - Rp" + daftarMenu[5][1]);
        if (daftarMenu[6][2].equals("Minuman"))
            System.out.println("3. " + daftarMenu[6][0] + " - Rp" + daftarMenu[6][1]);
        if (daftarMenu[7][2].equals("Minuman"))
            System.out.println("4. " + daftarMenu[7][0] + " - Rp" + daftarMenu[7][1]);
    }

    public void Create(Object... orders) {
        System.out.println("\n=========== STRUK ===========");
        double subtotal = 0;

        if (orders.length >= 2) {
            String name = (String) orders[0];
            int quantity = (int) orders[1];
            if (name.equals("Nasi Goreng")) 
                {  int quantityPrice = 10000 * quantity;
                    subtotal += 10000 * quantity; 
            System.out.println("Nasi Goreng Rp10000 " + quantity + " = Rp" + quantityPrice);
            }
            
            else if (name.equals("Mie Ayam")) 
                {   int quantityPrice = 12000 * quantity;
                    subtotal += 12000 * quantity; 
            System.out.println("Mie Ayam Rp12000 " + quantity + " = Rp" + quantityPrice);
            }
            
            else if (name.equals("Ayam Bakar"))
                {   int quantityPrice = 15000 * quantity;
                    subtotal += 15000 * quantity; 
            System.out.println("Ayam Bakar Rp15000 " + quantity + " = Rp" + quantityPrice);
            }

            else if (name.equals("Bakso"))
                {   int quantityPrice = 20000 * quantity;
                    subtotal += 20000 * quantity; 
            System.out.println("Bakso Rp20000 " + quantity + " = Rp" + quantityPrice);
            }

            else if (name.equals("Es Teh"))
                {   int quantityPrice = 5000 * quantity;
                    subtotal += 5000 * quantity; 
            System.out.println("Es Teh Rp5000 " + quantity + " = Rp" + quantityPrice);
            }

            else if (name.equals("Es Jeruk")) 
                {   int quantityPrice = 6000 * quantity;
                    subtotal += 6000 * quantity; 
            System.out.println("Es Jeruk Rp6000 " + quantity + " = Rp" + quantityPrice);
            }

            else if (name.equals("Es Susu")) 
                {   int quantityPrice = 8000 * quantity;
                    subtotal += 8000 * quantity; 
            System.out.println("Es Susu Rp8000 " + quantity + " = Rp" + quantityPrice);
            }

            else if (name.equals("Jus Alpukat"))
                {   int quantityPrice = 10000 * quantity;
                    subtotal += 10000 * quantity; 
            System.out.println("Jus Alpukat Rp10000 " + quantity + " = Rp" + quantityPrice);
            }
            else System.out.println("Menu \"" + name + "\" tidak ditemukan!");
        }

        if (orders.length >= 4) {
            String name2 = (String) orders[2];
            int quantity2 = (int) orders[3];
            if (name2.equals("Nasi Goreng")) 
                {  int quantityPrice = 10000 * quantity2;
                    subtotal += 10000 * quantity2; 
            System.out.println("Nasi Goreng Rp10000 " + quantity2 + " = Rp" + quantityPrice);
            }
            
            else if (name2.equals("Mie Ayam")) 
                {   int quantityPrice = 12000 * quantity2;
                    subtotal += 12000 * quantity2; 
            System.out.println("Mie Ayam Rp12000 " + quantity2 + " = Rp" + quantityPrice);
            }
            
            else if (name2.equals("Ayam Bakar"))
                {   int quantityPrice = 15000 * quantity2;
                    subtotal += 15000 * quantity2; 
            System.out.println("Ayam Bakar Rp15000 " + quantity2 + " = Rp" + quantityPrice);
            }

            else if (name2.equals("Bakso"))
                {   int quantityPrice = 20000 * quantity2;
                    subtotal += 20000 * quantity2; 
            System.out.println("Bakso Rp20000 " + quantity2 + " = Rp" + quantityPrice);
            }

            else if (name2.equals("Es Teh"))
                {   int quantityPrice = 5000 * quantity2;
                    subtotal += 5000 * quantity2; 
            System.out.println("Es Teh Rp5000 " + quantity2 + " = Rp" + quantityPrice);
            }

            else if (name2.equals("Es Jeruk")) 
                {   int quantityPrice = 6000 * quantity2;
                    subtotal += 6000 * quantity2; 
            System.out.println("Es Jeruk Rp6000 " + quantity2 + " = Rp" + quantityPrice);
            }

            else if (name2.equals("Es Susu")) 
                {   int quantityPrice = 8000 * quantity2;
                    subtotal += 8000 * quantity2; 
            System.out.println("Es Susu Rp8000 " + quantity2 + " = Rp" + quantityPrice);
            }

            else if (name2.equals("Jus Alpukat"))
                {   int quantityPrice = 10000 * quantity2;
                    subtotal += 10000 * quantity2; 
            System.out.println("Jus Alpukat Rp10000 " + quantity2 + " = Rp" + quantityPrice);
            }
            else System.out.println("Menu \"" + name2 + "\" tidak ditemukan!");
        }

        if (orders.length >= 6) {
            String name3 = (String) orders[4];
            int quantity3 = (int) orders[5];
            if (name3.equals("Nasi Goreng")) 
                {  int quantityPrice = 10000 * quantity3;
                    subtotal += 10000 * quantity3; 
            System.out.println("Nasi Goreng Rp10000 " + quantity3 + " = Rp" + quantityPrice);
            }
            
            else if (name3.equals("Mie Ayam")) 
                {   int quantityPrice = 12000 * quantity3;
                    subtotal += 12000 * quantity3; 
            System.out.println("Mie Ayam Rp12000 " + quantity3 + " = Rp" + quantityPrice);
            }
            
            else if (name3.equals("Ayam Bakar"))
                {   int quantityPrice = 15000 * quantity3;
                    subtotal += 15000 * quantity3; 
            System.out.println("Ayam Bakar Rp15000 " + quantity3 + " = Rp" + quantityPrice);
            }

            else if (name3.equals("Bakso"))
                {   int quantityPrice = 20000 * quantity3;
                    subtotal += 20000 * quantity3; 
            System.out.println("Bakso Rp20000 " + quantity3 + " = Rp" + quantityPrice);
            }

            else if (name3.equals("Es Teh"))
                {   int quantityPrice = 5000 * quantity3;
                    subtotal += 5000 * quantity3; 
            System.out.println("Es Teh Rp5000 " + quantity3 + " = Rp" + quantityPrice);
            }

            else if (name3.equals("Es Jeruk")) 
                {   int quantityPrice = 6000 * quantity3;
                    subtotal += 6000 * quantity3; 
            System.out.println("Es Jeruk Rp6000 " + quantity3 + " = Rp" + quantityPrice);
            }

            else if (name3.equals("Es Susu")) 
                {   int quantityPrice = 8000 * quantity3;
                    subtotal += 8000 * quantity3; 
            System.out.println("Es Susu Rp8000 " + quantity3 + " = Rp" + quantityPrice);
            }

            else if (name3.equals("Jus Alpukat"))
                {   int quantityPrice = 10000 * quantity3;
                    subtotal += 10000 * quantity3; 
            System.out.println("Jus Alpukat Rp10000 " + quantity3 + " = Rp" + quantityPrice);
            }
            else System.out.println("Menu \"" + name3 + "\" tidak ditemukan!");
        }

        if (orders.length >= 8) {
            String name4 = (String) orders[6];
            int quantity4 = (int) orders[7];
            if (name4.equals("Nasi Goreng")) 
                {  int quantityPrice = 10000 * quantity4;
                    subtotal += 10000 * quantity4; 
            System.out.println("Nasi Goreng Rp10000 " + quantity4 + " = Rp" + quantityPrice);
            }
            
            else if (name4.equals("Mie Ayam")) 
                {   int quantityPrice = 12000 * quantity4;
                    subtotal += 12000 * quantity4; 
            System.out.println("Mie Ayam Rp12000 " + quantity4 + " = Rp" + quantityPrice);
            }
            
            else if (name4.equals("Ayam Bakar"))
                {   int quantityPrice = 15000 * quantity4;
                    subtotal += 15000 * quantity4; 
            System.out.println("Ayam Bakar Rp15000 " + quantity4 + " = Rp" + quantityPrice);
            }

            else if (name4.equals("Bakso"))
                {   int quantityPrice = 20000 * quantity4;
                    subtotal += 20000 * quantity4; 
            System.out.println("Bakso Rp20000 " + quantity4 + " = Rp" + quantityPrice);
            }

            else if (name4.equals("Es Teh"))
                {   int quantityPrice = 5000 * quantity4;
                    subtotal += 5000 * quantity4; 
            System.out.println("Es Teh Rp5000 " + quantity4 + " = Rp" + quantityPrice);
            }

            else if (name4.equals("Es Jeruk")) 
                {   int quantityPrice = 6000 * quantity4;
                    subtotal += 6000 * quantity4; 
            System.out.println("Es Jeruk Rp6000 " + quantity4 + " = Rp" + quantityPrice);
            }

            else if (name4.equals("Es Susu")) 
                {   int quantityPrice = 8000 * quantity4;
                    subtotal += 8000 * quantity4; 
            System.out.println("Es Susu Rp8000 " + quantity4 + " = Rp" + quantityPrice);
            }

            else if (name4.equals("Jus Alpukat"))
                {   int quantityPrice = 10000 * quantity4;
                    subtotal += 10000 * quantity4; 
            System.out.println("Jus Alpukat Rp10000 " + quantity4 + " = Rp" + quantityPrice);
            }
            else System.out.println("Menu \"" + name4 + "\" tidak ditemukan!");
        }

        double tax = subtotal * 0.1;
        double service = 20000;
        double totalAfterTax = subtotal + tax + service;

        if (subtotal > 100000) {
        double discount = subtotal * 0.1;
        double Total = totalAfterTax - discount;

        
        System.out.println("\nSubtotal : Rp" + subtotal);
        System.out.println("Pajak (10%) : Rp" + tax);
        System.out.println("Service : Rp" + service);
        System.out.println("Diskon 10% : -Rp" + discount);
        System.out.println("Promo : Beli 1 Gratis 1 Minuman");
        System.out.println("-----------------------------");
        System.out.println("TOTAL BAYAR : Rp" + Total);
        System.out.println("=============================\n");

        } else if (subtotal > 50000) {

            System.out.println("\nSubtotal : Rp" + subtotal);
            System.out.println("Pajak (10%) : Rp" + tax);
            System.out.println("Service : Rp" + service);
            System.out.println("Promo : Beli 1 Gratis 1 Minuman");
            System.out.println("-----------------------------");
            System.out.println("TOTAL BAYAR : Rp" + totalAfterTax);
            System.out.println("=============================\n");

        } else {

            System.out.println("\nSubtotal : Rp" + subtotal);
            System.out.println("Pajak (10%) : Rp" + tax);
            System.out.println("Service : Rp" + service);
            System.out.println("-----------------------------");
            System.out.println("TOTAL BAYAR : Rp" + totalAfterTax);
            System.out.println("=============================\n");
        }


       
    }
}