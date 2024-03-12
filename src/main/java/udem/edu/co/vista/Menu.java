package udem.edu.co.vista;

import udem.edu.co.modelo.impl.HeroeImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

/**
 * Definición de la clase Menu
 */
public class Menu {
    private Scanner scanner;
    private boolean menuListado = false;
    private List<HeroeImpl> heroes;
    private List<HeroeImpl> heroese = new ArrayList<>();


    /**
     * Constructor de la clase Menu
     */
    public Menu(List<HeroeImpl> fuerza,List<HeroeImpl> inmortal,List<HeroeImpl> veloz,List<HeroeImpl> volar) {
        this.scanner = new Scanner(System.in);
        this.menuListado = menuListado;

        /**
         * Se agregan los héroes de todas las categorías a una lista general
         */
        for (HeroeImpl lheroe: fuerza) {
            heroese.add(lheroe);
        }
        for (HeroeImpl lheroe: inmortal) {
            heroese.add(lheroe);
        }
        for (HeroeImpl lheroe: veloz) {
            heroese.add(lheroe);
        }
        for (HeroeImpl lheroe: volar) {
            heroese.add(lheroe);
        }
        this.heroes = heroese;
    }

    /**
     * Método para listar un texto
     */
    public void listarTexto(String texto) {
        System.out.println(texto);
    }

    /**
     * Método para listar los héroes
     */
    public void listarHeroes(List<HeroeImpl> heroes) {
        System.out.println("   ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄ The Seven Disponibles ⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n");
        for (HeroeImpl heroe : heroes) {
            System.out.println(heroe.getNombre() + " ⠄⠄⠄:> " + heroe.getCategoria());
        }
    }

    /**
     * Método para listar héroes de una categoría específica
     */
    private void listarHeroesCategoria(String categoria) {
        List<HeroeImpl> filtrados = new ArrayList<>();
        for (HeroeImpl heroeImpl : heroes) {
            if (heroeImpl.getCategoria().contains(categoria)) {
                switch (categoria) {
                    case "Fuerte" ->
                            filtrados.add(new HeroeImpl(heroeImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Volador" ->
                            filtrados.add(new HeroeImpl(heroeImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Inmortal" ->
                            filtrados.add(new HeroeImpl(heroeImpl.getNombre(), Collections.singletonList(categoria)));
                    case "Veloz" ->
                            filtrados.add(new HeroeImpl(heroeImpl.getNombre(), Collections.singletonList(categoria)));
                    default -> filtrados.add(heroeImpl);
                }
            }
        }

        listarHeroes(filtrados) ;
    }

    /**
     * Método para listar el menú y obtener la opción seleccionada por el usuario
     */
    public int listarMenu() {
        if (!menuListado) {
            System.out.println("Heroes de mi programita, holi, soy alejita\n");
        }
            System.out.println("1. Todos los heroes \n");
            System.out.println("2. Heroes fuerza \n");
            System.out.println("3. Heroes voladores \n");
            System.out.println("4. Heroes inmortales \n");
            System.out.println("8. Heroes Veloces \n");
            System.out.println("11. Se acabo el programa \n");
            System.out.print("Elija un numero parcero, se le tiene lo mas agogo de codigo limpio: ");
            menuListado = true;
        return scanner.nextInt();
    }

    /**
     * Método principal para ejecutar el programa
     */
    public void correrPrograma() {
        int opcion;
        do {
            opcion = listarMenu();
            switch (opcion) {
                case 1:
                    listarHeroes(heroes);
                    break;
                case 2:
                    listarHeroesCategoria("Fuerte");
                    break;
                case 3:
                    listarHeroesCategoria("Volador");
                    break;
                case 4:
                    listarHeroesCategoria("Inmortal");
                    break;
                case 9:
                    listarHeroesCategoria("Veloz");
                    break;
                case 11:
                    listarTexto("Adios");
                    break;
                default:
                    listarTexto("Digita correctamente, por favor.");
            }
        }

        while(opcion != 11);
    }
}
