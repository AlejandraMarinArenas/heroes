package udem.edu.co.modelo.impl;

import udem.edu.co.modelo.Volador;

import java.util.List;

/**
 * Definición de la clase VoladorImpl, que implementa la interfaz Volador
 */
public class VoladorImpl implements Volador {
    /**
     * Atributo para almacenar la lista de héroes voladores
     */
    private List<HeroeImpl> listaHeroes;

    /**
     * Constructor que inicializa la lista de héroes voladores (hay un error aquí, vea la corrección)
     */
    public VoladorImpl() {
        this.listaHeroes = listaHeroes;
    }

    /**
     * Método getter para obtener la lista de héroes voladores
     */
    public List<HeroeImpl> getListaHeroes() {
        return listaHeroes;
    }

    /**
     * Método setter para establecer la lista de héroes voladores
     */
    public void setListaHeroes(List<HeroeImpl> listaHeroes) {
        this.listaHeroes = listaHeroes;
    }
}
