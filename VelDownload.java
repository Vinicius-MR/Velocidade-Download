import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Informe o tamanho do arquivo: ");
	    double tamArquivo = scan.nextDouble();
	    
	    System.out.println("Informe a velocidade da internet: ");
	    double velInternet = scan.nextDouble();
	    
	    double tempo = tamArquivo / velInternet;
	    
	    System.out.println("Tempo de download: " + tempo);
	    
}
}
