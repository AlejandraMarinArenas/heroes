package udem.edu.co.modelo.impl;

import udem.edu.co.modelo.Veloz;

import java.util.List;

/**
 * Definición de la clase VelozImpl, que implementa la interfaz Veloz
 */
public class VelozImpl implements Veloz {

    /**
     * Atributo para almacenar la lista de héroes veloces
     */
    private List<HeroeImpl> listaHeroes;

    /**
     * Constructor que inicializa la lista de héroes veloces
     */
    public VelozImpl() {
        this.listaHeroes = listaHeroes;
    }

    /**
     *Método getter para obtener la lista de héroes veloces
     */
    public List<HeroeImpl> getListaHeroes() {
        return listaHeroes;
    }

    /**
     * Método setter para establecer la lista de héroes veloces
     */
    public void setListaHeroes(List<HeroeImpl> listaHeroes) {
        this.listaHeroes = listaHeroes;
    }
}
