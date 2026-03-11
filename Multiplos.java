public class Multiplos {
	public static void main(String[]args){
		int resultado = somaMultiplos3ou5(5);
		System.out.println(resultado);
	}	
	public static int somaMultiplos3ou5(int n) {
        int soma = 0;
		
		for(int i = 1; i < n; i++){
			if(i % 3 == 0 || i % 5 == 0);
			soma += i;
		
		}
			return soma;
	}
	
}