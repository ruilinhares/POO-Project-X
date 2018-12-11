/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Esta classe é uma subClasse da Classe Exame, que recebe um tipo para Diferenciar entre Normal ou Recurso.
 * @author jcunha
 */
public class ExameNormalRecurso extends Exame implements Serializable{ 
    
    /**
     * Construtor do Exame Nomral/Recurso.
     * @param disciplina
     * @param data
     * @param duracao
     * @param sala
     * @param docente_responsavel
     * @param vigilantes
     * @param funcionarios
     * @param inscritos
     * @param classificacoes
     * @param tipo
     */
    public ExameNormalRecurso(Disciplina disciplina, Data data, double duracao, ArrayList<Sala> sala, Docente docente_responsavel, ArrayList<Docente> vigilantes, ArrayList<NaoDocente> funcionarios, ArrayList<Aluno> inscritos, ArrayList<Double> classificacoes, String tipo) {
        super(disciplina, data, duracao, sala, docente_responsavel, vigilantes, funcionarios, inscritos, classificacoes);
        super.tipo = tipo;
    }
}
