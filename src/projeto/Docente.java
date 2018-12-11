/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;

/**
 * Esta Classe é uma subclasse da Classe Pessoa que serve para definir um Docente, onde estarao contidos atributos e metodos para o mesmo.
 * @author jcunha
 */
public class Docente extends Pessoa implements Serializable{
    /**
     * Atributo que indica uma Categoria ao Docente.
     */
    private String categoria;
    /**
     * Atributo que indica uma Area de Investigacao ao Docente.
     */
    private String investigaçao;

    /**
     * Construtor do Docente.
     * @param nome
     * @param mail
     * @param num
     * @param categoria
     * @param investigaçao
     */
    public Docente(String nome, String mail, long num, String categoria, String investigaçao){
        super(nome, mail, num);
        this.categoria = categoria;
        this.investigaçao = investigaçao;
    }
    /**
     * Returna as Informacoes do Docente no formato String.
     * @return 
     */
    @Override
    public String toString(){
        return String.format("%sCategoria: %s\nInvestigaçao: %s", super.toString(), this.categoria, this.investigaçao);
    }
}