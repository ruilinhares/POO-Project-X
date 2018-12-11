/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;

/**
 * Esta classe abstrata contem todas as informacoes gerais para cada tipo de pessoa do progama.
 * @author jcunha
 */
abstract class Pessoa implements Serializable{
    /**
     * Atributo que indica um nome a Pessoa.
     */
    protected String nome;
    /**
     * Atributo que indica um Mail a Pessoa.
     */
    protected String mail;
    /**
     * Atributo que indica um Numero Mecanografico a Pessoa.
     */
    protected long num;
    /**
     * Construtor da Pessoa.
     * @param nome
     * @param mail
     * @param num 
     */
    public Pessoa(String nome, String mail, long num){
        this.nome = nome;
        this.mail = mail;
        this.num = num;
    }
    /**
     * Retorn o Nome da Pessoa.
     * @return 
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Retorn o Mail da Pessoa.
     * @return 
     */
    public String getMail(){
        return this.mail;
    }
    /**
     * Retorna o Numero Mecanografico da Pessoa.
     * @return 
     */
    public long getNum(){
        return this.num;
    }
    /**
     * Returna as Informacoes da Pessoa no formato String.
     * @return 
     */
    @Override
    public String toString(){
        return String.format("nome: %s\nmail: %s\nnum: %d \n", this.nome, this.mail, this.num);
    }
}



