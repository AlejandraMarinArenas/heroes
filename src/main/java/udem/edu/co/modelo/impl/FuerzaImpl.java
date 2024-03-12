package udem.edu.co.modelo.impl;

import udem.edu.co.modelo.Fuerza;

import java.util.ArrayList;
import java.util.List;

/**
 * Definición de la clase FuerzaImpl, que implementa la interfaz Fuerza
 */
public class FuerzaImpl implements Fuerza {

    /**
     * Lista para almacenar los héroes relacionados con la fuerza
     */
    private List<HeroeImpl> listaSevens;

    /**
     * Constructor que inicializa la lista de héroes
     */
    public FuerzaImpl() {
        this.listaSevens = new ArrayList<>();
    }
    /**
     * Método getter para obtener la lista de héroes relacionados con la fuerza
     */
    public List<HeroeImpl> getListaSevens() {
        return listaSevens;
    }

    /**
     * Método setter para establecer la lista de héroes relacionados con la fuerza
     */
    public void setListaSevens(List<HeroeImpl> listaSevens) {
        this.listaSevens = listaSevens;
    }
}
