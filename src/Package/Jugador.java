/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian Roa S
 */
public class Jugador {

    public Jugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }
    private int numeroJugador;
    private List<Integer> cartas = new ArrayList<Integer>();

    public List<Integer> getCartas() {
        return cartas;
    }

    public void setCartas(List<Integer> cartas) {

        this.cartas.add(cartas.get(0));

    }

    public int sumarCartas() {

        int suma = 0;

        if (cartas.isEmpty()) {
            suma = 0;
        } else {
            for (int i = 0; i < cartas.size(); i++) {
                suma += cartas.get(i);
            }
        }

        return suma;
    }

}
