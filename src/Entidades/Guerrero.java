/*
En esta clase se crea un tipo de personaje con clase guerrero el cual tiene diversas estadisticas al comun del usuario,
ademas, este tiene un tipo de uso de objetos diferentes a las demas clases
 */

package Entidades;
import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Guerrero extends Personaje {

    public int espada;

    public Guerrero(String nombre, int fuerza, int inteligencia, int defensa, int vida, int espada) {
        super(nombre, fuerza, inteligencia, defensa, vida);
        this.espada = espada;
    }

    public void cambiarArma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige un arma: (1) Acero Valyrio, daño 8. (2) Matadragones, daño 10");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                this.espada = 8;
                break;
            case 2:
                this.espada = 10;
                break;
            default:
                System.out.println("Número de arma incorrecta");
                break;
        }
    }
    @Override
    public void atributos() {
        super.atributos();
        System.out.println("·Espada: " + this.espada);
    }

    @Override
    public int dano(Personaje enemigo) {
        return this.fuerza * this.espada - enemigo.defensa;
    }
}
