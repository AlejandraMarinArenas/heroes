package udem.edu.co.modelo.impl;

import udem.edu.co.modelo.Heroe;
import java.util.List;

/**
 * Definición de la clase HeroeImpl, que implementa la interfaz Heroe
 */
public class HeroeImpl implements Heroe {

    /**
     * Atributo para almacenar el nombre del héroe
     */
    private String nombre;

    /**
     * Atributo para almacenar las categorías a las que pertenece el héroe
     */
    private List<String> categoria;

    /**
     * Constructor que inicializa el nombre y la lista de categorías del héroe
     */
    public HeroeImpl(String nombre, List<String> categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }
    /**
     * Método getter para obtener el nombre del héroe
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre del héroe
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener la lista de categorías del héroe
     */
    public List<String> getCategoria() {
        return categoria;
    }

    /**
     * Método setter para establecer la lista de categorías del héroe
     */
    public void setCategoria(List<String> categoria) {
        this.categoria = categoria;
    }
}
