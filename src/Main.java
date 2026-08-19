import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Realizar un programa Java que declare una variable entera N y se le asigne un valor elegido por el usuario.
        // A continuación escribe las instrucciones para que el programa realice lo siguiente:
        // Incrementar N en 77, reducir su valor a 3, duplicar su valor. Mostrar por pantalla los 

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int option;
        do {
            showMenu();
            System.out.println("Ingrese una opcion: ");
            option = getOption(scanner, 1, 14);

            switch (option){
                case 1 -> ejercicio1(scanner);
                case 2 -> ejercicio2(scanner);
                case 3 -> ejercicio3(scanner);
                case 4 -> ejercicio4(scanner);
                case 5 -> ejercicio5(scanner);
                case 6 -> ejercicio6(scanner);
                case 7 -> ejercicio7(scanner);
                case 8 -> ejercicio8(scanner);
                case 9 -> ejercicio9(scanner);
                case 10 -> ejercicio10(scanner);
                case 11 -> ejercicio11(scanner);
                case 12 -> ejercicio12();
                case 13 -> ejercicio13(scanner);
                case 14 -> ejercicio14(scanner);
            }

            if(option == -1) {
                System.out.println("Ingrese una opcion valida..");
            }
        } while(option != 0);
    }

    public static int getOption(Scanner scanner, int min, int max) {
        int option = scanner.nextInt();
        if(option >= min && option <= max) {
            return option;
        }
        scanner.nextLine();
        return -1;
    }

    private static void showMenu() {
        System.out.println("Guia n2:");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
        System.out.println("12. Ejercicio 12");
        System.out.println("13. Ejercicio 13");
        System.out.println("14. Ejercicio 14");
    }

    private static void ejercicio1(Scanner scanner) {
        System.out.println("Ingrese un valor de tipo entero: ");
        int n = scanner.nextInt();

        System.out.println("n: " + n);

        n += 77;
        System.out.println("n + 77: " + n);

        n -= 3;
        System.out.println("n + 77 - 3: " + n);

        n *= 2;
        System.out.println("(n + 77 - 3) * 2: " + n);
    }

    private static void ejercicio2(Scanner scanner){
        System.out.println("Ingrese un valor de tipo entero y te dire si es PAR o INPAR: ");
        int a = scanner.nextInt();

        if(a % 2 == 0) {
            System.out.println("El numero " + a + " es PAR");
        } else {
            System.out.println("El numero " + a + " es IMPAR");
        }
    }

    private static void ejercicio3(Scanner scanner){
        System.out.println("Ingrese un valor de tipo entero y te dire si es POSITIVO o NEGATIVO: ");
        int b = scanner.nextInt();

        if(b < 0) {
            System.out.println("El numero " + b + " es NEGATIVO");
        } else {
            System.out.println("El numero " + b + " es POSITIVO");
        }
    }

    private static void ejercicio4(Scanner scanner) {
        System.out.println("Ingrese una palabra y obtendre el valor ASCII del primer caracter: ");
        String palabra = scanner.next();

        char firstChar = palabra.charAt(0);
        System.out.println("La palabra elegida fue: " + palabra);
        System.out.println("El primer caracter es: " + firstChar);
        System.out.println("Su valor ASCII es: " + (int)firstChar);
    }

    private static void ejercicio5(Scanner scanner) {
        System.out.println("Ingrese un valor de tipo entero y le dire un par de caracteristicas de ese número: ");
        int c = scanner.nextInt();

        if(c < 0) {
            System.out.println("El numero " + c + " es NEGATIVO");
        } else {
            System.out.println("El numero " + c + " es POSITIVO");
        }

        if(c % 2 == 0) {
            System.out.println("El numero " + c + " es PAR");
        } else {
            System.out.println("El numero " + c + " es IMPAR");
        }

        if(c % 5 == 0) {
            System.out.println("El numero " + c + " es MULTIPLO DE 5");
        } else {
            System.out.println("El numero " + c + " NO es MULTIPLO DE 5");
        }

        if(c % 10 == 0) {
            System.out.println("El numero " + c + " es MULTIPLO DE 10");
        } else {
            System.out.println("El numero " + c + " NO es MULTIPLO DE 10");
        }

        if(c < 100) {
            System.out.println("El numero " + c + " es MENOR que 100");
        } else if (c > 100){
            System.out.println("El numero " + c + " NO es MAYOR que 100");
        } else {
            System.out.println("El numero " + c + " ES igual que 100");
        }
    }

    private static void ejercicio6(Scanner scanner) {
        System.out.print("Ingrese su nombre de pila: ");
        String nombre = scanner.next();

        System.out.println("Buenos dias " + nombre + "!");
    }

    private static void ejercicio7(Scanner scanner) {
        System.out.print("Ingrese una velocidad, la misma estara expresada en km/h: ");
        double kmh = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("#.00");
        Double velocidadMS = kmh * 1000 / 3600;

        System.out.println(kmh + "km/h equivale a " + df.format(velocidadMS) + "m/s");
    }

    private static void ejercicio8(Scanner scanner) {
        System.out.print("Ingrese un numero de 3 cifras: ");
        int numero = scanner.nextInt();
        String valor = String.valueOf(numero);

        for(int i = 0; i < 3; i++) {
            System.out.println(valor.charAt(i));
        }
    }

    private static void ejercicio9(Scanner scanner) {
        System.out.print("Ingrese un numero de 5 cifras: ");
        int numero = scanner.nextInt();
        String valor = String.valueOf(numero);

        for(int i = 0; i < valor.length(); i++) {
            if(i % 2 != 0) {
                System.out.println(valor.charAt(i));
            }
        }
    }

    private static void ejercicio10(Scanner scanner) {
        System.out.println("Se le pedira que ingrese hora minutos y segundos");
        System.out.println("Ingrese la hora: ");
        int hora = scanner.nextInt();
        System.out.println("Ahora ingrese los minutos");
        int minutes = scanner.nextInt();
        System.out.println("Y por ultimo ingrese los segundos: ");
        int seconds = scanner.nextInt();

        if(hora > 24 || minutes > 59 || seconds > 59) {
            System.out.println("La hora ingresada es INCORRECTA");
        } else {
            System.out.println("La hora ingresada es CORRECTA");
        }
    }

    private static void ejercicio11(Scanner scanner) {
        String nombre;
        int edad;
        double salario;

        System.out.print("Como te llamas?: ");
        nombre = scanner.next();

        System.out.print("Que edad tienes?: ");
        edad = scanner.nextInt();

        System.out.println("Cual es tu salario?");
        salario = scanner.nextDouble();

        if (edad < 16) {
            System.out.println(nombre + ", no tienes edad para trabajar!");
        } else {
            if (edad >= 60) {
                salario *= 1.15;
            } else if (edad >= 50) {
                salario *= 1.10;
            } else if (edad >= 19) {
                salario *= 1.05;
            }
            System.out.println(nombre + "! tu salario es de " + salario);
        }

    }

    private static void ejercicio12() {
        double [] notas = { 8, 9, 10, 5, 5, 10 };

        double acumulador = 0;
        for(double nota : notas) {
            acumulador += nota;
        }
        double promedio  = acumulador / notas.length;
        System.out.println("La promedio es de " + promedio);

    }

    private static void ejercicio13(Scanner scanner) {
        System.out.print("Ingrese un numero entero, se sumaran todos los numeros naturales hasta el numero que usted indique: ");
        int number = scanner.nextInt();
        int suma = 0;
        // el for necesita la condicion con <= para que tome en cuenta hasta el numero indicado por el usuario
        for(int i = 1; i <= number; i++) {
            suma += i;
        }

        System.out.println("La suma es de " + suma);
    }

    private static void ejercicio14(Scanner scanner) {

        final int SIZE = 20;
        double[] temperaturas = new double[SIZE];

        System.out.println("Ingrese 20 temperaturas --- ");
        for(int i = 0; i < SIZE; i++) {
            System.out.print("Temperatura " + (i+1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        System.out.println("Gracias por ingresar las 20 temperaturas. A continuacion se presentan datos de ellas:");

        double max = temperaturas[0];
        double min = temperaturas[0];
        double acumulador = 0;

        for(int i = 0; i < SIZE; i++) {
            acumulador += temperaturas[i];

            if(max < temperaturas[i]) {
                max = temperaturas[i];
            }
            if(min > temperaturas[i]) {
                min = temperaturas[i];
            }
        }
        double promedio = acumulador / SIZE;
        System.out.println("La promedio es de " + promedio + "°C");
        System.out.println("La temperatura minima fue " + min + "°C");
        System.out.println("La temperatura maxima fue " + max + "°C");
    }
}