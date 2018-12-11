/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import Interface.JF_Menu;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que contem os metodos para que progama funcione.
 * @author Asus
 */
public class Projeto implements Serializable{
    
    /**
     *  Lista de Exames.
     */
    public static ArrayList<Exame> exames;

    /**
     * Lista de Cursos existentes.
     */
    public static ArrayList<Curso> cursos;

    /**
     *  Le o ficheiro e carrega os dados para a Lista de Cursos e para a Lista de Exames.
     * @param args
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        exames = new ArrayList<>();
        cursos = new ArrayList<>();
        
        Ficheiros_obj obj = new Ficheiros_obj();     
        obj.read_cursos(cursos);
        obj.read_exames(exames);
        
        JF_Menu frame = new JF_Menu(exames, cursos);
        frame.setVisible(true);
        
        obj.write_cursos(cursos);
        obj.write_exames(exames);
        
    }
}
