import java.util.Scanner;

public class Estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int n_estudiante, n_faltas, n_horas;
		System.out.println("Indica el número de estudiante:");
		n_estudiante=teclado.nextInt();
		System.out.println("Indica el número de horas de la asignatura:");
		n_horas=teclado.nextInt();
		System.out.println("Indica su número de faltas:");
		n_faltas=teclado.nextInt();
		
		if (n_faltas>(n_horas*0.15)){
			System.out.println("El estudiante con ID '"+n_estudiante+"' ha faltado un total de "+n_faltas+" horas lo que supone un "+(n_faltas*100)/n_horas
					+"% de las horas lectivas totales de la asignatura, por lo tanto conlleva a la pérdida de la evaluación continua. (Máximo 15%)");		
		}else if (n_faltas>(n_horas*0.10)){
			System.out.println("Superado el 10% de faltas.");
			System.out.println("El estudiante con ID '"+n_estudiante+"' ha faltado un total de "+n_faltas+" horas lo que supone un "+(n_faltas*100)/n_horas
					+"% de las horas lectivas totales de la asignatura. Si falta "+(n_horas*0.15-n_faltas)+" horas más, perderá el derecho a la evaluación continua.");
		}else if (n_faltas>(n_horas*0.05)){
			System.out.println("Superado el 5% de faltas.");
			System.out.println("El estudiante con ID '"+n_estudiante+"' ha faltado un total de "+n_faltas+" horas lo que supone un "+(n_faltas*100)/n_horas
					+"% de las horas lectivas totales de la asignatura. Si falta "+(n_horas*0.15-n_faltas)+" horas más, perderá el derecho a la evaluación continua.");
		}else{
			System.out.println("El estudiante con ID '"+n_estudiante+"' no ha perdido el derecho a la evaluación continua.");
		}
			
	}

}
