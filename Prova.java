import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		int a = sc.nextInt();
		
		System.out.println("digite um numero: ");
        int b = sc.nextInt();
		
		int soma = 0;
		
		for(int i = a; i <= b; i++) {
			if(i % 2 == 0){
				soma += i;
			}
		} 
		System.out.println("A soma dos pares " +a+ " e " +b+ " é " + soma);
	}
}
