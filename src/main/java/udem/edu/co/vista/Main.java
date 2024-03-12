package udem.edu.co.vista;

import udem.edu.co.controlador.impl.*;
import udem.edu.co.modelo.impl.*;

import java.util.ArrayList;

import java.util.List;

/**
 * Clase principal que sirve como punto de entrada del programa
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Creación de una lista de héroes
         */
        List<HeroeImpl> listaHeroe = new ArrayList<>();

        /**
         * Creación de instancias de diferentes implementaciones de héroes y casos de uso relacionados
         */
        FuerzaImpl heroeFuerza = new FuerzaImpl();
        FuerzaUseCaseImpl fuerza = new FuerzaUseCaseImpl(heroeFuerza);
        fuerza.agregarSevenFuerza(new HeroeImpl("Black Panther", new ArrayList<>()));
        fuerza.agregarSevenFuerza(new HeroeImpl("Spider Man", new ArrayList<>()));
        fuerza.agregarSevenFuerza(new HeroeImpl("Capitan America", new ArrayList<>()));
        fuerza.agregarSevenFuerza(new HeroeImpl("Ant Man", new ArrayList<>()));

        /**
         * Agrega más héroes con fuerza
         */
        InmortalImpl heroeInmortal = new InmortalImpl();
        InmortalUseCaseImpl inmortal = new InmortalUseCaseImpl(heroeInmortal);
        inmortal.agregarSevenInmortal(new HeroeImpl("Dead Pool", new ArrayList<>()));
        inmortal.agregarSevenInmortal(new HeroeImpl("Hulk", new ArrayList<>()));
        inmortal.agregarSevenInmortal(new HeroeImpl("Lobo", new ArrayList<>()));
        inmortal.agregarSevenInmortal(new HeroeImpl("Super Man", new ArrayList<>()));

        /**
         * Agrega más héroes inmortales
         */

        VelozImpl heroeVeloz = new VelozImpl();
        VelozUseCaseImpl veloz = new VelozUseCaseImpl(heroeVeloz);
        veloz.agregarSevenVeloz(new HeroeImpl("Flash", new ArrayList<>()));
        veloz.agregarSevenVeloz(new HeroeImpl("Super Girl", new ArrayList<>()));
        veloz.agregarSevenVeloz(new HeroeImpl("Ghost Rider", new ArrayList<>()));
        veloz.agregarSevenVeloz(new HeroeImpl("Aurora", new ArrayList<>()));

        /**
         * Agrega más héroes veloces
         */

        VoladorImpl heroeVolador = new VoladorImpl();
        VoladorUseCaseImpl volador = new VoladorUseCaseImpl(heroeVolador);
        volador.agregarSevenVolador(new HeroeImpl("Falcon", new ArrayList<>()));
        volador.agregarSevenVolador(new HeroeImpl("Iron man", new ArrayList<>()));
        volador.agregarSevenVolador(new HeroeImpl("Hawk Man", new ArrayList<>()));
        volador.agregarSevenVolador(new HeroeImpl("Katar Hol", new ArrayList<>()));

        /**
         * Agrega más héroes voladores
         */

        /**
         * Creación de una instancia de la clase Menu y se le pasan las listas de héroes de cada tipo
         */
        Menu menu = new Menu(heroeVolador.getListaHeroes(),heroeInmortal.getListaHeroes(),heroeVeloz.getListaHeroes(),heroeVolador.getListaHeroes());

        /**
         * Ejecución del programa
         */
        menu.correrPrograma();
    }
}
