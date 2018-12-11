/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import projeto.Aluno;
import projeto.Curso;
import projeto.Disciplina;
import projeto.Exame;

/**
 * Esta Classe serve para Listar os Exames Associados a um Aluno e respetiva Nota.
 * @author jcunha
 */
public class Listar_Exames_aluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listar_Exames_aluno
     */
    private final ArrayList<Curso> cursos;
    private final ArrayList<Exame> exames;
    private ArrayList<Aluno> alunos;
    private String nome_aluno;
    private int index;
    
    /**
     *
     * @param cursos
     * @param exames
     */
    public Listar_Exames_aluno(ArrayList<Curso> cursos, ArrayList<Exame> exames) {
        initComponents();
        this.cursos = cursos;
        this.exames = exames;
        this.index = -1;
        this.alunos = new ArrayList<>();
        for (Curso curso : cursos) {
            for (Disciplina dis : curso.getDisciplinas()) {
                for (Aluno aluno : dis.get_Alunos()) {
                    int v = 0;
                    for (Aluno alux : alunos) {
                        if(alux.getNum() == aluno.getNum()) v++;
                    }
                    if(v<1) alunos.add(aluno);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jCombo_alunos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(610, 500));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setText("Aluno");

        jCombo_alunos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCombo_alunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_alunosActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextArea.setRows(5);
        jTextArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextAreaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextAreaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCombo_alunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 481, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCombo_alunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
        jCombo_alunos.removeAllItems();
    }//GEN-LAST:event_formAncestorAdded

    private void jCombo_alunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_alunosActionPerformed
        // TODO add your handling code here:
        if(jCombo_alunos.getItemCount()<1){
            for(int i=0; i<alunos.size();i++){
                jCombo_alunos.addItem(alunos.get(i).getNome()+ " (" + alunos.get(i).getNum() + ")");
            }
        }
        else{
            if (index != jCombo_alunos.getSelectedIndex()){
                jTextArea.setText(null);
                this.index = jCombo_alunos.getSelectedIndex();
                jTextArea.append("Lista de Exames do aluno "+ alunos.get(index).getNome() + "\n\n");
                exames.stream().forEach((Exame ex) -> {
                    ex.getInscritos().stream().filter((al) -> (alunos.get(index).getNum()==al.getNum())).map((_item) -> {
                        jTextArea.append(ex.toString());
                        return _item;
                    }).forEach((_item) -> {
                        jTextArea.append("\n-------------------------------------\n");
                    });
                });
            }
        }
    }//GEN-LAST:event_jCombo_alunosActionPerformed

    private void jTextAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextAreaAncestorAdded
        // TODO add your handling code here:
        JScrollPane jS = new JScrollPane();
        jTextArea.setText(null);
    }//GEN-LAST:event_jTextAreaAncestorAdded

    private void jTextAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaMouseEntered
        // TODO add your handling code here:        
    }//GEN-LAST:event_jTextAreaMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombo_alunos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables
}