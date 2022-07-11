/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ignac
 */
public interface ICardset {
    /**
     * Obtiene una carta del mazo referente a su posicion en el mazo
     * @param n entero que significa la posicion de la carta, puede ser desde 0 hasta el largo del mazo -1
     * @return Una carta
     */
    public Carta nthcard(Integer n);
    
     /**
     * Obtiene la cantidad de cartas que hay en el mazo
     * @return Un entero
     */
    public Integer numcard();
    
    /**
      * Permite saber si un mazo es válido según las reglas matemáticas que existen dentro del juego.
      * @return boolean 
      */
    public boolean isdobble();
    
    /**
     * Permite conocer las cartas que hacen falta para tener el mazo completo
     * @return Un mazo
     */
    public Cardset missingcards();
    
     /**
     * Transforma la información del mazo a un string para posteriormente mostrarselo al usuario
     * @return string
     */
    public String cardset_string();
    
    /**
      * Permite saber si dos mazos son iguales
      * @param cs1 mazo con el que se quiere saber la igualdad
      * @return booleano
      */
    public boolean equals(Cardset cs1);
}
