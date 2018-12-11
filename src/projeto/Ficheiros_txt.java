/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Esta Classe server para a Escrita de Ficheiros de Texto.
 * @author Cunha
 */
public class Ficheiros_txt {
    private final String newLine = System.getProperty("line.separator");

    /**
     * Funcao para guardar no Ficheiro a Pesquiso do Utilizador.
     * @param dados
     * @throws IOException
     */
    public void grava_historico(String dados) throws IOException{
        Writer output;
        output = new BufferedWriter(new FileWriter("C:\\Users\\Asus\\Documents\\NetBeansProjects\\PROJETOX\\Dados.txt", true));
        
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        
        output.write(newLine + dateFormat.format(date)+ " -> " + dados);
        output.close();
    } 
}
