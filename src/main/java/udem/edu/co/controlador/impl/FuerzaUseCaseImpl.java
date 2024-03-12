package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.FuerzaUseCase;
import udem.edu.co.modelo.impl.FuerzaImpl;
import udem.edu.co.modelo.impl.HeroeImpl;



public class FuerzaUseCaseImpl implements FuerzaUseCase {
    /**
     * Referencia a la implementación de Fuerza
     */
    private FuerzaImpl fuerza;

    public FuerzaUseCaseImpl(FuerzaImpl fuerza) {

        this.fuerza = fuerza;
    }
    /**
     * Método para agregar la categoría "Fuerte" a un héroe y agregarlo a la lista si no está repetido
     */

    public void agregarSevenFuerza(HeroeImpl heroe) {
        HeroeImpl heroeRepetido = null;
        /**
         * Iterar sobre la lista de héroes en FuerzaImpl
         */
        for (HeroeImpl repetido : fuerza.getListaSevens()) {
            /**
             * Verificar si el héroe ya está en la lista
             */
            if (repetido.getNombre().equals(heroe.getNombre())) {
                heroeRepetido = repetido;
                break;
            }
        }
        /**
         * Si el héroe ya está en la lista, agregar la categoría "Fuerte" a su lista de categorías
         */
        if (heroeRepetido != null) {
            heroeRepetido.getCategoria().add("Fuerte");
        } else {
            /**
             * Si el héroe no está en la lista, agregar la categoría "Fuerte" a su lista de categorías
             */
            heroe.getCategoria().add("Fuerte");
            /**
             * Agregar el héroe a la lista de héroes en FuerzaImpl
             */
            fuerza.getListaSevens().add(heroe);
        }
    }
}
