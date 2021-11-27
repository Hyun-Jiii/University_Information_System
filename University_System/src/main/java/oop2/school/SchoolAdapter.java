/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.school;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oop2.lecture.Course;
import oop2.student.Student;

/**
 *
 * @author User
 */
public class SchoolAdapter {
    public void sp_AddList(JTable tableList, String file) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        String str;
        String[] key ;
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"));
        DefaultTableModel table = (DefaultTableModel)tableList.getModel();
        table.setNumRows(0);
        while((str = read.readLine()) != null){
            key = str.split("/");
            Object[] list = { key[0].substring(1), key[1], key[4], key[3]};
            table.addRow(list);//행추가
        }
    }
    
    public String getKey(JTable tablelist){ //테이블에 선택된 키값 전달 
        String key = null;
        DefaultTableModel model = (DefaultTableModel)tablelist.getModel();
        int row = tablelist.getSelectedRow();
        key = (String) model.getValueAt(row, 0);
        return key;
    }
    
    public void getStuList(ArrayList<Student> stulist) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        String str;
        String[] key;
        stulist.clear();
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("student.txt"), "euc-kr"));
        while((str = read.readLine()) != null ){
            key = str.split("/");
            stulist.add(new Student(key[0].substring(0+1),key[1],key[3],key[4]));
        }
    }
    
    public void getSearch(int index, String info, JTable tablelist) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        String str;
        String[] key;
        DefaultTableModel model = (DefaultTableModel)tablelist.getModel();
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("student.txt"), "euc-kr"));
        model.setNumRows(0);
        if(index==0)
            info = "S"+info;
        while((str=read.readLine())!=null){
            key = str.split("/");
            if(key[index].equals(info)){
                Object[] list = {key[0].substring(1),key[1],key[4],key[3]};
                model.addRow(list);
            }
        }
    }
}
