import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		
		nota1 = sc.nextDouble();
		
        System.out.println("Informe o segunda nota: ");
		
		nota2 = sc.nextDouble();
		
        System.out.println("Informe a terceira nota: ");
		
		nota3 = sc.nextDouble();
		
        System.out.println("Informe a quarta nota: ");
		
		nota4 = sc.nextDouble();
		
		sc.close();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media é : " + media);
		
		

	}

}
