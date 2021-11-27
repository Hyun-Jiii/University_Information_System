/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.professor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diddm
 */
public class Lecture_manage extends javax.swing.JFrame {
    DefaultTableModel model;
 
    public Lecture_manage() {
        initComponents();
    }

    public void clearTable() {//테이블에 출력된 정보 초기화
        model = (DefaultTableModel) lecture_table.getModel();
        model.setNumRows(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AttendDance = new javax.swing.JButton();
        grade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lecture_table = new javax.swing.JTable();
        import_data = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AttendDance.setText("출석부");
        AttendDance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendDanceActionPerformed(evt);
            }
        });

        grade.setText("성적");
        grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel1.setText("강좌 관리");

        back.setText("뒤로가기");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        lecture_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(lecture_table);

        import_data.setText("새로고침");
        import_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                import_dataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addComponent(jLabel1)
                            .addGap(42, 42, 42)
                            .addComponent(import_data))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AttendDance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(import_data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AttendDance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_gradeActionPerformed

    private void AttendDanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendDanceActionPerformed

        // 출석부 버튼 
        AttendanceBook application = new AttendanceBook(); // 출석부 클래스로 이동
        application.setVisible(true);
        dispose();

        // 강좌 선택-> 각 강좌 출석부 보이기
        
        int index = lecture_table.getSelectedRow();
        String filePath="AttendanceBook.txt";//출석부 파일
        lecture_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//목록 여러개 클릭 불가 
        String str = (String)(lecture_table.getValueAt(index, 1)); //강좌 이름 받아오기
        System.out.println(str);
        File file = new File(filePath);

        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
           // BufferedReader br = new BufferedReader(new FileReader(file,"utf-8"));
            String firstLine = br.readLine().trim();
            String[] columnsName=firstLine.split(",");
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();
             
            for(int i = 0;i<tableLines.length;i++){
                if(str.equals("파일처리")){
                   
                    String line = tableLines[i].toString().trim();
                    String [] dataRow = line.split("/");
                    model.addRow(dataRow);//출석부 클래스에서 열어야 함
                    
                }
            }
           AttendanceBook adb = new AttendanceBook();
                adb.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Lecture_manage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AttendDanceActionPerformed

    private void import_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_import_dataActionPerformed
        // TODO add your handling code here:
        // 강좌 목록 보기. 목록 테이블에 출력
        clearTable();
        String filePath = "lecture.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            model = (DefaultTableModel) lecture_table.getModel();
            model.setColumnIdentifiers(columnsName);

            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }
        } catch (Exception ex) {
            Logger.getLogger(Lecture_manage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_import_dataActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttendDance;
    private javax.swing.JButton back;
    private javax.swing.JButton grade;
    private javax.swing.JButton import_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lecture_table;
    // End of variables declaration//GEN-END:variables

}
