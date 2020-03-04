import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int valor, cont = 0, chave = 0, soma = 0, media;
		
		Scanner ler = new Scanner(System.in);
		
		while(chave == 0){
		System.out.println("Digite no mínimo 4 valores: ");
        valor = ler.nextInt();
		
        if (valor != -1) soma = soma + valor;
		
        if(cont <= 4 && valor == -1) chave=-1;
        else if(valor == -1 && cont < 4) System.out.println("Você ainda não digitou 4 números!");
        
        cont ++;
		
		}
		
		media = soma / (cont-1);
		
		System.out.println("SOMA =" + soma);
		System.out.println("MEDIA ="+ media);
		
	}

}
