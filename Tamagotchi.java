
import java.util.Scanner;

public class Tamagotchi {
	Scanner entrada;
	Pokemon[] mascotas;
	
	
	
	
	
	
	public void menuPrincipal(){
		entrada = new Scanner(System.in);
		int opcion;
		
		do{
			System.out.println("Bienvenido al Juego Tamagotchi");
			System.out.println("Elija una de las siguientes opciones");
			System.out.println("[1] Crear Pokemon");
			System.out.println("[2] Seleccionar Pokemon");
			System.out.println("[3] Matar Pokemon");
			System.out.println("[4] Revivir Pokemon");
			System.out.println("[5] Salir");
			opcion = entrada.nextInt();
			
			switch(opcion){
			
			case 1:
				System.out.println("Crear una Pokemon");
				break;
			case 2:
				System.out.println("Seleccionar un Pokmeon");
				break;
			case 3:
				System.out.println("Matar Pokemon");
				break;
			case 4:
				System.out.println("Revivir Pokemon");
				break;
			case 5: 
				System.exit(0);
			
			}
			
			
			
		}while(opcion != 5);
		
	}
	
	

}
