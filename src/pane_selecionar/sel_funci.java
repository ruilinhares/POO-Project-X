package pane_selecionar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import projeto.*;

/**
 * Esta Classe serve de auxilio da Classe Add_Exame, que Seleciona os Funcionarios disponiveis para Associar a um Novo Exame.
 * @author Asus
 */
public class sel_funci extends javax.swing.JPanel {
    
    private final ArrayList<NaoDocente> naodocentes;
    private ArrayList<NaoDocente> funcionarios;
    /**
     * Creates new form sel_funci
     * @param ndocentes
     */
    public sel_funci(ArrayList<NaoDocente> ndocentes) {
        initComponents();
        this.naodocentes = ndocentes;
    }
    
    public ArrayList<NaoDocente> getSelecionados(){
        this.funcionarios = new ArrayList<>();
        ArrayList<String> als = new ArrayList<>(jList1.getSelectedValuesList());
        int v=0;
        for (String al : als) {
            char[] charArray = al.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == ':'){
                    v = i+1;
                    break;}
            }
            char[] aux = new char[charArray.length - v];
            for (int j = 0; j < charArray.length - v; j++) {
                aux[j] = charArray[j + v];
            }
            String num = new String(aux);
            for (NaoDocente ndoc : naodocentes) {
                if(num.equals(String.valueOf(ndoc.getNum()))){
                    this.funcionarios.add(ndoc);
                    break;
                }  
            }
        }
        return this.funcionarios;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jList1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jList1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
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

    private void jList1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jList1AncestorAdded
        // TODO add your handling code here:
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            
            @Override
            public int getSize() { return naodocentes.size(); }
            @Override
            public String getElementAt(int i) { return naodocentes.get(i).getNome()+" Nº:"+ naodocentes.get(i).getNum(); }
        });
    }//GEN-LAST:event_jList1AncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
