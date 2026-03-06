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
		    int num;
		    int positivos = 0;
		    int negativos = 0;
		    int ceros = 0;

		    System.out.print("Ingrese la cantidad de numeros: ");
		    n = sc.nextInt();

		    for(int i = 1; i <= n; i++) {

		        System.out.print("Ingrese un numero: ");
		        num = sc.nextInt();

		        if(num > 0) {
		            positivos++;
		        }
		        else if(num < 0) {
		            negativos++;
		        }
		        else {
		            ceros++;
		        }

		    }

		    System.out.println("Positivos: " + positivos);
		    System.out.println("Negativos: " + negativos);
		    System.out.println("Ceros: " + ceros);

		}	
	
	public static void ejercicio4() {

		    int n;
		    int suma = 0;
		    int contador = 0;

		    System.out.print("Ingrese un numero n: ");
		    n = sc.nextInt();

		    for(int i = 1; i <= n; i++) {

		        if(i % 2 == 0) {
		            suma = suma + i;
		            contador++;
		        }

		    }

		    if(contador > 0) {
		        double promedio = (double)suma / contador;
		        System.out.println("El promedio de los numeros pares es: " + promedio);
		    }
		    else {
		        System.out.println("No hay numeros pares.");
		    }

		}
			
	public static void ejercicio5() {
		
		    int n;
		    int suma = 0;

		    System.out.print("Ingrese un numero: ");
		    n = sc.nextInt();

		    while(n > 0) {

		        int digito = n % 10;
		        suma = suma + digito;
		        n = n / 10;

		    }

		    System.out.println("La suma de los digitos es: " + suma);

		}
	
	
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

	            case 1: multiplo7o11(); break;
	            case 2: divisibles3No2(); break;
	            case 3: horarioDia(); break;

	        }

	    } while(opcion != 4);

	}
	
	// EJERCICIO 6
	public static void multiplo7o11() {

		    int n;

		    System.out.print("Ingrese un numero: ");
		    n = sc.nextInt();

		    if(n % 7 == 0 || n % 11 == 0) {
		        System.out.println("El numero es multiplo de 7 o de 11");
		    }
		    else {
		        System.out.println("El numero NO es multiplo de 7 ni de 11");
		    }

		}
	
	// EJERCICIO 7
	public static void divisibles3No2() {

		    int n;

		    System.out.print("Ingrese un numero: ");
		    n = sc.nextInt();

		    System.out.println("Numeros divisibles entre 3 pero no entre 2:");

		    for(int i = 1; i <= n; i++) {

		        if(i % 3 == 0 && i % 2 != 0) {
		            System.out.println(i);
		        }

		    }

		}
	
	// EJERCICIO 8
	public static void horarioDia() {

		    int hora;

		    System.out.print("Ingrese la hora (0-23): ");
		    hora = sc.nextInt();

		    if(hora >= 0 && hora <= 11) {
		        System.out.println("Mañana");
		    }
		    else if(hora >= 12 && hora <= 17) {
		        System.out.println("Tarde");
		    }
		    else if(hora >= 18 && hora <= 23) {
		        System.out.println("Noche");
		    }
		    else {
		        System.out.println("Hora invalida");
		    }

		}
	
	
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

	            case 1: numeroRomano(); break;
	            case 2: calculadora(); break;

	        }

	    } while(opcion != 3);

	}
	
	// EJERCICIO 9
		public static void numeroRomano() {

		    int num;

		    System.out.print("Ingrese un numero del 1 al 5: ");
		    num = sc.nextInt();

		    switch(num) {

		        case 1: System.out.println("I");break;
		        case 2: System.out.println("II");break;
		        case 3: System.out.println("III");break;
		        case 4: System.out.println("IV");break;
		        case 5: System.out.println("V");break;
		        default:System.out.println("Numero invalido");
		    }

		}
	
		public static void calculadora() {

		    int opcion;
		    double num1;
		    double num2;
		    double resultado;

		    System.out.println("1. Sumar");
		    System.out.println("2. Restar");
		    System.out.println("3. Multiplicar");

		    System.out.print("Seleccione una opcion: ");
		    opcion = sc.nextInt();

		    System.out.print("Ingrese el primer numero: ");
		    num1 = sc.nextDouble();

		    System.out.print("Ingrese el segundo numero: ");
		    num2 = sc.nextDouble();

		    switch(opcion) {

		        case 1:resultado = num1 + num2;
	            System.out.println("Resultado: " + resultado); break;
		        
		        case 2:resultado = num1 - num2;
	            System.out.println("Resultado: " + resultado);  break;
	            
		        case 3:resultado = num1 * num2;
	            System.out.println("Resultado: " + resultado); break;
	            
		        default:System.out.println("Opcion invalida");    
		    }

		}
	
	
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
	
	
	
	

	     
	

	
	
	
	

