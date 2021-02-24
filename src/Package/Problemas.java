package Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Sebastian Roa S
 */
public class Problemas {

    private Scanner input = new Scanner(System.in);
    private Stack pilaPlatos = new Stack();
    private Stack pilaPrecios = new Stack();
    private Jugador[] jugadores;

    //Problema E
    public void problemaE() {

        AlgoritmoProblemaE();

    }

    public void AlgoritmoProblemaE() {

        String TipoConsulta;

        System.out.println("Ingrese el numero de consultas (Q)");
        int cantidadConsultas = Integer.parseInt(input.nextLine());

        for (int i = 0; i < cantidadConsultas; i++) {

            System.out.println("Ingrese el tipo de consulta (1 o 2 costo)");
            TipoConsulta = input.nextLine();

            String tipoConsultaArray[] = Split(TipoConsulta);

            switch (tipoConsultaArray.length) {
                case 1:
                    if (pilaPlatos.empty()) {
                        System.out.println("No Food");
                    } else {
                        System.out.println(pilaPlatos.pop());
                    }
                    break;
                case 2:

                    pilaPlatos.push(tipoConsultaArray[1]);
                    pilaPrecios.push(tipoConsultaArray[0]);

                    break;
                default:
                    System.out.println("Entrada no valida");
                    i--;
                    break;
            }
        }
    }

    public String[] Split(String TipoConsulta) {

        String tipoConsultaArray[] = TipoConsulta.split(" ");
        return tipoConsultaArray;
    }

    public int[] intArray(String stringArray[]) {

        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        return intArray;
    }

    //ProblemaB
    public void ProblemaB() {

        algoritmoProblemaB();
    }

    public void algoritmoProblemaB() {

        //entrada de datos
        int casosPrueba;
        String cartasyJugadores;
        String valoresCartas;
        int valoresCartasArrayInt[] = null;
        String cartasyJugadoresArray[] = null;

        System.out.println("Ingrese la cantidad de casos de prueba (T)");
        casosPrueba = Integer.parseInt(input.nextLine());

        for (int i = 1; i < casosPrueba + 1; i++) {
            System.out.println("\n-------------------------------------------------------\n");
            System.out.println("Ingrese el numero de cartas y el numero de jugadores (4 2)");
            cartasyJugadores = input.nextLine();

            cartasyJugadoresArray = Split(cartasyJugadores);

            System.out.println("Ingrese las cartas");
            valoresCartas = input.nextLine();

            String valoresCartasArray[] = Split(valoresCartas);
            valoresCartasArrayInt = intArray(valoresCartasArray);

            System.out.println("Caso #" + i);
            SacarCartas(cartasyJugadoresArray, valoresCartasArrayInt);

        }

    }

    public void SacarCartas(String cartasyJugadoresArray[], int valoresCartasArrayInt[]) {

        int cantidadCartas = Integer.parseInt(cartasyJugadoresArray[0]);
        int cantidadJugadores = Integer.parseInt(cartasyJugadoresArray[1]);
        int contadorJugadores = 0;
        List<Integer> cartasList = new ArrayList<Integer>();

        cartasList = convertirLista(valoresCartasArrayInt);

        Jugador[] jugadores = crearJugadores(cantidadJugadores);

        List<Integer> cartasJugador = new ArrayList<Integer>();

        while (!cartasList.isEmpty()) {
            //mas jugadores que cartas
            
            if (cantidadJugadores > cantidadCartas) {
                
                for (int i = 0; i < cantidadCartas; i++) {
                    if (cartasList.get(0) > cartasList.get(cartasList.size() - 1)) {
                        cartasJugador.add(cartasList.get(0));
                        cartasList.remove(0);
                    } else {
                        cartasJugador.add(cartasList.get(cartasList.size() - 1));
                        cartasList.remove(cartasList.size() - 1);
                    }

                    jugadores[i].setCartas(cartasJugador);
                    cartasJugador.clear();
                }
                
            //mas cartas que jugadores
            } else {
                for (int i = 0; i < cantidadJugadores; i++) {

                    if (cartasList.get(0) > cartasList.get(cartasList.size() - 1)) {
                        cartasJugador.add(cartasList.get(0));
                        cartasList.remove(0);
                    } else {
                        cartasJugador.add(cartasList.get(cartasList.size() - 1));
                        cartasList.remove(cartasList.size() - 1);
                    }

                    jugadores[i].setCartas(cartasJugador);
                    cartasJugador.clear();
                }
                               
            }
            
        }
        
        IdentificarGanador(jugadores, cantidadJugadores);
    }

    public Jugador[] crearJugadores(int cantidadJugadores) {

        Jugador[] jugadores = new Jugador[cantidadJugadores];

        for (int i = 0; i < cantidadJugadores; i++) {

            jugadores[i] = new Jugador(i + 1);

        }

        return jugadores;
    }

    public List<Integer> convertirLista(int arreglo[]) {

        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < arreglo.length; i++) {
            myList.add(arreglo[i]);
        }

        return myList;
    }

    public void IdentificarGanador(Jugador[] jugadores, int cantidadJugadores) {

        int valorMaximo = 0;
        int jugadorGanador = 0;
        int resultados[] = new int[cantidadJugadores];
        List<Integer> Ganadores = new ArrayList<Integer>();

        for (int i = 0; i < cantidadJugadores; i++) {

            resultados[i] = jugadores[i].sumarCartas();
            if (jugadores[i].sumarCartas() > valorMaximo) {
                jugadorGanador = i;
                valorMaximo = jugadores[i].sumarCartas();
            }
        }

        Ganadores = validaEmpate(valorMaximo, resultados);
        
        if (Ganadores.size() == 1) {
            System.out.println("El jugador ganador es el : " + Ganadores.get(0));
        } else {
            System.out.println("Los ganadores son : " + Ganadores);
        }

    }

    public List<Integer> validaEmpate(int valorMaximo, int resultados[]) {

        List<Integer> Ganadores = new ArrayList<Integer>();

        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] == valorMaximo) {
                Ganadores.add(i + 1);
            }
        }

        return Ganadores;
    }
}
