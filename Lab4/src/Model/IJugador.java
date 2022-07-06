/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public interface IJugador {
     /**
     * Entrega la información del jugador en forma de string 
     * para poder mostrarselo al usuario.
     * @return String. 
     */
    @Override
    public String toString();
    
    /**
     * Se compara jugadores y se verifica o no si son iguales.
     * Un jugador será igual al otro si estos 2 tienen el mismo nombre.
     * @param j jugador con el que se hace la comparación.
     * @return booleano
     */
    public Boolean equals(Jugador j);
    
    /**
     * Permite sumarle 1 al score del jugador, 
     * se usa en la jugada "Spotit" cuando en necesario.
     */
    public void setScore();
}

