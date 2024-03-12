package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.InmortalUseCase;
import udem.edu.co.modelo.impl.HeroeImpl;
import udem.edu.co.modelo.impl.InmortalImpl;

/**
 * Definición de la clase InmortalUseCaseImpl, que implementa la interfaz InmortalUseCase
 */
public class InmortalUseCaseImpl implements InmortalUseCase {

    /**
     * Atributo para almacenar una instancia de InmortalImpl
     */
    private InmortalImpl inmortal;

    /**
     * Constructor que recibe una instancia de InmortalImpl y la asigna al atributo correspondiente
     */
    public InmortalUseCaseImpl(InmortalImpl inmortal) {
        this.inmortal = inmortal;
    }

    /**
     * Método para agregar un héroe inmortal
     */
    public void agregarSevenInmortal(HeroeImpl heroe) {
        /**
         * Declaramos una variable para almacenar un héroe repetido, inicialmente null
         */
        HeroeImpl heroeRepetido = null;
        /**
         * Recorremos la lista de héroes inmortales existentes
         */
        for (HeroeImpl repetidoSuper : inmortal.getListaHeroes()) {
            /**
             * Verificamos si el héroe ya está en la lista
             */
            if (repetidoSuper.getNombre().equals(heroe.getNombre())) {
                heroeRepetido = repetidoSuper;
                break;
                /**
                 * Terminamos el bucle porque ya encontramos al héroe repetido
                 */
            }
        }
        /**
         * Si el héroe ya está en la lista, le agregamos la categoría "Inmortal"
         */
        if (heroeRepetido != null) {
            heroeRepetido.getCategoria().add("Inmortal");
        } else {
            /**
             * Si el héroe no está en la lista, agregamos la categoría "Inmortal" y lo añadimos a la lista de héroes inmortales
             */
            heroe.getCategoria().add("Inmortal");
            inmortal.getListaHeroes().add(heroe);
        }
    }
}
