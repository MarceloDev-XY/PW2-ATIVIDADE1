
public class ExercicioUm {
	public static boolean ehDiaSemana(String dia) {
		
		
			if (dia.equalsIgnoreCase("domingo") || dia.equalsIgnoreCase("sabado")) {
				
				return false;
			}else {
				return true;
			}
			
	}	
		    //Outra forma de fazer !
			//boolean diaSemana = (dia == "segunda" || dia == "ter�a"  || dia == "quarta"  || dia == "quinta"  || dia == "sexta"  || dia == "sabado"  || dia == "domingo" );   
			//return diaSemana;	
	
	public static void main(String[] args) {
		
		System.out.println(ehDiaSemana("domingo"));
	}
}
