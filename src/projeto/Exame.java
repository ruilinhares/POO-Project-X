/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Esta classe serve para definir um Exame, onde estarao contidos atributos e metodos para o mesmo.
 * @author jcunha
 */
public class Exame implements Serializable{
    /**
     * Atributo que indica uma Disciplina a Exame.
     */
    protected Disciplina disciplina;
    /**
     * Atributo que indica uma Data a Exame.
     */
    protected Data data;
    /**
     * Atributo que indica uma Duracao a Exame.
     */
    protected double duracao;
    /**
     * Atributo que representa uma Lista de Salas do Exame.
     */
    protected ArrayList<Sala> salas;
    /**
     * Atributo que indica um Docente Responsavel ao Exame.
     */
    protected Docente docente_responsavel;
    /**
     * Atributo que representa uma Lista de Vigilantes do Exame.
     */
    protected ArrayList<Docente> vigilantes;
    /**
     * Atributo que representa uma Lista de Funcionarios do Exame.
     */
    protected ArrayList<NaoDocente> funcionarios;
    /**
     * Atributo que representa uma Lista de Alunos Inscritos no Exame.
     */
    protected ArrayList<Aluno> inscritos;
    /**
     * Atributo que representa uma Lista de Classificacoes dos Alunos no Exame.
     */
    protected ArrayList<Double> classificacoes;
    /**
     * Atributo que indica um Tipo ao Exame.
     */
    protected String tipo;
    /**
     * Construtor vazio para inicializar os ArrayLists.
     */
    public Exame() {
        this.salas = new ArrayList<>();
        this.vigilantes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.inscritos = new ArrayList<>();
        this.classificacoes = new ArrayList<>();
    }
    /**
     * Construtor do Exame.
     * @param disciplina
     * @param data
     * @param duracao
     * @param sala
     * @param docente_responsavel
     * @param vigilantes
     * @param funcionarios
     * @param inscritos
     * @param classificacoes 
     */
    public Exame(Disciplina disciplina,Data data, double duracao, ArrayList<Sala> sala, Docente docente_responsavel, ArrayList<Docente> vigilantes, ArrayList<NaoDocente> funcionarios, ArrayList<Aluno> inscritos, ArrayList<Double> classificacoes){
        this.disciplina = disciplina;
        this.data = data;
        this.duracao = duracao;
        this.salas = sala;
        this.docente_responsavel = docente_responsavel;
        this.vigilantes = vigilantes;
        this.funcionarios = funcionarios;
        this.inscritos = inscritos;
        this.classificacoes = classificacoes;
    }
    /**
     * Retorna a Data do Exame.
     * @return 
     */
    public Data getData() {
        return data;
    }
    /**
     * Retorna a Lista de Salas do Exame.
     * @return 
     */
    public ArrayList<Sala> getSalas() {
        return salas;
    }
    /**
     * Retorna a Lista de Vigilantes do Exame.
     * @return 
     */
    public ArrayList<Docente> getVigilantes() {
        return vigilantes;
    }
    /**
     * Retorna a Lista de Funcionarios do Exame.
     * @return 
     */
    public ArrayList<NaoDocente> getFuncionarios() {
        return funcionarios;
    }
    /**
     * Retorna a Lista de Alunos Inscritos do Exame.
     * @return 
     */
    public ArrayList<Aluno> getInscritos() {
        return inscritos;
    }
    /**
     * Retorna o Tipo de Exame.
     * @return 
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Retorna a Lista de Classificacoes dos Alunos do Exame.
     * @return 
     */
    public ArrayList<Double> getClassificacoes() {
        return classificacoes;
    }
    /**
     * Retorna a Disciplina do Exame.
     * @return 
     */
    public Disciplina getDisciplina() {
        return disciplina;
    }
    /**
     * Retorna a Duracao do Exame.
     * @return 
     */
    public double getDuracao() {
        return duracao;
    }
    /**
     * Retorna o Docente Responsavel do Exame.
     * @return 
     */
    public Docente getDocente_responsavel() {
        return docente_responsavel;
    }
    /**
     * Imprime os dados do Exame.
     * @return 
     */
    @Override
    public String toString(){
        return String.format("Disciplina: %s\n%sDuraçao: %.2fh\n", disciplina.getNome(), data.toString(), this.duracao);
    }
}
