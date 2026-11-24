import java.util.Scanner;

public class kalkuladorairten {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Auk1;
        double a, b;
        do {
            System.out.println(
                    "Aukeratu eragiketa bat:\n  1.Batuketa     2.Kenketa\n 3.Biderketa   4.Zatiketa \n 5.Berreketa   6.Hondarra \n 7.Irten");
            Auk1 = sc.nextInt();
            // Aukera erabaki
            if (Auk1 != 7) {
                System.out.println("Sartu lehenengo zenbakia: ");
                a = sc.nextDouble();
                System.out.println("Sartu bigarren zenbakia: ");
                b = sc.nextDouble();
                // zenbakiak irakurri
                switch (Auk1) {
                    case 1:
                        // batuera kasua
                        double bat = a + b;
                        bat = Math.round(bat * 10) / 10;
                        System.out.println("Zenbakien batuera " + bat + " da.");
                        break;

                    case 2:
                        // kenketa kasua
                        double ken = a - b;
                        ken = Math.round(ken * 10) / 10;
                        System.out.println("Zenbakien kenketa " + ken + " da.");
                        break;

                    case 3:
                        // Biderketa kasua
                        double bid = a * b;
                        bid = Math.round(bid * 10) / 10;
                        System.out.println("Zenbakien biderketa " + bid + " da.");
                        break;

                    case 4:
                        // zatiketa kasua
                        if (b == 0) {
                            System.out.println("Ezin da 0-gatik zatitu");
                        } else {
                            double zat = a / b;
                            zat = Math.round(zat * 10) / 10;
                            System.out.println("Zenbakien zatiketa " + zat + " da.");
                        }
                        break;

                    case 5:
                        // berreketa kasua
                        double ber = Math.pow(a, b);
                        ber = Math.round(ber * 10) / 10;
                        System.out.println("Zenbakien berreketa " + ber + " da.");
                        break;

                    case 6:
                        // hondarra kasua
                        double hond = a % b;
                        if (b == 0) {
                            System.out.println("Ezin da 0 rekin zatitu beraz ezin da hondarra kalkulatu.");
                        } else {
                            System.out.println("Zenbakien arteko hondarra " + hond + " da.");
                        }
                        break;

                }
            }
        } while (Auk1 != 7);
        System.out.println("Eskerrikasko kalkulagailua erabiltzeagatik.");
        sc.close();
    }
}
