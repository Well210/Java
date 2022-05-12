package LacosDeRepeticao;

import java.util.Scanner;

public class Atv6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, soma=0, qtd=0, media;

		do {

			System.out.println(" coloque os numeros:\n ");
			n = sc.nextInt();

			if(n%3==0 && n!=0) {
				qtd++;
				soma+= n;
			}

		}while(n!=0);

		media = soma / qtd;
		System.out.println("A media dos numeros multiplos de 3 e: " + media);

}
}
