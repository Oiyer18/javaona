//package ariketa2;

import java.util.Scanner;

/**
 * Akatsak aurkitu
 */
public class Debug3 {

	public static void main(String[] args) {

		int aukera = 0;
		double oper1 = 0;
		double oper2 = 0;
		double emaitza = 0;
		Scanner tekla = new Scanner(System.in);

		do {

			System.out.println(
					"Operazioak: Batu (1), Kendu (2), Biderkatu (3), Zatitu (4), Gainerakoa (5), Irten (6)");
			System.out.print("Aukera: ");
			aukera = tekla.nextInt();

			if (aukera == 6) {
				System.out.println("Programa AMAIERA");
			} else {

				System.out.print("Oper1: ");
				oper1 = tekla.nextDouble();

				System.out.print("Oper2: ");
				oper2 = tekla.nextDouble();

				if (aukera == 1) {
					emaitza = oper1 + oper2;
					System.out.println("Emaitza = " + emaitza);
				} else if (aukera == 2) {
					//oper1 = oper1 - oper2;
					emaitza=oper1-oper2;
					System.out.println("Emaitza = " + emaitza);
				} else if (aukera == 3) {
					// Biderketa aukera zatiketa aukera baino gero azaltzen zen
					emaitza = oper1 * oper2;
					System.out.println("Emaitza = " + emaitza);
				} else if (aukera == 4) {
					if (oper2 == 0) {
						//if operadore2==1 jartzen zuen 
						System.out.println("0 bidez ezin da zatitu");
						emaitza = 0;
					} else {
						emaitza = oper1 / oper2;
						System.out.println("emaizta= "+emaitza);
					}
				} else if (aukera == 5) {
					emaitza = oper1%oper2;
					//egiten ari zen oer1%oper1 oper1%oper2 ordez
					System.out.println("Emaitza = " + emaitza);
				}
				//aukera++ jartzen zuen 
			}

		} while (aukera != 6);
		tekla.close();
	}
}
