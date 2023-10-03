package uc_ve_dorte_bolunen_sayilarin_ort;

import java.util.Scanner;

public class uc_ve_dorte_bolunen_sayilarin_ort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayı girin: ");
		int x = scan.nextInt();

		int toplam = 0, y = 0, ortalama;
		for (int i = 0; i < x; i++) {
			if (i % 3 == 0 && i % 4 == 0) {

				toplam = +i;
				y++;
				System.out.print(i + " ");
			}

		}

		ortalama = toplam / y;

		System.out.println("Girilen sayıya kadar olan 3 ve 4'e bölünebilen sayıların ortalaması: " + ortalama);
	}
}
