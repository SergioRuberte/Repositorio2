/*
 * Este programa suma o multiplica n�meros dados por teclado dependiendo de si el primer n�mero es positivo o negativo, respectivamente.
 */
import java.util.Scanner;
public class SumaProductosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n1,n2,n3, suma, producto;
		//Ingresamos los 3 n�meros por teclado
		System.out.print("Ingrese el primer numero:");
		n1=teclado.nextInt();
		System.out.print("Ingrese el segundo numero:");
		n2=teclado.nextInt();
		System.out.print("Ingrese el tercer numero:");
		n3=teclado.nextInt();
		if (n1<0){ //Si el n�mero es negativo (menor que 0), multiplica los 3 n�meros
			producto=n1*n2*n3;
			System.out.println("El producto de los n�meros "+n1+", "+n2+", "+n3+" es: "+producto);
		}else{ //Por el contrario, si es positivo, los suma.
			suma=n1+n2+n3;
			System.out.println("La suma de los n�meros "+n1+", "+n2+", "+n3+" es: "+suma);
		}

	}

}
