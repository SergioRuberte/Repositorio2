import java.util.Scanner;

public class LaMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int suma=0, num=0, cont=0;
				
		do{
			System.out.println("Introduce un número: ");
			num=teclado.nextInt();
			cont++;
			System.out.println("Contador " + cont);
			suma=suma+num;
			System.out.println("Suma: " + suma);
		}while (cont<10 && num>=0);
		
	}
	}


