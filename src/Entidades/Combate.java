/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Emanuel
 */
public class Combate {
        public static void combate(Personaje jugador1, Personaje jugador2) {
        int turno = 0;
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.println("\nTurno " + turno);
            System.out.println(">>> Acción de " + jugador1.nombre + ":");
            jugador1.atacar(jugador2);
            System.out.println(">>> Acción de " + jugador2.nombre + ":");
            jugador2.atacar(jugador1);
            turno++;
        }
        if (jugador1.estaVivo()) {
            System.out.println("\nHa ganado " + jugador1.nombre);
        } else if (jugador2.estaVivo()) {
            System.out.println("\nHa ganado " + jugador2.nombre);
        } else {
            System.out.println("\nEmpate");
        }
    }
}
