/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Esta Classe serve para definir um Curso, onde estarao contidos atributos e metodos para o mesmo.
 * @author jcunha
 */
public class Curso implements Serializable{
    /**
     * Atributo que indica um nome ao Curso.
     */
    private String nome;
    /**
     * Atributo que indica uma duracao ao Curso.
     */
    private int duracao;
    /**
     * Atributo que indica um grau ao Curso.
     */
    private String grau;
    /**
     * Atributo que indica uma lista disciplinas ao Curso.
     */
    private ArrayList<Disciplina> disciplinas;
    /**
     * Atributo que indica uma lista salas ao Curso.
     */
    private ArrayList<Sala> salas;
    /**
     * Atributo que indica uma lista funcionarios ao Curso.
     */
    private ArrayList<NaoDocente> funcionarios;
    /**
     * Construtor vazio para inicializar os ArrayLists.
     */
    public Curso() {
        this.disciplinas = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }
    /**
     * Construtor da Classe.
     * @param nome
     * @param duracao
     * @param grau
     * @param disciplinas
     * @param salas
     * @param funcionarios 
     */
    public Curso(String nome, int duracao, String grau, ArrayList<Disciplina> disciplinas, ArrayList<Sala> salas, ArrayList<NaoDocente> funcionarios){
        this.nome = nome;
        this.duracao = duracao;
        this.grau = grau;
        this.disciplinas = disciplinas;
        this.funcionarios = funcionarios;
        this.salas = salas;
    } 
    /**
     * Retorna a lista de Salas do Curso.
     * @return 
     */
    public ArrayList<Sala> getSalas() {
        return salas;
    }
    /**
     * Retorna a lista de Funcionarios.
     * @return 
     */
    public ArrayList<NaoDocente> getFuncionarios() {
        return funcionarios;
    }
    /**
     * Adiciona uma Disciplina à lista de Disciplinas.
     * @param disciplina 
     */
    public void addDisciplinas(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
    /**
     * Retorna a lista de Disciplinas.
     * @return 
     */
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    /**
     * Retorna a Disciplina no indice 'i' da lista de Disciplinas. 
     * @param i
     * @return 
     */
    public Disciplina getDisciplina(int i){
        return this.disciplinas.get(i);
    }
    /**
     * Retorna o Nome do Curso.
     * @return 
     */
    public String getNome() {
        return nome;
    }
    /**
     * Retorna o numero de diciplinas do Curso.
     * @return 
     */
    public int disciplinaSize() {
        return this.disciplinas.size();
    }
    /**
     * Retorna a duracao do Curso.
     * @return 
     */
    public int getDuracao() {
        return this.duracao;
    }
    /**
     * Retorna o grau do Curso.
     * @return 
     */
    public String getGrau() {
        return this.grau;
    }
    /**
     * Returna as Informacoes do Curos no formato String. 
     * @return 
     */
    @Override
    public String toString(){
        return String.format("Curso: %s\nDuraçao: %d\nGrau: %s\n", this.nome, this.duracao, this.grau);
    }
}
