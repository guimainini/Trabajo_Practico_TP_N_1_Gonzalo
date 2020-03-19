import java.util.Scanner;

public class Trabajo_Pratico_N_1 {




        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int opcion, numero1,numero2,resultadoInt,a,b,c,d,h,m,s;

            double  numero3,numero4,resultado,resultado2,resultado3,resultado4,resultado5,e,f,g,perimetro;
            char letra;
            String nombre;
            boolean tata = true;

            do{

                System.out.println("1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la diferencia de A - N, el valor numérico correspondiente al carácter que contiene la variable C.");
                System.out.println("2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar por pantalla una serie de operaciones entre ellas.");
                System.out.println("3. Programa Java que declare una variable entera N, asignarle un valor. A continuación escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su valor a 3, duplicar su valor.");
                System.out.println("4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a cada una. A continuación realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.");
                System.out.println("5. Programa Java que declare una variable A de tipo entero, asignarle un valor. A continuación mostrar un mensaje indicando si A es par o impar.");
                System.out.println("6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.");
                System.out.println("7. Programa Java que declare una variable C de tipo entero y asignarle un valor. A continuación mostrar un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.");
                System.out.println("8. Programa Java que lea un nombre y muestre por pantalla: “Buenos días, {NOMBRE}”.");
                System.out.println("9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de ese número y lo muestre por pantalla.");
                System.out.println("10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados centígrados.");
                System.out.println("11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y muestra por pantalla la longitud y el área de la circunferencia.");
                System.out.println("12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.");
                System.out.println("13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.");
                System.out.println("14. Programa que calcula el volumen de una esfera.");
                System.out.println("15. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.");
                System.out.println("16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.");
                System.out.println("17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan posiciones impares.");
                System.out.println("18. Programa que lea tres números enteros H, M, S que contienen hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.");

                System.out.println("19. Salir");
                opcion = entrada.nextInt();
                switch(opcion){
                    case 1 :
                        System.out.print("Digite un numero entrero : ");
                        numero1 = entrada.nextInt();
                        System.out.print("Digite un numero double : ");
                        numero3 = entrada.nextDouble();
                        System.out.print("Digte una letra : ");
                        letra = entrada.next().charAt(0);

                        System.out.print("El valor del entero es : "+numero1);
                        System.out.print("\nEl valor del double es : "+numero3);
                        System.out.print("\nEl letra q dijito es : "+letra);
                        System.out.println("");

                        resultado = (double)numero1 + numero3;
                        resultado2 = (double)numero1 - numero3;
                        System.out.println("El resultado de la suma es : "+resultado);
                        System.out.println("El resultado de la resta es : "+resultado2);
                        System.out.println("El valor numerico de la letra es : "+(int)letra);
                        break;

                    case 2 :
                        System.out.print("Digite un valor entero: ");
                        numero1 = entrada.nextInt();
                        System.out.print("Digite un valor entero: ");
                        numero2 = entrada.nextInt();
                        System.out.print("Digite un valor de tipo double: ");
                        numero3 = entrada.nextDouble();
                        System.out.print("Digite un valor de tipo double: ");
                        numero4 = entrada.nextDouble();

                        resultado = numero1 + numero3;
                        resultado2 = numero2 * numero4;

                        System.out.println("Resultado de la suma es : "+resultado);
                        System.out.println("Resultado de la multiplicacion es : "+resultado2);
                        break;

                    case 3 :
                        System.out.print("Digite un valor : ");
                        numero1 = entrada.nextInt();
                        resultadoInt = ((numero1 + 77) - 3) * 2;
                        System.out.println("Se suma al numero escrito 77 , despues se le resto 3, juego se lo duplico y el resultado es : "+resultadoInt);
                        break;
                    case 4 :
                        System.out.println("Digite 4 valores");
                        a = entrada.nextInt();
                        b = entrada.nextInt();
                        c = entrada.nextInt();
                        d = entrada.nextInt();

                        d = c;
                        c = a;
                        a = d;
                        d = b;

                        System.out.print("Los valores han cambiado : "+a+" "+b+" "+c+" "+d+"\n");
                        break;
                    case 5 :
                        System.out.print("Digite un valor y se determinara si es par o impar : ");
                        numero1 = entrada.nextInt();
                        if(numero1%2== 0){
                            System.out.println("El numero es par");
                        }else{
                            System.out.println("El numero es impar");
                        }
                        break;

                    case 6 :
                        System.out.print("Digite un valor y veremos si es negatico o positivo : ");
                        numero1 = entrada.nextInt();
                        if(numero1>=0){
                            System.out.println("El numero es posivito");
                        }else{
                            System.out.println("El numero es negativo");
                        }
                        break;
                    case 7 :
                        System.out.print("Digite un valor y veremos que pasa : ");
                        numero1 = entrada.nextInt();

                        if(numero1>=0){
                            System.out.println("Es positivo...");
                        }else{
                            System.out.println("Es negativo...");
                        }
                        if(numero1%2 == 0){
                            System.out.println("Es par...");
                        }else{
                            System.out.println("Es impar...");
                        }
                        if(numero1%5 == 0){
                            System.out.println("Es multiplo de 5");
                        }else{
                            System.out.println("No es una verga multiplo de 5");
                        }
                        if(numero1%10 == 0){
                            System.out.println("Es multiplo de 10");
                        }else{
                            System.out.println("No no nadita de 10");
                        }
                        if(numero1 == 100){
                            System.out.println("Cara de verga pusiste el 100");
                        }else if(numero1 > 100){
                            System.out.println("Es mayor de 100");
                        }else{
                            System.out.println("Es menor de 100");
                        }
                        break;
                    case 8 :
                        System.out.print("Escriba su nombre : ");
                        entrada.nextLine();
                        nombre = entrada.nextLine();
                        System.out.println("Buenos dias, "+nombre);
                        break;
                    case 9 :
                        System.out.println("Digite un numero y le diremos el doble y el triple");
                        numero1 = entrada.nextInt();
                        resultado = numero1*2;
                        resultado2 = numero1*3;
                        System.out.println("El doble es : "+(int)resultado+" y el triple es : "+(int)resultado2);
                        break;
                    case 10 :
                        System.out.println("Introduzca los grados en  Fahrenheit y lo convertiremos a centígrados");
                        numero3 = entrada.nextDouble();
                        resultado = (numero3 - 32) * 5/9;
                        System.out.println("Los grados fahrenheit que usted puso son : "+numero3+" y seria en centigrados : "+resultado);
                        break;
                    case 11 :
                        /*11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y
                              muestra por pantalla la longitud y el área de la circunferencia.*/
                        System.out.print("Digite el valor del radio del circulo : ");
                        numero3 = entrada.nextDouble();
                        resultado = (numero3*2) * 3.1415;
                        System.out.print("La longitud del circulo es : "+resultado+"\n");
                        resultado2 = Math.pow(numero3,2) * 3.1415;
                        System.out.println("Y el area de ese circulo es : "+resultado2);
                        break;
                    case 12 :
                        /*12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.*/
                        System.out.println("Ingrese una velocidad en km/h...");
                        System.out.print("Ingrese los kilometros : ");
                        numero3 = entrada.nextDouble();
                        System.out.print("Ingrese las horas : ");
                        numero4 = entrada.nextDouble();

                        resultado = numero3 * 1000;
                        resultado2 = numero4 * 3600;

                        System.out.println("Serian : "+resultado+" metros / "+resultado2+" segundos");
                        break;
                    case 13 :
                        /*13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
                        longitud de la hipotenusa según el teorema de Pitágoras.*/
                        System.out.print("Digite los 2 catetos para sacar la hipotenusa : ");
                        numero3 = entrada.nextDouble();
                        numero4 = entrada.nextDouble();

                        resultado = Math.sqrt((Math.pow(numero3,2)+Math.pow(numero4,2)));
                        System.out.println("La hipotenusa es : "+resultado);
                        break;
                    case 14 :
                        /*14. Programa que calcula el volumen de una esfera.*/
                        System.out.print("Ingrese el radio de una esfera : ");
                        numero3 = entrada.nextDouble();
                        //numero4 = Math.pow(numero3,3);
                        resultado = Math.PI * Math.pow(numero3,3) * 4/3;
                        //System.out.println(numero4);
                        System.out.println("El volumen es : "+resultado);
                        break;
                    case 15 :
                        /*15. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.*/
                        System.out.println("Ingrese 3 putos lados de un triangulo y calcularemos la puta area : ");
                        e = entrada.nextInt();
                        f = entrada.nextInt();
                        g = entrada.nextInt();
                        perimetro = (e+f+g)/2;
                        resultado = Math.sqrt(perimetro*(perimetro-e)*(perimetro-f)*(perimetro-g));
                        System.out.println("El resultado es : "+resultado);
                        break;
                    case 16 :
                        /*16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.*/
                        System.out.print("Ingrese un numero de 3 cifras : ");
                        numero1 = entrada.nextInt();
                        System.out.println("Primera cifra de " + numero1 + " -> " + (numero1/100));
                        System.out.println("Cifra central de " + numero1 + " -> " + (numero1/10)%10);
                        System.out.println("Última cifra  de " + numero1 + " -> " + (numero1%10));
                        break;
                    case 17 :
                        /*17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan posiciones impares.*/
                        System.out.print("Digite un numero de 5 cifras : ");
                        numero3 = entrada.nextDouble();
                        resultado = numero3/10000;
                        resultado2 = (numero3/1000)%10;
                        resultado3 = (numero3/100)%10;
                        resultado4 = (numero3/10)%10;
                        resultado5 = (numero3%10);

                        if((int)resultado%2 == 0){
                            System.out.println("Es Par...");
                        }else{
                            System.out.println("Es Impar...");
                        }
                        if((int)resultado2%2 == 0){
                            System.out.println("Es Par...");
                        }else{
                            System.out.println("Es Impar...");
                        }
                        if((int)resultado3%2 == 0){
                            System.out.println("Es Par...");
                        }else{
                            System.out.println("Es Impar...");
                        }
                        if((int)resultado4%2 == 0){
                            System.out.println("Es Par...");
                        }else{
                            System.out.println("Es Impar...");
                        }
                        if((int)resultado5%2 == 0){
                            System.out.println("Es Par...");
                        }else{
                            System.out.println("Es Impar...");
                        }

                        /*System.out.println((int)resultado);
                        System.out.println((int)resultado2);
                        System.out.println((int)resultado3);
                        System.out.println((int)resultado4);
                        System.out.println((int)resultado5);*/
                        break;
                    case 18 :
                        /*18.Programa que lea tres números enteros H, M, S que contienen hora, minutos y
                            segundos respectivamente, y comprueba si la hora que indican es una hora válida.*/
                        System.out.println("Digite horas, minutos y segundo y veremos si lo puso bien : ");
                        System.out.print("Hora : ");
                        h = entrada.nextInt();
                        System.out.print("Minutos : ");
                        m = entrada.nextInt();
                        System.out.print("Segundos : ");
                        s = entrada.nextInt();

                        while(tata == true) {
                            if (h <= 24 && h > 0 && m <= 60 && m > 0 && s <= 60 && s > 0) {
                                System.out.println("Su hora es correcta : " + h + ":" + m + ":" + s);
                                tata = false;
                            } else {
                                System.out.println("Pusiste la hora como el orto");
                                System.out.println("Digite la hora de nuevo plis....");
                                System.out.print("Hora : ");
                                h = entrada.nextInt();
                                System.out.print("Minutos : ");
                                m = entrada.nextInt();
                                System.out.print("Segundos : ");
                                s = entrada.nextInt();
                            }
                        }
                        break;


                    case 19 :
                        System.out.println("Gracias por usar nuestros programas...PUTO");
                        break;
                    default :
                        System.out.println("Opcion incorrecta,  tipea de nuevo");




                }




            }while(opcion!=19);



        }
}
