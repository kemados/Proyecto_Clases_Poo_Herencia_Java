/*
Un pequeño ejemplo de como poder hacer con todas las posibilidades que tiene POO diversas cosas.
 */
package poo_completo;

import static Entidades.Combate.combate;
import Entidades.Guerrero;
import Entidades.Mago;


/**
 *
 * @author Emanuel
 */
public class POO_Completo {
    public static void main(String[] args) {
        Guerrero personaje1 = new Guerrero("Guts", 20, 10, 4, 100, 4);
        Mago personaje2 = new Mago("Vanessa", 5, 15, 4, 100, 3);

        personaje1.atributos();
        personaje2.atributos();

        combate(personaje1, personaje2);
    }

}
