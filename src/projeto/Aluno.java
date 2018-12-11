/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;

/**
 * Esta Classe é uma subclasse da Classe Pessoa que serve para definir um Aluno, onde estarao contidos atributos e metodos para o mesmo.
 * @author jcunha
 */
public class Aluno extends Pessoa implements Serializable{
    /**
     * Atributo que indica um numero de matriculas ao Aluno.
     */
    private int matriculas;
    /**
     * Atributo que indica um Curso ao Aluno.
     */
    private Curso curso;
    /**
     * Atributo que indica um regime ao Aluno.
     */
    private String regime;
    /**
     * Construtor do Aluno.
     * @param nome
     * @param mail
     * @param num
     * @param matriculas
     * @param curso
     * @param regime 
     */
    public Aluno(String nome, String mail, long num, int matriculas, Curso curso, String regime){
        super(nome, mail, num);
        this.matriculas = matriculas;
        this.regime = regime;
        this.curso = curso;
    }
    /**
     * Retorn o numero de Matriculas do Aluno.
     * @return 
     */
    public int getMatriculas() {
        return matriculas;
    }
    /**
     * Retorn o Regime do Aluno.
     * @return 
     */
    public String getRegime() {
        return regime;
    }
    /**
     * Retorna o Curso do Aluno.
     * @return 
     */
    public Curso getCurso() {
        return curso;
    }
    

    /**
     * Returna as Informacoes do Aluno no formato String.
     * @return
     */
    @Override
    public String toString(){
        return String.format("%smatriculas: %s\nregime: %s\n%s", super.toString(),this.matriculas, this.regime, curso.toString() );
    }
}
