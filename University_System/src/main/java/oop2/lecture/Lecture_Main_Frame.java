package oop2.lecture;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.*;
import oop2.login.Login_Frame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 82106
 */
public class Lecture_Main_Frame extends javax.swing.JFrame {
    String iD;
    /**
     * Creates new form NewJFrame1
     */
    public Lecture_Main_Frame(String iD) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        initComponents();
        user_name.setText(iD);
        this.iD = iD;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lecture_insert = new javax.swing.JButton();
        lecture_pay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        creat_lec = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        change_lec = new javax.swing.JButton();
        user_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("수업메뉴");

        jLabel1.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel1.setText("수업 관리 메뉴");

        lecture_insert.setText("강좌 등록");
        lecture_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecture_insertActionPerformed(evt);
            }
        });

        lecture_pay.setText("수강료 확인");
        lecture_pay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lecture_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecture_payActionPerformed(evt);
            }
        });

        jLabel2.setText("님");

        jButton3.setText("로그아웃");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        creat_lec.setText("강좌 개설");
        creat_lec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creat_lecActionPerformed(evt);
            }
        });

        jButton2.setText("회원정보 수정");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        change_lec.setText("강의 수정");
        change_lec.setActionCommand("강좌 수정");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(creat_lec, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(lecture_insert, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(lecture_pay, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(change_lec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {change_lec, creat_lec, jButton2, lecture_insert, lecture_pay});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lecture_insert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creat_lec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change_lec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lecture_pay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3)
                    .addComponent(user_name))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lecture_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecture_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecture_payActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login_Frame login = new Login_Frame();//로그아웃
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    private void lecture_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecture_insertActionPerformed
            // TODO add your handling code here:
        Insert_Lecture insert = null;
        try {
            insert = new Insert_Lecture();
        } catch (IOException ex) {
            Logger.getLogger(Lecture_Main_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        insert.setVisible(true);
    }//GEN-LAST:event_lecture_insertActionPerformed

<<<<<<< HEAD
=======
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

>>>>>>> 31583a53ce5c568525536965bd208127dcdfb0eb

    private void creat_lecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creat_lecActionPerformed
        try {
            // TODO add your handling code here:
            Create_Lecture create = new Create_Lecture();
            create.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Lecture_Main_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_creat_lecActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //회원 정보 수정
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change_lec;
    private javax.swing.JButton creat_lec;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lecture_insert;
    private javax.swing.JButton lecture_pay;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
