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
import oop2.professor.Professor;
import oop2.student.Student;

/**
 *
 * @author User
 */
public class SchoolAdapter {
    public void sp_AddList(JTable tableList, String file) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        //테이블에 학생 교수 리스트 출력
        String str;
        String[] key ;
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"));
        DefaultTableModel table = (DefaultTableModel)tableList.getModel();
        table.setNumRows(0);
        while((str = read.readLine()) != null){
            key = str.split("/");
            Object[] list = { key[0], key[1], key[4], key[3]};
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
        //학생의 내용을 배열에 저장
        String str;
        String[] key;
        stulist.clear();
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("student.txt"), "euc-kr"));
        while((str = read.readLine()) != null ){
            key = str.split("/");
            stulist.add(new Student(key[0].substring(1),key[1],key[3],key[4]));
        }
    }
    
    public void getProList(ArrayList<Professor> prolist) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        //교수의 내용을 배열에 저장
        String str;
        String[] key;
        prolist.clear();
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("professor.txt"), "euc-kr"));
        while((str = read.readLine()) != null ){
            key = str.split("/");
            prolist.add(new Professor(key[0].substring(1),key[1],key[3],key[4]));
        }
    }
    
    public void getSearch(int index, String info, JTable tablelist,String job, String file) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        //검색
        String str;
        String[] key;
        DefaultTableModel model = (DefaultTableModel)tablelist.getModel();
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"));
        model.setNumRows(0);
        info = job+info; //찾아야하는 정보
        while((str=read.readLine())!=null){
            key = str.split("/");
            if(key[index].equals(info)){
                Object[] list = {key[0],key[1],key[4],key[3]};
                model.addRow(list);
            }
        }
    }
}
