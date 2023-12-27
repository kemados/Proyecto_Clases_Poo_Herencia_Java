/*
Este el usuario defenido para cuando se crea el personaje principal
*/
package Entidades;

/**
 *
 * @author Emanuel
 */
public class Personaje {

    public String nombre;
    public int fuerza;
    public int inteligencia;
    public int defensa;
    public int vida;

    public Personaje(String nombre, int fuerza, int inteligencia, int defensa, int vida) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.defensa = defensa;
        this.vida = vida;
    }

    public void atributos() {
        System.out.println(this.nombre + ":");
        System.out.println("·Fuerza: " + this.fuerza);
        System.out.println("·Inteligencia: " + this.inteligencia);
        System.out.println("·Defensa: " + this.defensa);
        System.out.println("·Vida: " + this.vida);
    }

    public void subirNivel(int fuerza, int inteligencia, int defensa) {
        this.fuerza += fuerza;
        this.inteligencia += inteligencia;
        this.defensa += defensa;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void morir() {
        this.vida = 0;
        System.out.println(this.nombre + " ha muerto");
    }

    public int dano(Personaje enemigo) {
        return this.fuerza - enemigo.defensa;
    }

    public void atacar(Personaje enemigo) {
        int dano = this.dano(enemigo);
        enemigo.vida -= dano;
        System.out.println(this.nombre + " ha realizado " + dano + " puntos de daño a " + enemigo.nombre);
        if (enemigo.estaVivo()) {
            System.out.println("Vida de " + enemigo.nombre + " es " + enemigo.vida);
        } else {
            enemigo.morir();
        }
    }
}
