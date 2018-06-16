import java.util.Scanner;

public class Comparacion {
    private final Scanner entrada;
    private int opcion;
    private int numero, numero2;
    private boolean band = true;    
    
    public Comparacion(){
        entrada = new Scanner(System.in);
        opcion();
    }   
    
    private void opcion(){
        System.out.println("1. Comparación de Números con Scanner");
        System.out.println("0. Terminar");
        System.out.print("Teclea la opción que desees: ");

        opcion = entrada.nextInt();
        
        if(opcion == 1){
            band = true;
            comparacion(band);
        }else if(opcion == 0){
            band = false;
            comparacion(band);
        }else{
            System.out.println("Opción no válida");
            band = false;
        }
    }
    
    private void comparacion(boolean band){
        this.band = band;
        while(this.band==true){
            try{    

                System.out.println("Escriba el Primer Número Entero y presione Enter ");
                numero = entrada.nextInt();
                System.out.println("Escriba el Segundo Número Entero y presione Enter ");
                numero2 = entrada.nextInt();

                if(numero==numero2){
                    System.out.println("Los Números son Iguales");
                    System.out.println("*----------------------------------------------*\n\n");
                    opcion();
                }if(numero<numero2){
                    System.out.println("El Número 1 es MENOR que el Número 2");
                    System.out.println("*----------------------------------------------*\n\n");
                    opcion();
                }if(numero>numero2){
                    System.out.println("El Número 1 es MAYOR que el Número 2");
                    System.out.println("*----------------------------------------------*\n\n");
                    opcion();
                }

            }catch(Exception e){
                System.out.println("Es una letra o palabra");
            }
        }
            System.exit(0);
    } 
}