/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Esta Classe serve para definir uma Disciplina, onde estarao contidos atributos e metodos para o mesmo.
 * @author Asus
 */
public class Disciplina implements Serializable{
    /**
     * Atributo que indica um Nome a Disciplina.
     */
    private String nome;
    /**
     * Atributo que indica um Docente´Responsavel a Disciplina.
     */
    private Docente docente_responsavel;
    /**
     * Atributo que representa uma Lista de Docentes da Disciplina.
     */
    private ArrayList<Docente> docentes;
    /**
     * Atributo que representa uma Lista de Alunos da Disciplina.
     */
    private ArrayList<Aluno> alunos;
    
    /**
     *
     * @param nome
     * @param docente_responsavel
     * @param docentes
     * @param alunos
     */
    public Disciplina(String nome, Docente docente_responsavel, ArrayList<Docente> docentes, ArrayList<Aluno> alunos){
        this.nome = nome;
        this.docente_responsavel = docente_responsavel;
        this.docentes = docentes;
        this.alunos = alunos;
    }

    /**
     *
     * @return
     */
    public String getNome(){
        return this.nome;
    }

    /**
     *
     * @return
     */
    public Docente getDocente(){
        return this.docente_responsavel;
    }

    /**
     *
     * @return
     */
    public ArrayList<Docente> get_Docentes(){
        return this.docentes;
    }

    /**
     *
     * @return
     */
    public ArrayList<Aluno> get_Alunos(){
        return this.alunos;
    }

    /**
     *
     * @param aluno
     */
    public void Add_aluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.format("Disciplina: %s\nDocente Responsavel: %s", this.nome, docente_responsavel.getNome());
    }
}
