package udem.edu.co.controlador.impl;

import udem.edu.co.controlador.VelozUseCase;
import udem.edu.co.modelo.impl.HeroeImpl;
import udem.edu.co.modelo.impl.VelozImpl;

/**
 * Definición de la clase VelozUseCaseImpl, que implementa la interfaz VelozUseCase
 */
public class VelozUseCaseImpl implements VelozUseCase {

    /**
     * Atributo para almacenar una instancia de VelozImpl
     */
    private VelozImpl veloz;

    /**
     * Constructor que recibe una instancia de VelozImpl y la asigna al atributo correspondiente
     */
    public VelozUseCaseImpl(VelozImpl veloz) {
        this.veloz = veloz;
    }
    /**
     * Método para agregar un héroe veloz
     */
    public void agregarSevenVeloz(HeroeImpl heroe) {

        /**
         * Declaramos una variable para almacenar un héroe repetido, inicialmente null
         */
        HeroeImpl heroeRepetido = null;

        /**
         * Recorremos la lista de héroes veloces existentes
         */
        for (HeroeImpl repetido :veloz.getListaHeroes()) {

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
         * Si el héroe ya está en la lista, le agregamos la categoría "Veloz"
         */
        if (heroeRepetido != null) {
            heroeRepetido.getCategoria().add("Veloz");
        }

        else {
            /**
             * Si el héroe no está en la lista, agregamos la categoría "Veloz" y lo añadimos a la lista de héroes veloces
             */
            heroe.getCategoria().add("Veloz");
            veloz.getListaHeroes().add(heroe);
        }
    }
}
