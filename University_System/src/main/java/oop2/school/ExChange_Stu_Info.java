/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.school;

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
import javax.swing.table.DefaultTableModel;
import oop2.student.Student;

/**
 *
 * @author User
 */
public class ExChange_Stu_Info extends javax.swing.JFrame {
    private SchoolAdapter a;
    private ArrayList<Student> stulist= new ArrayList<>();
    private String file = "student.txt";
    /**
     * Creates new form ExChange_Stu_Info
     */
    public ExChange_Stu_Info() {
        try {
            initComponents();
            a = new SchoolAdapter();
            a.sp_AddList(stu_list, file);
            all_radio.setSelected(true);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setStuInfo() throws FileNotFoundException, UnsupportedEncodingException, IOException{ //GUI화면에 선택한 정보 화면에 출력
        String str;
        String[] key = null;
        int comboIndex = 0;
        String id = a.getKey(stu_list);
        try (BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"))) {
            while((str = read.readLine()) != null){
                if(str.contains(id)) //id값이 포함되어 있으면
                    key = str.split("/");
            }   
            switch(key[4]){ //콤보박스에 따라 정보 저장
            case "전산학과":
                comboIndex = 0; break;
            case "전자공학과":
                comboIndex = 1; break;
            case "화학공학과":
                comboIndex = 2; break;
            case "기계공학과":
                comboIndex = 3; break;
            case "항공우주공학과":
                comboIndex = 4; break;
            }   
            stu_num.setText(key[0].substring(1)); //학생 번호 설정
            stu_name.setText(key[1]);//학생 이름 설정
            stu_department.setSelectedIndex(comboIndex); //학과 설정
            stu_peoplenum.setText(key[3]); //주민증록번호 설정
            read.close();
            //파일 닫기
        }
    }
    
    public void clearStuInfo(){
        stu_num.setText(null); //학생 번호 설정
        stu_name.setText(null);//학생 이름 설정
        stu_department.setSelectedIndex(0); //학과 설정
        stu_peoplenum.setText(null); //주민증록번호 설정
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        stu_list = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stu_num = new javax.swing.JTextField();
        stu_name = new javax.swing.JTextField();
        stu_peoplenum = new javax.swing.JTextField();
        stu_department = new javax.swing.JComboBox<>();
        stu_exchange = new javax.swing.JButton();
        stu_delete = new javax.swing.JButton();
        goback = new javax.swing.JButton();
        searchfield = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        num_radio = new javax.swing.JRadioButton();
        name_radio = new javax.swing.JRadioButton();
        all_radio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stu_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "학번", "이름", "학과", "주민등록번호"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        stu_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stu_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stu_list);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel1.setText("학생 정보 조회 및 수정");

        jLabel2.setText("학번");

        jLabel3.setText("이름");

        jLabel4.setText("학과");

        jLabel5.setText("주민등록번호");

        stu_department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주공학과" }));

        stu_exchange.setText("수정");
        stu_exchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_exchangeActionPerformed(evt);
            }
        });

        stu_delete.setText("삭제");
        stu_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_deleteActionPerformed(evt);
            }
        });

        goback.setText("뒤로가기");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        search.setText("검색");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        buttonGroup1.add(num_radio);
        num_radio.setText("학번");

        buttonGroup1.add(name_radio);
        name_radio.setText("이름");

        buttonGroup1.add(all_radio);
        all_radio.setText("전체");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(search))
                            .addComponent(stu_peoplenum, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(stu_department, 0, 0, Short.MAX_VALUE)
                                .addComponent(stu_name)
                                .addComponent(stu_num, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(stu_exchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stu_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(goback, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num_radio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name_radio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(all_radio)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num_radio)
                            .addComponent(name_radio)
                            .addComponent(all_radio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stu_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stu_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stu_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stu_peoplenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stu_exchange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stu_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goback)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stu_exchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_exchangeActionPerformed
        // TODO add your handling code here:
        FileOutputStream wfile;
        String str;
        String id = a.getKey(stu_list);
        try {
            a.getStuList(stulist);
            if(stu_num.getText().isEmpty()){
                showMessageDialog(null, "강좌를 선택해 주세요");
            }
            else if(stu_num.getText().length()!=3){
                showMessageDialog(null, "학번이 3자리가 아닙니다.");
            }
            else if(stu_peoplenum.getText().length()!=13){
                showMessageDialog(null, "주민번호의 자리수가 일치하지않습니다.");
            }
            else{
                wfile = new FileOutputStream(file);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter((wfile), "euc-kr"));
                for(int i = 0; i < stulist.size(); i++){//id이랑 일치하는 객체 정보 변경
                    if(stulist.get(i).getId().equals("S"+id)){
                        stulist.get(i).setName(stu_name.getText());
                        stulist.get(i).setDepartMent(stu_department.getSelectedItem().toString());
                        stulist.get(i).setId("S"+stu_num.getText());
                        stulist.get(i).setPeopleNum(stu_peoplenum.getText());
                    }
                    str = String.format("%s/%s/%s/%s/%s%n", stulist.get(i).getId(), stulist.get(i).getName(), stulist.get(i).getPassWord(),stulist.get(i).getPeopleNum(),stulist.get(i).getDepartMent());
                    writer.write(str);
                    //변경 후 저장하거나 그대로 다시 파일에 저장
                }
                writer.close(); //파일 닫기
                clearStuInfo();
                a.sp_AddList(stu_list, file);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stu_exchangeActionPerformed

    private void stu_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stu_listMouseClicked
        try {
            // TODO add your handling code here:
            setStuInfo();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stu_listMouseClicked

    private void stu_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_deleteActionPerformed
        // TODO add your handling code here:
        String str;
        String key = null; 
        FileOutputStream wfile;   
         try {
             if(stu_num.getText().isEmpty()){
                showMessageDialog(null, "강좌를 선택해 주세요");
             }
             else{
                key = a.getKey(stu_list);
                a.getStuList(stulist);
                for(int i = 0; i<stulist.size(); i++){
                    if(key.equals(stulist.get(i).getId().substring(1)))
                        stulist.remove(i);
                }
                wfile = new FileOutputStream(file);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter((wfile), "euc-kr")); // 쓰기
                for(int i = 0; i< stulist.size();i++){ //리스트의 크기만큼 실행
                    str = String.format("%s/%s/%s/%s/%s%n", stulist.get(i).getId(), stulist.get(i).getName(), stulist.get(i).getPassWord(),stulist.get(i).getPeopleNum(),stulist.get(i).getDepartMent());
                    //format을 이용하여 메모장에 저장할 내용 str에 저장  //번호/이름/비밀번호/주민번호/학과
                    writer.write(str);//메모장에 쓰기
                }
                writer.close(); //닫기
                clearStuInfo();
                a.sp_AddList(stu_list, file);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stu_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)stu_list.getModel();
        try {
            if(num_radio.isSelected()){ //학번으로 찾기 검색
                a.getSearch(0, searchfield.getText(), stu_list,"S",file);
            }
            else if(name_radio.isSelected()){//이름으로 찾기 검색
                a.getSearch(1, searchfield.getText(), stu_list,"S",file);
            }
            else if(all_radio.isSelected()){ //전체 선택시 학생 전체리스트 띄우기
                a.sp_AddList(stu_list, file);
            }
            searchfield.setText(null);
         } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExChange_Stu_Info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_gobackActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton all_radio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton name_radio;
    private javax.swing.JRadioButton num_radio;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchfield;
    private javax.swing.JButton stu_delete;
    private javax.swing.JComboBox<String> stu_department;
    private javax.swing.JButton stu_exchange;
    private javax.swing.JTable stu_list;
    private javax.swing.JTextField stu_name;
    private javax.swing.JTextField stu_num;
    private javax.swing.JTextField stu_peoplenum;
    // End of variables declaration//GEN-END:variables
}