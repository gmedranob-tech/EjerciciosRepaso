package principal;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("===== REPASO PRIMER PARCIAL =====");
        System.out.println("       Gabriela Medrano\n");

         menuPrincipal();
	}

	public static void menuPrincipal() {
		int opcion;
		
		do {
			System.out.println("\n===== MENU PRINCIPAL =====");	
			System.out.println("1. Parte 1 – Ciclos y Operaciones Numericas");
			System.out.println("2. Parte 2 – Condiciones y Divisibilidad");
		    System.out.println("3. Parte 3 – Uso de Switch");
		    System.out.println("4. Parte 4 – Analisis Numerico");
		    System.out.println("5. Parte 5 – Patrones y Transformaciones");
		    System.out.println("6. Salir");

		    System.out.print("Seleccione una opcion: ");
		    opcion = sc.nextInt();
		
		    switch(opcion) {

            case 1:menuParte1(); break;
            case 2:menuParte2(); break;
            case 3:menuParte3(); break;
            case 4:menuParte4(); break;
            case 5:menuParte5();break;
            case 6:System.out.println("Gracias por utilizar el programa...");  break;
            default:
                System.out.println("Opcion invalida");
        }

    } while(opcion != 6);

	}
	
	// SUBMENU PARTE 1
	public static void menuParte1() {

	    int opcion;

	    do {

	        System.out.println("\n===== PARTE 1 – CICLOS =====");
	        System.out.println("1. Suma de divisibles entre 4");
	        System.out.println("2. Factorial");
	        System.out.println("3. Conteo positivos, negativos y ceros");
	        System.out.println("4. Promedio de pares");
	        System.out.println("5. Suma de digitos");
	        System.out.println("6. Regresar");

	        System.out.print("Seleccione una opcion: ");
	        opcion = sc.nextInt();

	        switch(opcion) {
		 
	        case 1:ejercicio1(); break;
            case 2:ejercicio2(); break;
            case 3:ejercicio3(); break;
            case 4:ejercicio4(); break;
            case 5:ejercicio5(); break;
	        }

	    } while(opcion != 6);

	}  
	
	// EJERCICIO 1		
	public static void ejercicio1() {

		    int n;
		    int suma = 0;

		    System.out.print("Ingrese un numero: ");
		    n = sc.nextInt();

		    for(int i = 1; i <= n; i++) {

		        if(i % 4 == 0) {
		            suma = suma + i;
		        }

		    }

		    System.out.println("La suma de los numeros divisibles entre 4 es: " + suma);

		}

	// EJERCICIO 2
	public static void ejercicio2() {

		    int n;
		    long factorial = 1;

		    System.out.print("Ingrese un numero: ");
		    n = sc.nextInt();

		    for(int i = 1; i <= n; i++) {

		        factorial = factorial * i;

		    }

		    System.out.println("El factorial de " + n + " es: " + factorial);

		}
	
	
	public static void ejercicio3() {

		    int n;
		    int numero;
		    int positivos = 0;
		    int negativos = 0;
		    int ceros = 0;

		    Scanner teclado = new Scanner(System.in);

		    System.out.print("Ingrese la cantidad de numeros: ");
		    n = teclado.nextInt();

		    for(int i = 1; i <= n; i++) {

		        System.out.print("Ingrese un numero: ");
		        numero = teclado.nextInt();

		        if(numero > 0) {
		            positivos++;
		        }
		        else if(numero < 0) {
		            negativos++;
		        }
		        else {
		            ceros++;
		        }

		    }

		    System.out.println("Cantidad de positivos: " + positivos);
		    System.out.println("Cantidad de negativos: " + negativos);
		    System.out.println("Cantidad de ceros: " + ceros);

		}
				
	public static void ejercicio4() {

		    Scanner teclado = new Scanner(System.in);

		    int n;
		    int suma = 0;
		    int contador = 0;

		    System.out.print("Ingrese un numero n: ");
		    n = teclado.nextInt();

		    for(int i = 1; i <= n; i++) {

		        if(i % 2 == 0) {
		            suma = suma + i;
		            contador++;
		        }

		    }

		    if(contador > 0) {
		        double promedio = (double)suma / contador;
		        System.out.println("El promedio de los numeros pares es: " + promedio);
		    } else {
		        System.out.println("No hay numeros pares en el rango.");
		    }

		}
	
	public static void ejercicio5() {}
	
	
	// SUBMENU PARTE 2
	public static void menuParte2() {

	    int opcion;

	    do {

	        System.out.println("\n===== PARTE 2 =====");
	        System.out.println("1. Multiplo de 7 o 11");
	        System.out.println("2. Divisibles entre 3 pero no entre 2");
	        System.out.println("3. Clasificacion de hora");
	        System.out.println("4. Regresar");

	        System.out.print("Seleccione una opcion: ");
	        opcion = sc.nextInt();

	        switch(opcion) {

	            case 1: ejercicio6(); break;
	            case 2: ejercicio7(); break;
	            case 3: ejercicio8(); break;

	        }

	    } while(opcion != 4);

	}
	
	public static void ejercicio6() {}
	public static void ejercicio7() {}
	public static void ejercicio8() {}
	
	//SUBMENU PARTE 3
	public static void menuParte3() {

	    int opcion;

	    do {

	        System.out.println("\n===== PARTE 3 – SWITCH =====");
	        System.out.println("1. Numero romano");
	        System.out.println("2. Calculadora");
	        System.out.println("3. Regresar");

	        System.out.print("Seleccione una opcion: ");
	        opcion = sc.nextInt();

	        switch(opcion) {

	            case 1: ejercicio9(); break;
	            case 2: ejercicio10(); break;

	        }

	    } while(opcion != 3);

	}
	
	public static void ejercicio9() {}
	public static void ejercicio10() {}
	
	
	//SUBMENU PARTE 4
	public static void menuParte4() {

	    int opcion;

	    do {

	        System.out.println("\n===== PARTE 4 =====");
	        System.out.println("1. Mayor, menor y diferencia");
	        System.out.println("2. Tabla de division");
	        System.out.println("3. Digitos pares");
	        System.out.println("4. Numero triangular");
	        System.out.println("5. Promedio negativos");
	        System.out.println("6. Regresar");

	        System.out.print("Seleccione una opcion: ");
	        opcion = sc.nextInt();

	        switch(opcion) {

	            case 1: ejercicio11(); break;
	            case 2: ejercicio12(); break;
	            case 3: ejercicio13(); break;
	            case 4: ejercicio14(); break;
	            case 5: ejercicio15(); break;

	        }

	    } while(opcion != 6);

	}
	
	public static void ejercicio11() {}
	public static void ejercicio12() {}
	public static void ejercicio13() {}
	public static void ejercicio14() {}
	public static void ejercicio15() {}	
	
	//SUBMENU PARTE 5 
	public static void menuParte5() {

	    int opcion;

	    do {

	        System.out.println("\n===== PARTE 5 =====");
	        System.out.println("1. Multiplos de 6");
	        System.out.println("2. Potencia de 2");
	        System.out.println("3. Numero invertido");
	        System.out.println("4. Suma 1 a n par o impar");
	        System.out.println("5. Celsius a Fahrenheit");
	        System.out.println("6. Regresar");

	        System.out.print("Seleccione una opcion: ");
	        opcion = sc.nextInt();

	        switch(opcion) {

	            case 1: ejercicio16(); break;
	            case 2: ejercicio17(); break;
	            case 3: ejercicio18(); break;
	            case 4: ejercicio19(); break;
	            case 5: ejercicio20(); break;

	        }

	    } while(opcion != 6);

	}
	 
	public static void ejercicio16() {}
	public static void ejercicio17() {}
	public static void ejercicio18() {}
	public static void ejercicio19() {}
	public static void ejercicio20() {}

	}
	
	
	
	

	     
	

	
	
	
	

