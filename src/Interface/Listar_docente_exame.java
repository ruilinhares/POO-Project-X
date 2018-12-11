/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import projeto.Docente;
import projeto.Exame;

/**
 * Esta Classe serve para Listar os Vigilantes de um Exame.
 * @author jcunha
 */
public class Listar_docente_exame extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listar_docente_exame
     */
    private int index;
    private final ArrayList<Exame> exames;

    /**
     *
     * @param exames
     */
    public Listar_docente_exame(ArrayList<Exame> exames) {
        initComponents();
        this.exames=exames;
        this.index = -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_exame = new javax.swing.JLabel();
        jCombo_exame = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);

        jLabel_exame.setText("Exame");

        jCombo_exame.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCombo_exame.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jCombo_exameAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jCombo_exame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_exameActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextArea1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_exame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCombo_exame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCombo_exame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_exame))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCombo_exameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jCombo_exameAncestorAdded
        // TODO add your handling code here:
        jCombo_exame.removeAllItems();
    }//GEN-LAST:event_jCombo_exameAncestorAdded

    private void jCombo_exameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_exameActionPerformed
        // TODO add your handling code here:
        if (jCombo_exame.getItemCount()<1){
            for(int i = 0; i < exames.size(); i++) {
                jCombo_exame.addItem(exames.get(i).getDisciplina().getNome() +" (" + exames.get(i).getData().toString() + ")" );
            } 
        }
        else{
                if (jCombo_exame.getSelectedIndex()!= index){
                jTextArea1.setText(null);
                this.index = jCombo_exame.getSelectedIndex();
                ArrayList<Docente> doc = exames.get(index).getVigilantes();
                jTextArea1.append("Lista de Docentes\n");
                for(int j=0; j<doc.size(); j++){
                    jTextArea1.append("\n");
                    jTextArea1.append("Nome: "+doc.get(j).getNome() + "\nNumero: " + doc.get(j).getNum()+ "\n");
                }
            }
        }
    }//GEN-LAST:event_jCombo_exameActionPerformed

    private void jTextArea1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextArea1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombo_exame;
    private javax.swing.JLabel jLabel_exame;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
