/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop2.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author User
 */
public class Exchange_Pw extends javax.swing.JFrame {
    String nowId;
    String userPW;
    ArrayList<User> userList = new ArrayList<>();
    String filename;
    User u = new User();
    public Exchange_Pw(String nowId) {
        try {
            initComponents();
            this.nowId = nowId;
            getList();
            setInfo(nowId);
        } catch (IOException ex) {
            Logger.getLogger(Exchange_Pw.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setInfo(String id) throws UnsupportedEncodingException, IOException{ 
        String name = u.searchName(id.charAt(0), id);
        //이름 세팅
        user_name.setText(name);
        //사용자 아이디 세팅
        user_id.setText(id);
    }
    
    public void insertList(String filename) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        FileOutputStream file = new FileOutputStream(filename);//파일 열기
        OutputStreamWriter output = new OutputStreamWriter(file, "euc-kr");
        BufferedWriter writer = new BufferedWriter(output);
        String str;
        for(int i = 0; i<userList.size();i++){
            if(nowId.charAt(0)=='S'||nowId.charAt(0)=='P'){ //학생이나 교수일때는 파일 내용이 5개
                str = String.format("%s/%s/%s/%s/%s%n", userList.get(i).getId(), userList.get(i).getName(), userList.get(i).getPassWord(),userList.get(i).getPeopleNum(),userList.get(i).getDepartMent());
                writer.write(str);
            }
            else if(nowId.charAt(0)=='G'||nowId.charAt(0)=='H'){ //수업 담당자나 학사 담당자는 파일 내용이 4개
                str = String.format("%s/%s/%s/%s/%n", userList.get(i).getId(), userList.get(i).getName(), userList.get(i).getPassWord(),userList.get(i).getPeopleNum());
                writer.write(str);
            }
        }
        writer.close();
    }
    
    public void getList(){
        String str;
        String[] key;
        try {
        switch (nowId.charAt(0)) {
            case 'P':{
                    filename = "professor.txt";
                    BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "euc-kr"));
                    while((str = read.readLine())!=null){
                        key = str.split("/");
                        userList.add(new User(key[0],key[1],key[2],key[3],key[4]));
                    }
                    break;
                }
            case 'H':{
                    filename = "school.txt";
                    BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "euc-kr"));
                    while((str = read.readLine())!=null){
                        key = str.split("/");
                        userList.add(new User(key[0],key[1],key[2],key[3],key[4]));
                    }
                    break;
                }
            case 'G':{
                    filename = "lecture.txt";
                    BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "euc-kr"));
                    while((str = read.readLine())!=null){
                        key = str.split("/");
                        userList.add(new User(key[0],key[1],key[2],key[3]));
                    }
                    break;
                }
            case 'S':{
                    filename = "student.txt";
                    BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "euc-kr"));
                    while((str = read.readLine())!=null){
                        key = str.split("/");
                        userList.add(new User(key[0],key[1],key[2],key[3]));
                    }
                    break;
                }  
        }
        } catch (FileNotFoundException ex) {
                Logger.getLogger(Exchange_Pw.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Exchange_Pw.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Exchange_Pw.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        now_pw = new javax.swing.JTextField();
        new_pw = new javax.swing.JTextField();
        check_pw = new javax.swing.JTextField();
        change = new javax.swing.JButton();
        goback = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        user_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel1.setText("비밀번호 변경");

        jLabel2.setText("현재 비밀번호");

        jLabel3.setText("변경할 비밀번호");

        jLabel4.setText("비밀번호 확인");

        jLabel5.setText(":");

        jLabel6.setText(":");

        jLabel7.setText(":");

        change.setText("변경하기");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        goback.setText("뒤로가기");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        jLabel8.setText("이름");

        jLabel9.setText("ID");

        jLabel10.setText(":");

        jLabel11.setText(":");

        user_id.setEditable(false);

        user_name.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(now_pw)
                            .addComponent(new_pw)
                            .addComponent(check_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goback, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(now_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(new_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(check_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(change)
                    .addComponent(goback))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_gobackActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        int index = 0;
        try {
            // TODO add your handling code here:
            
            if(now_pw.getText().isEmpty() || new_pw.getText().isEmpty() || check_pw.getText().isEmpty() )
                showMessageDialog(null,"빈칸을 입력하여주세요");
            else{
                for(int i = 0; i<userList.size();i++){
                    if(userList.get(i).getId().equals(nowId)){
                        index = i;
                    }
                }
                if(userList.get(index).getPassWord().equals(now_pw.getText())){
                    if(new_pw.getText().equals(check_pw.getText())){
                        userList.get(index).setPassWord(new_pw.getText());
                        insertList(filename);
                        showMessageDialog(null,"비밀번호가 변경되었습니다.");
                    }else
                        showMessageDialog(null,"비밀번호 확인이 일치하지 않습니다.");
                }else
                    showMessageDialog(null,"현재 비밀번호가 일치하지 않습니다.");
            }
            showMessageDialog(null,"비밀번호 변경이 완료되었습니다.");
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(Exchange_Pw.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change;
    private javax.swing.JTextField check_pw;
    private javax.swing.JButton goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField new_pw;
    private javax.swing.JTextField now_pw;
    private javax.swing.JTextField user_id;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables

}
