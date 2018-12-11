/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pane_selecionar;

import java.util.ArrayList;
import projeto.*;

/**
 * Esta Classe serve de auxilio da Classe Add_Exame, que Seleciona os Alunos Disponiveis para Inscrever num Novo Exame.
 * @author Asus
 */
public class sel_alunos extends javax.swing.JPanel {

    private final ArrayList<Aluno> alunos;
    private ArrayList<Aluno> inscritos;
    
    private final String epocaExame;
    
    public sel_alunos(ArrayList<Aluno> alunos, String epoca) {
        initComponents();
        this.inscritos = new ArrayList<>();
        this.alunos = alunos;
        this.epocaExame = epoca;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @return 
     */
    public ArrayList<Aluno> getSelecionados(){
        this.inscritos = new ArrayList<>();
        int[] indexs = jList1.getSelectedIndices();
        if(indexs.length > 0){
            for (int i = 0; i < indexs.length ; i++) {
                inscritos.add(alunos.get(i));
            }
        }
        return this.inscritos;
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setAutoscrolls(true);
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            
            @Override
            public int getSize() { return alunos.size(); }
            @Override
            public String getElementAt(int i) { 
                    return alunos.get(i).getNome()+" Nº:"+ alunos.get(i).getNum();}
        });
    }//GEN-LAST:event_formAncestorAdded

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:      
    }//GEN-LAST:event_jList1ValueChanged
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}