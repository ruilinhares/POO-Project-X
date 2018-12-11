/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;

/**
 * Esta Classe serve para definir uma Sala, onde estarao contidos atributos e metodos para o mesmo.
 * @author Asus
 */
public class Sala implements Serializable{
    /**
     * Atributo que indica uma Letra a Torre da Sala.
     */
    private char torre;
    /**
     * Atributo que indica um numeros a Sala.
     */
    private char numSala;

    /**
     * Construtor da Sala.
     * @param departamento
     * @param numSala
     */
    public Sala(char departamento, char numSala) {
        this.torre = departamento;
        this.numSala = numSala;
    }

    /**
     * Retorna a Letra da Torre da Sala.
     * @return
     */
    public char getTorre() {
        return torre;
    }

    /**
     * Retorna o numero da Sala
     * @return
     */
    public int getNumSala() {
        return numSala;
    }

    /**
     * Returna a Sala no formato String.
     * @return
     */
    @Override
    public String toString() {
        return torre + "." + numSala;
    }   
}
