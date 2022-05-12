package introjava;

import java.util.Scanner;

public class Atv3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int idade;
		
	

		System.out.println("qual a sua idade ? :");
		idade=ler.nextInt();
		
		if(idade>=10 && idade<=14)
			System.out.println(" infantil");
		
		else if(idade>15 && idade<=17)
			
			System.out.println("você esta na categoria junevil");
		
		else
			
			System.out.println("você esta na categoria Adulto");
	}
}
