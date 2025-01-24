//Este programa es acerca del juego piedra, papel o tijeras en donde los jugadores
//colocan su eleccion y el programa  dice quien es el ganador, puede ganar alguno de los jugadores o ser empate
package com.generation;

public class Codigo4 {
//Añado método main
public static void main(String[] args) {

//Método scanner
    Scanner s = new Scanner(System.in);
    
   
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    //Definicion correcta de método scanner
    scanner.nextLine().toLowerCase(); 
   
    
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    
    //Definición correcta de métdo scanner
     String jugador2 = scanner.nextLine().toLowerCase(); 
    
//Sobraba un ")"
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          //Coloco equals al giaul que en papel 
          if (j2.equals( "tijeras")) {
            g = 1;
          }
   //Añado break para seguir la logica 
          break;
        case "papel":
          if (j2.equals( "piedra")) {
            g = 1;
         break;

         //cambio a tijeras
        case "tijeras":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
          //No hay informacion para el juego
          System.out.println("Entrada inválida. Seleccion piedra, appel o tijeras");
                    return; 
      }
      System.out.println("Gana el jugador " + g);
    }
  //Añado llaves de cierre
    }
}
}