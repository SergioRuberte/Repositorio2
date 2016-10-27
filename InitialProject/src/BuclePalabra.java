import java.util.Scanner;

public class BuclePalabra {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		char letra = 0;
		String palabra="";
		int n=0;
		while (true) {
			System.out.print("Introduzca una palabra: ");
			palabra=teclado.next();
			while (n<palabra.length()){
			letra=palabra.charAt(n);			
			switch (letra){
			case 'a':	case 'b':	case 'c':
			case 'A':	case 'B':	case 'C':
				System.out.print("2"); break;
				
			case 'd':	case 'e':	case 'f':
			case 'D':	case 'E':	case 'F':
				System.out.print("3"); break;
				
			case 'g':	case 'h':	case 'i':
			case 'G':	case 'H':	case 'I':
				System.out.print("4"); break;
				
			case 'j':	case 'k':	case 'l':
			case 'J':	case 'K':	case 'L':
				System.out.print("5"); break;
				
			case 'm':	case 'n':	case 'ñ':	case 'o':
			case 'M':	case 'N':	case 'Ñ':	case 'O':
				System.out.print("6"); break;
				
			case 'p':	case 'q':	case 'r':	case 's':
			case 'P':	case 'Q':	case 'R':	case 'S':
				System.out.print("7"); break;
				
			case 't':	case 'u':	case 'v':
			case 'T':	case 'U':	case 'V':
				System.out.print("8"); break;
				
			case 'w':	case 'x':	case 'y':	case 'z':
			case 'W':	case 'X':	case 'Y':	case 'Z':
				System.out.println("9"); break;
			default:
				System.out.println("Carácter no alfabético");	
			}
			n++;
			}
			System.out.println();
		}
	}

}
