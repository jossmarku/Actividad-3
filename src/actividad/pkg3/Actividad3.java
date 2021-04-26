package actividad.pkg3;

import java.util.Scanner;

public class Actividad3 {

    public static void encabezado(){
        System.out.println("Universidad Autónoma de Campeche");
        System.out.println("Facultad de Ingeniería");
        System.out.println("Ingeniería en Sistemas Computacionales");
        System.out.println("26 de abril de 2021");
        System.out.println("Jossmar Oswaldo Ku Cupul");
    }
    
    public static void cuerpo() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("");
        System.out.println("============================[Actividad 3]============================");
        System.out.println("");
        System.out.println("Opciones disponibles:");
        System.out.println("");
        System.out.println("[1] Suma consecutiva del 0 al 10");
        System.out.println("[2] Factorial de 10");
        System.out.println("[3] Factorial de un número introducido");
        System.out.println("[4] Media de la suma del 0 hasta un número introducido");
        System.out.println("[5] Información de una serie de números introducidos ");
        System.out.println("[6] Días de la semana");
        System.out.println("[7] Modelo del juego gato");
        System.out.println("");
        System.out.print("Introduzca el número de la opción a escoger: ");
    }
    
    public static void pie() {
        System.out.println("");
        System.out.println("=====================================================================");
        System.out.println("                                                            JOKC.2021");
    }     
    
    public static void sumaConsecutiva() {
        System.out.println("");
        System.out.println("===================[Suma consecutiva del 0 al 10]====================");
        System.out.println("");
        
        int suma = 0;
        
        for (int i = 0; i <= 10; i++) {
            suma += i;
        }
        
        System.out.println("La suma consecutiva del 0 al 10 es: " + suma);
    }
    
    public static void factorial() {
        System.out.println("");
        System.out.println("=========================[Factorial de 10]===========================");
        System.out.println("");
        
        int factorial = 1;
        
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de 10 es: " + factorial);
        
    }
    
    public static void factorialIntroducido() {
        System.out.println("");
        System.out.println("================[Factorial de un número introducido]=================");
        System.out.println("");
        System.out.print("Introduce el número del cual desea calcular su factorial: ");
        
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        System.out.println("");
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
    public static void mediaNumIntroducido() {
        System.out.println("");
        System.out.println("====================[Estructura del juego gato]======================");
        System.out.println("");
        System.out.print("Introduce el número del cual desea calcular la media de la suma del 0 hasta dicho número: ");
        
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        float suma = 0;
        
        for (int i = 0; i <= numero; i++) {
            suma += i;
        }
        float media = suma / numero;
        
        System.out.println("");
        System.out.println("La media de la suma del 0 al " + numero + " es: " + media);
    }
    
    public static void infoNumIntroducidos() {
        System.out.println("");
        System.out.println("=========[Información de una serie de números introducidos]==========");
        
        System.out.println("");
        System.out.print("Introduce la cantidad de números que se desea incluir en el cálculo: ");
        
        Scanner entrada = new Scanner(System.in);        
        int cantidad = entrada.nextInt();
        int arreglo[] = new int[cantidad];
        
        System.out.println("");
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }
        
        int mayor = arreglo[0];
        int menor = arreglo[0];
        int suma = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            } else if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
            suma += arreglo[i];
        }
        
        float total = suma;
        float promedio = total / cantidad;
        int distancia = mayor - menor;
        
        System.out.println("");
        System.out.println("La cantidad de numeros introducidos fueron: " + cantidad);
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El promedio de los números introducidos es: " + promedio);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La distancia númerica entre el número mayor y el menor es: " + distancia);
    }
    
    public static void diaSemana() {
        System.out.println("");
        System.out.println("=========================[Días de la semana]=========================");
        System.out.println("");
        
        String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
    }
    
    public static void gato() {
        System.out.println("");
        System.out.println("====================[Estructura del juego gato]======================");
        System.out.println("");
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("- ");
            }
            System.out.println("");
        }
    }
    
    public static void principal(int opcion) {
        switch(opcion)
        {
        case 1:
            sumaConsecutiva();
            break;
        case 2:
            factorial();
            break;
        case 3:
            factorialIntroducido();
            break;
        case 4:
            mediaNumIntroducido();
            break;
        case 5:
            infoNumIntroducidos();
            break;
        case 6:
            diaSemana();
            break;
        case 7:
            gato();
            break;
        default:
            System.out.println("Opción no válida");
        }
    }   
    
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        encabezado();
        cuerpo();
        principal(opcion.nextInt());
        pie();
    }
}
