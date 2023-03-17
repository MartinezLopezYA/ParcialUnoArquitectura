package Parcial;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner comand = new Scanner(System.in);

        Local l;

        Distancia d  = new Distancia();
        d.setCostoDistancia(1200);
        Celular c  = new Celular();
        c.setCostoCelular(850);
        ArrayList <Telefonia> listTelefonia = new ArrayList<>();
        ArrayList <Local> listLocal = new ArrayList<>();
        ArrayList <Celular> listCelular = new ArrayList<>();
        ArrayList <Distancia> listDistancia = new ArrayList<>();

        /*
        * Se quiere crear una aplicación para controlar los gastos telefónicos de una empresa.
        * La empresa cuenta con tres líneas telefónicas a través de las cuales se pueden realizar
        * llamadas locales, de larga distancia y a celulares.
La empresa cuenta con planes telefónicos que establece las siguientes tarifas:
Minuto Llamada Local: $60 pesos
Minuto Llamada Larga Distancia: $1200 pesos
Minuto Llamada Celular: $850 pesos
La aplicación debe permitir:
1. Registrar una llamada en alguna de las líneas,
2. Mostrar la información detallada de cada línea (número de llamadas realizadas,
* duración total de las llamadas en minutos y el costo total de las llamadas en pesos)
3. Mostrar un consolidado total de la información de todas las líneas (costo total en
* pesos de las tres líneas, número total de llamadas realizadas, duración total de llamadas
* en minutos y el cálculo del costo promedio por minuto según el costo total y el total de minutos).
Adicionalmente, la aplicación debe permitir
4. Reiniciar el uso las líneas telefónicas, dejando todos sus valores en cero.*/
        int opc;
        boolean salir = false;




        while(!salir){
            System.out.println("1. Registrar una llamada en alguna de las lineas");
            System.out.println("2. Mostrar la información detallada de cada línea");
            System.out.println("3. Mostrar un consolidado total de la información de todas las líneas");
            System.out.println("4. Reiniciar el uso de las líneas telefónicas");
            System.out.println("5. Salir del programa");
            System.out.print("Elige una opción: ");
            opc = comand.nextInt() ;
            switch (opc){
                case 1:
                    System.out.println("1. Local");
                    System.out.println("2. Distancia");
                    System.out.println("3. Celular");
                    System.out.print("A que linea va a registrar la llamada: ");
                    int o = comand.nextInt();
                    if (o == 1){
                        l = new Local();
                        l.setCostoLocal(60);
                        l.setnLlamadas(+1);
                        l.setDuracionLlamada(20);
                        l.setCostoLlamada(l.getCostoLocal()*l.getDuracionLlamada());
                        listTelefonia.add(l);
                        listLocal.add(l);
                    } else if (o == 2){

                        d.setCostoDistancia(1200);
                        d.setnLlamadas(+1);
                        d.setDuracionLlamada(8);
                        d.setCostoLlamada(d.getCostoDistancia()*d.getDuracionLlamada());
                        listTelefonia.add(d);
                        listDistancia.add(d);
                    } else if (o == 3) {

                        c.setCostoCelular(800);
                        c.setnLlamadas(+1);
                        c.setDuracionLlamada(20);
                        c.setCostoLlamada(c.getCostoCelular()*c.getDuracionLlamada());
                        listTelefonia.add(c);
                        listCelular.add(c);
                    }
                    break;
                case 2:
                    System.out.println("1. Local");
                    System.out.println("2. Distancia");
                    System.out.println("3. Celular");
                    System.out.println("4. Todas");
                    System.out.print("Que linea va a mostrar las llamada: ");
                    int a = comand.nextInt();
                    if (a == 1){
                        System.out.println("Hay " + listLocal.size());
                        System.out.println(listLocal.toString());
                    } else if (a == 2){
                        System.out.println("Hay " + listDistancia.size());
                        System.out.println(listDistancia.toString());
                    } else if (a == 3) {
                        System.out.println("Hay " + listCelular.size());
                        System.out.println(listCelular.toString());
                    } else if (a == 4){
                        System.out.println("Hay " + listTelefonia.size());
                        System.out.println(listTelefonia.toString());
                    }
                    break;
                case 3:

                    break;
                case 4:


                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("¡¡¡Opción invalida!!!");
            }
        }

    }
}