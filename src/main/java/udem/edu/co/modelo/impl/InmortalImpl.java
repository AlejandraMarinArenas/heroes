package udem.edu.co.modelo.impl;

import udem.edu.co.modelo.Inmortal;

import java.util.List;

/**
 * Definición de la clase InmortalImpl, que implementa la interfaz Inmortal
 */
public class InmortalImpl implements Inmortal {

    /**
     * Atributo para almacenar la lista de héroes inmortales
     */
    private List<HeroeImpl> listaHeroes;

    /**
     * Constructor que inicializa la lista de héroes inmortales (puede haber un error aquí, vea la corrección)
     */
    public InmortalImpl() {
        this.listaHeroes = listaHeroes;
    }

    /**
     * Método getter para obtener la lista de héroes inmortales
     */
    public List<HeroeImpl> getListaHeroes() {
        return listaHeroes;
    }

    /**
     * Método setter para establecer la lista de héroes inmortales
     */
    public void setListaHeroes(List<HeroeImpl> listaHeroes) {
        this.listaHeroes = listaHeroes;
    }
}

