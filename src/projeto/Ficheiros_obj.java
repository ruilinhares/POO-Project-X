/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *  Esta Classe server para a Leitura e Escrita de Ficheiros de Objectos.
 * @author jcunha
 */
public class Ficheiros_obj {
    
    /**
     * Funcao para Escrever no Ficheiro o ArrayList de Cursos. 
     * @param cursos
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void write_cursos(ArrayList<Curso> cursos) throws FileNotFoundException, IOException{
        File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\PROJETOX\\cursos.dat");
        FileOutputStream oStream = new FileOutputStream(file);
        try (ObjectOutputStream outStream = new ObjectOutputStream(oStream)) {
            outStream.writeObject(Projeto.cursos);
            oStream.close();
            outStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Ficheiros_obj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Funcao para Escrever no Ficheiro o ArrayList de Exames.
     * @param exames
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void write_exames(ArrayList<Exame> exames) throws FileNotFoundException, IOException{
        File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\PROJETOX\\exames.dat");
        FileOutputStream oStream = new FileOutputStream(file);
        try (ObjectOutputStream outStream = new ObjectOutputStream(oStream)) {
            outStream.writeObject(Projeto.exames);
            oStream.close();
            outStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Ficheiros_obj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Funcao para Ler do Ficheiro o ArrayList de Exames lá contido.
     * @param exames
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void read_exames(ArrayList<Exame> exames) throws FileNotFoundException, IOException, ClassNotFoundException{
        File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\PROJETOX\\exames.dat");
        FileInputStream iStream = new FileInputStream(file);
        try (ObjectInputStream inStream = new ObjectInputStream(iStream)) {
            Projeto.exames = (ArrayList<Exame>) inStream.readObject();
            iStream.close();
            inStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Ficheiros_obj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Funcao para Ler do Ficheiro o ArrayList de Cursos lá contido.
     * @param cursos
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void read_cursos(ArrayList<Curso> cursos) throws FileNotFoundException, IOException, ClassNotFoundException{
        File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\PROJETOX\\cursos.dat");
        FileInputStream iStream = new FileInputStream(file);
        try (ObjectInputStream inStream = new ObjectInputStream(iStream)) {
            Projeto.cursos = (ArrayList<Curso>) inStream.readObject();
            iStream.close();
            inStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Ficheiros_obj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
