
public class ExercicioDois {
	public static boolean possoIrAoBanco ( String dia, int hora) {
		
		return ExercicioUm.ehDiaSemana(dia) && hora >=10 && hora <=16;
		
		/*if ((dia.equalsIgnoreCase("domingo") || dia.equalsIgnoreCase("sabado")) && hora <= 9 && hora >= 16 ) {
			
			return false;
		}else {
			return true;
		}
		*/
		
	}
	public static void main(String[] args) {
		
		System.out.println(possoIrAoBanco("Domingo", 13));
	}
}
