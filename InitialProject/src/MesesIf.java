import java.util.Scanner;

public class MesesIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int m;
		System.out.println("Introduce un número: ");
		m=teclado.nextInt();
		
		if(m>=1 && m<=12) {
			if(m==1){
				System.out.println("Enero");
			} 
			if(m==2){
				System.out.println("Febrero");
			} 
			if(m==3){
				System.out.println("Marzo");
			} 
			if(m==4){
				System.out.println("Abril");
			}  
			
			if(m==5){
				System.out.println("Mayo");
			} 
			if(m==6){
				System.out.println("Junio");
			} 
			if(m==7){
				System.out.println("Julio");
	
			} 
			if(m==8){
				System.out.println("Agosto");
			} 
			if(m==9){
				System.out.println("Septiembre");
			} 
			if(m==10){
				System.out.println("Octubre");
			} 
			if(m==11){
				System.out.println("Noviembre");
			} 
			if(m==12){
				System.out.println("Diciembre");
			} 
			
		} else {
			System.out.println("Número introducido incorrecto");
		}
	}

}
