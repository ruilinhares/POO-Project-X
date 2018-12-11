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
import projeto.*;

/**
 * Esta Classe implementa o Menu do Progama.
 * @author Asus
 */
public class JF_Menu extends javax.swing.JFrame {

    private ArrayList<Curso> cursos;
    private ArrayList<Exame> exames;
    private ArrayList<Sala> salas;

    Ficheiros_txt txt = new Ficheiros_txt();
    
    /**
     *
     * @param exames
     * @param cursos
     */
    public JF_Menu(ArrayList<Exame> exames, ArrayList<Curso> cursos) {
        initComponents();
        this.exames = exames;
        this.cursos = cursos;
        this.salas = new ArrayList<>();
        this.salas.add(new Sala('A','1'));
        this.salas.add(new Sala('A','2'));
        this.salas.add(new Sala('A','3'));
        this.salas.add(new Sala('B','1'));
        this.salas.add(new Sala('B','2'));
        this.salas.add(new Sala('B','3'));
        this.salas.add(new Sala('C','1'));
        this.salas.add(new Sala('C','2'));
        this.salas.add(new Sala('C','3'));
    }
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Cursos = new javax.swing.JMenu();
        jMenuItem_listarcursos = new javax.swing.JMenuItem();
        jMenuItem_addcurso = new javax.swing.JMenuItem();
        jMenu_Disciplinas = new javax.swing.JMenu();
        jMenuItem_addDisciplina = new javax.swing.JMenuItem();
        jMenuItem_listarDisciplinas = new javax.swing.JMenuItem();
        jMenu_Exames = new javax.swing.JMenu();
        jMenuItem_criaExame = new javax.swing.JMenuItem();
        jMenuItem_listaExames = new javax.swing.JMenuItem();
        jMenuItem_lancar_notas = new javax.swing.JMenuItem();
        jMenuItem_Listar_Notas = new javax.swing.JMenuItem();
        jMenuItem_listar_incritos = new javax.swing.JMenuItem();
        jMenuItem_list_docentes = new javax.swing.JMenuItem();
        jMenuItem_list_func = new javax.swing.JMenuItem();
        jMenu_Alunos = new javax.swing.JMenu();
        jMenuItem_exames_associados = new javax.swing.JMenuItem();
        jMenuItem_add_aluno = new javax.swing.JMenuItem();
        jMenuItem_Remove_Alunos_Exame = new javax.swing.JMenuItem();
        jMenuItem_Adiciona_Alunos_Exame = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Lista_exames_associado = new javax.swing.JMenuItem();
        jMenuItem_Remover_Docentes_Exame = new javax.swing.JMenuItem();
        jMenuItem_Adicionar_Docentes_Exame = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_Listar_Exames_Associados = new javax.swing.JMenuItem();
        jMenu_sair = new javax.swing.JMenu();
        jMenuItem_TerminarSessao = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_uc/UC.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        jMenu_Cursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_uc/15304021_1496329033730133_1083548863_o.jpg"))); // NOI18N
        jMenu_Cursos.setText("Cursos");
        jMenu_Cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_CursosActionPerformed(evt);
            }
        });

        jMenuItem_listarcursos.setText("Listar Cursos");
        jMenuItem_listarcursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_listarcursosActionPerformed(evt);
            }
        });
        jMenu_Cursos.add(jMenuItem_listarcursos);

        jMenuItem_addcurso.setText("Adicionar Curso");
        jMenuItem_addcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addcursoActionPerformed(evt);
            }
        });
        jMenu_Cursos.add(jMenuItem_addcurso);

        jMenuBar1.add(jMenu_Cursos);

        jMenu_Disciplinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_uc/15310658_1496323733730663_913729659_n.jpg"))); // NOI18N
        jMenu_Disciplinas.setText("Disciplinas");
        jMenu_Disciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_DisciplinasActionPerformed(evt);
            }
        });

        jMenuItem_addDisciplina.setText("Adicinar Disciplina");
        jMenuItem_addDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addDisciplinaActionPerformed(evt);
            }
        });
        jMenu_Disciplinas.add(jMenuItem_addDisciplina);

        jMenuItem_listarDisciplinas.setText("Listar Disciplinas");
        jMenuItem_listarDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_listarDisciplinasActionPerformed(evt);
            }
        });
        jMenu_Disciplinas.add(jMenuItem_listarDisciplinas);

        jMenuBar1.add(jMenu_Disciplinas);

        jMenu_Exames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_uc/15282005_1496323750397328_1882089564_n.jpg"))); // NOI18N
        jMenu_Exames.setText("Exames");
        jMenu_Exames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ExamesActionPerformed(evt);
            }
        });

        jMenuItem_criaExame.setText("Criar Exame");
        jMenuItem_criaExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_criaExameActionPerformed(evt);
            }
        });
        jMenu_Exames.add(jMenuItem_criaExame);

        jMenuItem_listaExames.setText("Listar Exames");
        jMenuItem_listaExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_listaExamesActionPerformed(evt);
            }
        });
        jMenu_Exames.add(jMenuItem_listaExames);

        jMenuItem_lancar_notas.setText("Lançar Notas");
        jMenuItem_lancar_notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_lancar_notasActionPerformed(evt);
            }
        });
        jMenu_Exames.add(jMenuItem_lancar_notas);

        jMenuItem_Listar_Notas.setText("Listar Notas");
        jMenuItem_Listar_Notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Listar_NotasActionPerformed(evt);
            }
        });
        jMenu_Exames.add(jMenuItem_Listar_Notas);

        jMenuItem_listar_incritos.setText("Listar Alunos Incritos");
        jMenuItem_listar_incritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_listar_incritosActionPerformed(evt);
            }
        });
        jMenu_Exames.add(jMenuItem_listar_incritos);

        jMenuItem_list_docentes.setText("Listar Docentes");
        jMenuItem_list_docentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_list_docentesActionPerformed(evt);
            }
        });
        jMenu_Exames.add(jMenuItem_list_docentes);

        jMenuItem_list_func.setText("Listar Funcionários");
        jMenuItem_list_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_list_funcActionPerformed(evt);
            }
        });
        jMenu_Exames.add(jMenuItem_list_func);

        jMenuBar1.add(jMenu_Exames);

        jMenu_Alunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_uc/aluno.png"))); // NOI18N
        jMenu_Alunos.setText("Alunos");

        jMenuItem_exames_associados.setText("Listar Exames Associados");
        jMenuItem_exames_associados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_exames_associadosActionPerformed(evt);
            }
        });
        jMenu_Alunos.add(jMenuItem_exames_associados);

        jMenuItem_add_aluno.setText("Adicionar Aluno");
        jMenuItem_add_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_add_alunoActionPerformed(evt);
            }
        });
        jMenu_Alunos.add(jMenuItem_add_aluno);

        jMenuItem_Remove_Alunos_Exame.setText("Remover Aluno(s) de um Exame");
        jMenuItem_Remove_Alunos_Exame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Remove_Alunos_ExameActionPerformed(evt);
            }
        });
        jMenu_Alunos.add(jMenuItem_Remove_Alunos_Exame);

        jMenuItem_Adiciona_Alunos_Exame.setText("Adicionar Aluno(s) a um Exame");
        jMenuItem_Adiciona_Alunos_Exame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Adiciona_Alunos_ExameActionPerformed(evt);
            }
        });
        jMenu_Alunos.add(jMenuItem_Adiciona_Alunos_Exame);

        jMenuBar1.add(jMenu_Alunos);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_uc/prof.png"))); // NOI18N
        jMenu1.setText("Docentes");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem_Lista_exames_associado.setText("Listar Exames Associados");
        jMenuItem_Lista_exames_associado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Lista_exames_associadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Lista_exames_associado);

        jMenuItem_Remover_Docentes_Exame.setText("Remover Docente(s) de um Exame");
        jMenuItem_Remover_Docentes_Exame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Remover_Docentes_ExameActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Remover_Docentes_Exame);

        jMenuItem_Adicionar_Docentes_Exame.setText("Adicionar Docente(s) a um Exame");
        jMenuItem_Adicionar_Docentes_Exame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Adicionar_Docentes_ExameActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Adicionar_Docentes_Exame);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_uc/funci.jpg"))); // NOI18N
        jMenu2.setText("Funcionários");

        jMenuItem_Listar_Exames_Associados.setText("Listar Exames Associados");
        jMenuItem_Listar_Exames_Associados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Listar_Exames_AssociadosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_Listar_Exames_Associados);

        jMenuBar1.add(jMenu2);

        jMenu_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_uc/saida.png"))); // NOI18N
        jMenu_sair.setText("Sair");

        jMenuItem_TerminarSessao.setText("Terminar Sessão");
        jMenuItem_TerminarSessao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_TerminarSessaoMouseClicked(evt);
            }
        });
        jMenuItem_TerminarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TerminarSessaoActionPerformed(evt);
            }
        });
        jMenu_sair.add(jMenuItem_TerminarSessao);

        jMenuBar1.add(jMenu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_TerminarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TerminarSessaoActionPerformed
        System.exit(0);
        try {
            txt.grava_historico("Sair");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_TerminarSessaoActionPerformed

    private void jMenuItem_TerminarSessaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_TerminarSessaoMouseClicked
      
    }//GEN-LAST:event_jMenuItem_TerminarSessaoMouseClicked

    private void jMenuItem_addcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addcursoActionPerformed
        Add_curso a = new Add_curso(cursos,salas);
        jDesktopPane1.add(a);
        a.setVisible(true); 
        try {
            txt.grava_historico("Adicionar Curso");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_addcursoActionPerformed

    private void jMenu_CursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_CursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_CursosActionPerformed

    private void jMenu_DisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_DisciplinasActionPerformed
        
    }//GEN-LAST:event_jMenu_DisciplinasActionPerformed

    private void jMenuItem_addDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addDisciplinaActionPerformed
        Add_disciplina dis = new Add_disciplina(cursos);
        jDesktopPane1.add(dis);
        dis.setVisible(true);
        try {
            txt.grava_historico("Adicionar Disciplina");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_addDisciplinaActionPerformed

    private void jMenuItem_listarcursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_listarcursosActionPerformed
        Listar_cursos listar = new Listar_cursos(cursos);
        jDesktopPane1.add(listar);
        listar.setVisible(true);
        try {
            txt.grava_historico("Listar Cursos");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_listarcursosActionPerformed

    private void jMenuItem_criaExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_criaExameActionPerformed
 
        Add_Exame addexame = new Add_Exame(exames, cursos);
        jDesktopPane1.add(addexame);
        addexame.setVisible(true);
        try {
            txt.grava_historico("Cria Exame");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_criaExameActionPerformed

    private void jMenu_ExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ExamesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu_ExamesActionPerformed

    private void jMenuItem_listaExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_listaExamesActionPerformed
        // TODO add your handling code here:
        Listar_Exames lisExames = new Listar_Exames(exames);
        jDesktopPane1.add(lisExames);
        lisExames.setVisible(true);
        try {
            txt.grava_historico("Listar Exame");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_listaExamesActionPerformed

    private void jMenuItem_lancar_notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_lancar_notasActionPerformed
        // TODO add your handling code here:
        Lanca_notas lisExames = new Lanca_notas(exames);
        jDesktopPane1.add(lisExames);
        lisExames.setVisible(true);
        try {
            txt.grava_historico("Lançar Notas");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_lancar_notasActionPerformed

    private void jMenuItem_Lista_exames_associadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Lista_exames_associadoActionPerformed
        // TODO add your handling code here:
        Listar_Exames_Associado_a_Docentes lisExames = new Listar_Exames_Associado_a_Docentes(cursos, exames);
        jDesktopPane1.add(lisExames);
        lisExames.setVisible(true);
        try {
            txt.grava_historico("Listar Exame Associados a Docente");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_Lista_exames_associadoActionPerformed

    private void jMenuItem_Listar_Exames_AssociadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Listar_Exames_AssociadosActionPerformed
        // TODO add your handling code here:
        Listar_Exames_Asso_a_Funcis lisExames = new Listar_Exames_Asso_a_Funcis(cursos, exames);
        jDesktopPane1.add(lisExames);
        lisExames.setVisible(true);
        try {
            txt.grava_historico("Listar Exames Associados a Funcionario");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_Listar_Exames_AssociadosActionPerformed

    private void jMenuItem_exames_associadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_exames_associadosActionPerformed
        // TODO add your handling code here:
        Listar_Exames_aluno lisExames = new Listar_Exames_aluno(cursos, exames);
        jDesktopPane1.add(lisExames);
        lisExames.setVisible(true);
        try {
            txt.grava_historico("Listar Alunos Associados");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_exames_associadosActionPerformed

    private void jMenuItem_listar_incritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_listar_incritosActionPerformed
        // TODO add your handling code here:
        Listar_Alunos_Incritos lisAlu = new Listar_Alunos_Incritos(exames);
        jDesktopPane1.add(lisAlu);
        lisAlu.setVisible(true);
        try {
            txt.grava_historico("Listar Alunos Incritos");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_listar_incritosActionPerformed

    private void jMenuItem_listarDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_listarDisciplinasActionPerformed
        // TODO add your handling code here:
        Listar_Disciplinas lisDis = new Listar_Disciplinas(cursos);
        jDesktopPane1.add(lisDis);
        lisDis.setVisible(true);
        try {
            txt.grava_historico("Listar Disciplina");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_listarDisciplinasActionPerformed

    private void jMenuItem_list_docentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_list_docentesActionPerformed
        // TODO add your handling code here:
        Listar_docente_exame lisDoc = new Listar_docente_exame(exames);
        jDesktopPane1.add(lisDoc);
        lisDoc.setVisible(true);
        try {
            txt.grava_historico("Listar Docentes");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_list_docentesActionPerformed

    private void jMenuItem_list_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_list_funcActionPerformed
        // TODO add your handling code here:
        Listar_func_exame lisfunc = new Listar_func_exame(exames);
        jDesktopPane1.add(lisfunc);
        lisfunc.setVisible(true);
        try {
            txt.grava_historico("Listar Funcionários");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_list_funcActionPerformed

    private void jMenuItem_add_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_add_alunoActionPerformed
        // TODO add your handling code here:
        add_aluno alu = new add_aluno(cursos);
        jDesktopPane1.add(alu);
        alu.setVisible(true);
        try {
            txt.grava_historico("Adicionar Aluno");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_add_alunoActionPerformed

    private void jMenuItem_Remove_Alunos_ExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Remove_Alunos_ExameActionPerformed
        // TODO add your handling code here:
        Remove_Alunos_Exame remo_alu = new Remove_Alunos_Exame(exames);
        jDesktopPane1.add(remo_alu);
        remo_alu.setVisible(true);
        try {
            txt.grava_historico("Remover Aluno de Exame");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_Remove_Alunos_ExameActionPerformed

    private void jMenuItem_Adiciona_Alunos_ExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Adiciona_Alunos_ExameActionPerformed
        // TODO add your handling code here:
        Adiciona_Alunos_Exame adi_alu = new Adiciona_Alunos_Exame(exames);
        jDesktopPane1.add(adi_alu);
        adi_alu.setVisible(true);
        try {
            txt.grava_historico("Adicionar Aluno a Exame");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_Adiciona_Alunos_ExameActionPerformed

    private void jMenuItem_Adicionar_Docentes_ExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Adicionar_Docentes_ExameActionPerformed
        // TODO add your handling code here:
        Adiciona_Docentes_Exame adi_doc = new Adiciona_Docentes_Exame(exames,cursos);
        jDesktopPane1.add(adi_doc);
        adi_doc.setVisible(true);
        try {
            txt.grava_historico("Adicionar Docente a Exame");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_Adicionar_Docentes_ExameActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem_Listar_NotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Listar_NotasActionPerformed
        // TODO add your handling code here:
        Listar_Notas notas = new Listar_Notas(exames);
        jDesktopPane1.add(notas);
        notas.setVisible(true);
        try {
            txt.grava_historico("Listar Notas");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_Listar_NotasActionPerformed

    private void jMenuItem_Remover_Docentes_ExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Remover_Docentes_ExameActionPerformed
        // TODO add your handling code here:
        Remover_Docentes_Exames remo_doc = new Remover_Docentes_Exames(exames);
        jDesktopPane1.add(remo_doc);
        remo_doc.setVisible(true);
        try {
            txt.grava_historico("Remover Docente de Exame");
        } catch (IOException ex) {
            Logger.getLogger(JF_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_Remover_Docentes_ExameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Adiciona_Alunos_Exame;
    private javax.swing.JMenuItem jMenuItem_Adicionar_Docentes_Exame;
    private javax.swing.JMenuItem jMenuItem_Lista_exames_associado;
    private javax.swing.JMenuItem jMenuItem_Listar_Exames_Associados;
    private javax.swing.JMenuItem jMenuItem_Listar_Notas;
    private javax.swing.JMenuItem jMenuItem_Remove_Alunos_Exame;
    private javax.swing.JMenuItem jMenuItem_Remover_Docentes_Exame;
    private javax.swing.JMenuItem jMenuItem_TerminarSessao;
    private javax.swing.JMenuItem jMenuItem_addDisciplina;
    private javax.swing.JMenuItem jMenuItem_add_aluno;
    private javax.swing.JMenuItem jMenuItem_addcurso;
    private javax.swing.JMenuItem jMenuItem_criaExame;
    private javax.swing.JMenuItem jMenuItem_exames_associados;
    private javax.swing.JMenuItem jMenuItem_lancar_notas;
    private javax.swing.JMenuItem jMenuItem_list_docentes;
    private javax.swing.JMenuItem jMenuItem_list_func;
    private javax.swing.JMenuItem jMenuItem_listaExames;
    private javax.swing.JMenuItem jMenuItem_listarDisciplinas;
    private javax.swing.JMenuItem jMenuItem_listar_incritos;
    private javax.swing.JMenuItem jMenuItem_listarcursos;
    private javax.swing.JMenu jMenu_Alunos;
    private javax.swing.JMenu jMenu_Cursos;
    private javax.swing.JMenu jMenu_Disciplinas;
    private javax.swing.JMenu jMenu_Exames;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}