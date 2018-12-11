/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pane_selecionar;

import java.util.ArrayList;
import projeto.*;


/**
 * Esta Classe serve de auxilio da Classe Add_Exame, que Seleciona as Salas Disponiveis para Associar a um Novo Exame.
 * @author Asus
 */
public class sel_salas extends javax.swing.JPanel {
    
    private final ArrayList<Sala> salas;
    private final ArrayList<Exame> exames;
    private ArrayList<Sala> salas_disponiveis;
    
    private final Data dtExame;
    private final double duExame;
    /**
     * Creates new form sel_salas
     * @param salas
     * @param exames
     * @param du
     * @param dt
     */
    public sel_salas(ArrayList<Sala> salas, ArrayList<Exame> exames, Data dt, double du) {
        initComponents();
        this.salas = salas;
        this.exames = exames;
        this.dtExame = dt;
        this.duExame = du;
    }

    /**
     *
     * @return
     */
    public ArrayList<Sala> getSalas_disponiveis() {
        this.salas_disponiveis = new ArrayList<>();
        ArrayList<String> als = new ArrayList<>(jList1.getSelectedValuesList());
        int v=0;
        for (String al : als) {
            char[] charArray = al.toCharArray();
            for (Sala auxSala : salas) {
                if(auxSala.getNumSala() == charArray[2] && auxSala.getTorre() == charArray[0]){
                    this.salas_disponiveis.add(auxSala);
                    break;
                }  
            }
        }
        return salas_disponiveis;
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
            public int getSize() { return salas.size(); }
            @Override
            public String getElementAt(int i) {
                for (Exame exa : exames) {
                    for (Sala auxSala : exa.getSalas()) {
                        if (auxSala.getTorre() == salas.get(i).getTorre() && auxSala.getNumSala() == salas.get(i).getNumSala()){
                            if (Data.horaLivre(exa.getData(), exa.getDuracao() , dtExame, duExame)) {
                            } else  return null;
                        }
                    }
                }
                return salas.get(i).toString();
            }
        });
    }//GEN-LAST:event_jList1AncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}