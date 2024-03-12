package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.VoladorUseCase;
import udem.edu.co.modelo.impl.HeroeImpl;
import udem.edu.co.modelo.impl.VoladorImpl;


/**
 * Definición de la clase VoladorUseCaseImpl, que implementa la interfaz VoladorUseCase
 */
public class VoladorUseCaseImpl implements VoladorUseCase {

    /**
     * Atributo para almacenar una instancia de VoladorImpl
     */
    private VoladorImpl volador;

    /**
     * Constructor que recibe una instancia de VoladorImpl y la asigna al atributo correspondiente
     */
    public VoladorUseCaseImpl(VoladorImpl volador) {

        this.volador = volador;
    }
    /**
     * Método para agregar un héroe volador
     */
    public void agregarSevenVolador(HeroeImpl heroe) {
        /**
         * Declaramos una variable para almacenar un héroe repetido, inicialmente null
         */
        HeroeImpl heroeRepetido = null;

        /**
         * Recorremos la lista de héroes voladores existentes
         */
        for (HeroeImpl repetido : volador.getListaHeroes()) {
            /**
             * Verificamos si el héroe ya está en la lista
             */
            if (repetido.getNombre().equals(heroe.getNombre())) {
                heroeRepetido = repetido;
                break;
                /**
                 * Terminamos el bucle porque ya encontramos al héroe repetido
                 */
            }
        }
        /**
         * Si el héroe ya está en la lista, le agregamos la categoría "Volador"
         */
        if (heroeRepetido != null) {
            heroeRepetido.getCategoria().add("Volador");
        }

        else {
            /**
             * Si el héroe no está en la lista, agregamos la categoría "Volador" y lo añadimos a la lista de héroes voladores
             */
            heroe.getCategoria().add("Volador");
            volador.getListaHeroes().add(heroe);
        }
    }
}
