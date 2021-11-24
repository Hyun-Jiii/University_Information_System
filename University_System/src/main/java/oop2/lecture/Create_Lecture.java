/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Create_Lecture extends javax.swing.JFrame {

    /**
     * Creates new form Create_Lecture
     */
    public Create_Lecture() throws IOException {
        initComponents();
        addList();
    }
    
    public void addList() throws FileNotFoundException, IOException{ //개설전 강의 리스트 테이블에 출력
        String lec;
        String[] key ;
        BufferedReader str = new BufferedReader(new InputStreamReader(new FileInputStream("insertlecturelist.txt"), "euc-kr"));
        DefaultTableModel table = (DefaultTableModel)lecture_list.getModel();
        while((lec = str.readLine()) != null){
            key = lec.split("/");
            Object[] list = { key[0], key[1], key[2], key[3], key[4]};
            table.addRow(list);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lecture_list = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lecture_pro = new javax.swing.JTextField();
        max_num = new javax.swing.JTextField();
        min_num = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Lecture");

        lecture_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "강좌 번호", "강좌 이름", "담당 학과", "학점", "강의 설명"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(lecture_list);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel1.setText("강좌 개설");

        jLabel2.setText("담당 교수");

        jLabel3.setText("최대 인원");

        jLabel4.setText("최소 인원");

        jButton1.setText("개설");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("뒤로가기");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lecture_pro, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(max_num)
                    .addComponent(min_num))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lecture_pro, max_num, min_num});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lecture_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(max_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(min_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(15, 15, 15)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //뒤로가기
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // 강의 개설
        DefaultTableModel model =  (DefaultTableModel) lecture_list.getModel();
        int row = -1;
        boolean check = false; // 이미 개설되어 있는지 확인
        String str;
        row = lecture_list.getSelectedRow();
        try {
            BufferedReader ch = new BufferedReader(new InputStreamReader(new FileInputStream("lecturelist.txt"), "euc-kr"));
            while((str = ch.readLine()) != null){
                if(str.contains( model.getValueAt(row, 0).toString())){
                    check = true;
                    break;
                }                
            }
            if (row == -1) {
                showMessageDialog(null, "강좌를 선택해 주세요");
            } else if (lecture_pro.getText().isEmpty() || max_num.getText().isEmpty() || min_num.getText().isEmpty()) {
                showMessageDialog(null, "정보를 입력해 주세요");
            } else if(check){
                showMessageDialog(null, "이미 개설된 강좌입니다.");
            }else {

                FileOutputStream file = new FileOutputStream("lecturelist.txt", true);//파일 열기
                OutputStreamWriter output = new OutputStreamWriter(file, "euc-kr");
                BufferedWriter writer = new BufferedWriter(output);
                str = String.format("%s/%s/%s/%s/%s/%s/%s/%s/%s%n", model.getValueAt(row, 0), model.getValueAt(row, 1), model.getValueAt(row, 2), model.getValueAt(row, 3), lecture_pro.getText(), max_num.getText(), min_num.getText(), model.getValueAt(row, 4), "0");
                //강좌 번호, 강좌 이름, 담당 학과, 학점, 담당 교수, 최대 인원, 최소 인원, 강의 설명, 개설여부
                writer.write(str);
                writer.close();
                str = (String) model.getValueAt(row, 0) + ".txt";
                File newFile = new File(str);
                newFile.createNewFile();
                showMessageDialog(null, "강좌가 개설되었습니다.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Insert_Lecture.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Insert_Lecture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lecture_list;
    private javax.swing.JTextField lecture_pro;
    private javax.swing.JTextField max_num;
    private javax.swing.JTextField min_num;
    // End of variables declaration//GEN-END:variables
}
