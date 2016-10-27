import java.util.Scanner;
public class TemperaturaDeportesInvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int temp;
		System.out.print("Ingrese la temperatura:");
		temp=teclado.nextInt();
		if(temp<-12){
			System.out.print("Damas");//Si la temperatura es inferior a -12 imprime Damas.
		}else if (temp<0){
			System.out.print("Esquí");//Si la temperatura es superior a -12 e inferior a 0 imprime Esquí.
		}else if (temp<21){
			System.out.print("Golf");//Si la temperatura es superior a 0 e inferior a 21 imprime Golf.
		}else if (temp<29){
			System.out.print("Tenis");//Si la temperatura es superior a 21 e inferior a 29 imprime Tenis.
		}else{
			System.out.print("Natación");//Si la temperatura es superior a 29 imprime Natación.
		}
	}

}
