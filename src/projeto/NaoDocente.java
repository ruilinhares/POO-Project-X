/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;

/**
 * Esta Classe é uma subclasse da Classe Pessoa que serve para definir um Funcionario(Nao Docente), onde estarao contidos atributos e metodos para o mesmo.
 * @author jcunha
 */
public class NaoDocente extends Pessoa implements Serializable{
    /**
     * Atributo que indica uma Categoraia ao Exame.
     */
    private String categoria;
    /**
     * Atributo que indica um Cargo ao Exame.
     */
    private String cargo;
    /**
     * Contrutor do Funcionario(Nao Docente).
     * @param nome
     * @param mail
     * @param num
     * @param categoria
     * @param cargo
     */
    public NaoDocente(String nome, String mail, long num, String categoria, String cargo){
        super(nome, mail, num);
        this.categoria = categoria;
        this.cargo = cargo;
    }
    /**
     * Returna as Informacoes do Funcionario no formato String.
     * @return
     */
    @Override
    public String toString(){
        return String.format("%sCategoria: %s\ncargo: %s", super.toString(), this.categoria, this.cargo);
    }
}