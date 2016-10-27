import java.util.*;
public class Bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		char letra;
		int contadorerror=0;
		int contadorH=0;
		int contadorh=0;
		System.out.print("Introduzca una letra: ");
		letra=teclado.next().charAt(0);
		while (letra!='0') {
			switch (letra){
			case 'a':
			case 'b':
			case 'c':
			case 'A':
			case 'B':
			case 'C':
				System.out.println("2"); break; 
			case 'd':
			case 'e':
			case 'f':
			case 'D':
			case 'E':
			case 'F':
				System.out.println("3"); break;
			case 'g':
			case 'h':
			case 'i':
			case 'G':
			case 'H':
			case 'I':
				System.out.println("4"); break;
			case 'j':
			case 'k':
			case 'l':
			case 'J':
			case 'K':
			case 'L':
				System.out.println("5"); break;
			case 'm':
			case 'n':
			case 'ñ':
			case 'o':
			case 'M':
			case 'N':
			case 'Ñ':
			case 'O':
				System.out.println("6"); break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				System.out.println("7"); break;
			case 't':
			case 'u':
			case 'v':
			case 'T':
			case 'U':
			case 'V':
				System.out.println("8"); break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				System.out.println("9"); break;
			default:
				System.out.println("Carácter no alfabético");
				contadorerror++;
			}
			if(letra=='h'){
				contadorh++;
			}
			if(letra=='H'){
				contadorH++;
			}
			System.out.print("Introduzca una letra: ");
			letra=teclado.next().charAt(0);
		}
		System.out.println("Número de errores: "+contadorerror);
		System.out.println("Número de 'H': "+contadorH);
		System.out.println("Número de 'h': "+contadorh);
	}

}
