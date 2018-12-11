/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projeto.Curso;
import projeto.Disciplina;
import projeto.Ficheiros_obj;
import projeto.NaoDocente;
import projeto.Sala;


/**
 * Esta Classe server para Criar um novo Curso e Adicinoar à lista de Cursos.
 * @author Asus
 */
public class Add_curso extends javax.swing.JInternalFrame {

    private String nome, grau;
    public ArrayList<Curso> cursos;
    public ArrayList<Sala> salas;
    private int duracao;
    /**
     * 
     * @param cs
     * @param salas 
     */
    public Add_curso(ArrayList<Curso> cs, ArrayList<Sala> salas) {
        initComponents();
        this.cursos = cs;
        this.salas = salas;
    }


    public String getGrau() {
        return grau;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getNome() {
        return nome;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_nomecurso = new javax.swing.JTextField();
        jTextField_duracaocurso = new javax.swing.JTextField();
        graucurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton_Validar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jButton1.setText("jButton1");

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        jButton2.setText("jButton2");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(610, 500));

        jLabel1.setText("Nome do Curso");

        jLabel2.setText("Duração do Curso");

        jLabel3.setText("Grau do Curso");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Adicionar Curso");

        jButton_Validar.setText("Adicionar");
        jButton_Validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ValidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Validar)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_nomecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_duracaocurso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(graucurso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField_nomecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField_duracaocurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(graucurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton_Validar)
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ValidarActionPerformed
        this.nome = jTextField_nomecurso.getText();
        this.grau = graucurso.getText();
        this.duracao = Integer.parseInt(jTextField_duracaocurso.getText());
        ArrayList<Disciplina> dis = new ArrayList();
        ArrayList<NaoDocente> func = cursos.get(0).getFuncionarios();
        
        cursos.add(new Curso(nome, duracao, grau, dis, salas ,func));
        Ficheiros_obj obj = new Ficheiros_obj();     
        try {
            obj.write_cursos(cursos);
        } catch (IOException ex) {
            Logger.getLogger(Add_curso.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Curso Adicionado com Sucesso!");
        /*if(verica()){
            jTextField_nomecurso.setText("");
            graucurso.setText("");
            jTextField_duracaocurso.setText("");
            JOptionPane.showMessageDialog(null, "Ocorreu um Erro!\nTente Outra Vez!");
        }*/
        setVisible(false);        
    }//GEN-LAST:event_jButton_ValidarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField graucurso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Validar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField_duracaocurso;
    private javax.swing.JTextField jTextField_nomecurso;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
