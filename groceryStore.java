package java101;

import java.util.Scanner;

public class Manav {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		double armutTutar=2.14,elmaTutar=3.67,domatesTutar=1.11,
				muzTutar=0.95,patlicanTutar=5.00;
		double sonuc;
		
		System.out.print("Armut kilosunu giriniz: ");
		double armutKg = inp.nextDouble();
		System.out.print("Elma kilosunu giriniz: ");
		double elmaKg = inp.nextDouble();
		System.out.print("Domates kilosunu giriniz: ");
		double domatesKg = inp.nextDouble();
		System.out.print("Muz kilosunu giriniz: ");
		double muzKg = inp.nextDouble();
		System.out.print("Patlıcan kilosunu giriniz: ");
		double patlicanKg = inp.nextDouble();
		
		sonuc = (armutKg * armutTutar) + (elmaKg * elmaTutar) + 
				(domatesKg * domatesTutar) + (muzKg * muzTutar) +
				(patlicanKg * patlicanTutar);
		
		System.out.println("Toplam Tutar : " + sonuc + "TL'dir. " );

		
		
		
		

	}

}
