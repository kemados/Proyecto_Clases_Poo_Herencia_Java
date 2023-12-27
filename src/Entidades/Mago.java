/*
En esta clase se crea un tipo de personaje con clase mago el cual tiene diversas estadisticas al comun del usuario,
ademas, este tiene un tipo de uso de objetos diferentes a las demas clases
 */
package Entidades;

/**
 *
 * @author Emanuel
 */
public class Mago extends Personaje {

    public int libro;

    public Mago(String nombre, int fuerza, int inteligencia, int defensa, int vida, int libro) {
        super(nombre, fuerza, inteligencia, defensa, vida);
        this.libro = libro;
    }

    @Override
    public void atributos() {
        super.atributos();
        System.out.println("·Libro: " + this.libro);
    }

    @Override
    public int dano(Personaje enemigo) {
        return this.inteligencia * this.libro - enemigo.defensa;
    }
}
