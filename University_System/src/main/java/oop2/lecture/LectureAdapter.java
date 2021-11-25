/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.lecture;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class LectureAdapter {
    public void addList(JTable lecture_list) throws FileNotFoundException, IOException{ 
        //개설전 강의 리스트 테이블에 출력
        String lec;
        String[] key ;
        BufferedReader str = new BufferedReader(new InputStreamReader(new FileInputStream("insertlecturelist.txt"), "euc-kr"));
        DefaultTableModel table = (DefaultTableModel)lecture_list.getModel();
        while((lec = str.readLine()) != null){
            key = lec.split("/");
            Object[] list = { key[0], key[1], key[2], key[3], key[4]};
            table.addRow(list);//행추가
        }
    }
    
    public void exChangeList(JTable lecture_list) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        //한번도 개설되지 않은 수업 리스트를 읽어와서 테이블에 나타낸다.
        String lec;
        String[] key ;
        BufferedReader str = new BufferedReader(new InputStreamReader(new FileInputStream("insertlecturelist.txt"), "euc-kr"));
        DefaultTableModel table = (DefaultTableModel)lecture_list.getModel();
        while((lec = str.readLine()) != null){
            key = lec.split("/");
            if(key[5].equals("false")){
                Object[] list = { key[0], key[1], key[2], key[3]};
                table.addRow(list);
            }else
                continue;
        }
    }
    
    public String getKey(JTable lecture_list){ //테이블에 선택된 키값 전달 
        String key = null;
        DefaultTableModel model = (DefaultTableModel)lecture_list.getModel();
        int row = lecture_list.getSelectedRow();
        key = (String) model.getValueAt(row, 0);
        return key;
    }
    
    public void getLectureList(ArrayList<Course> lecList) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        String str;
        String[] key;
        lecList.clear();
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("insertlecturelist.txt"), "euc-kr"));
        while((str = read.readLine()) != null ){
            key = str.split("/");
            lecList.add(new Course(key[0],key[1],null,key[2],key[3],key[4],null,null,key[5]));
        }
    }
    
    public boolean checkEqules(String num, String file ) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        String lec;
        boolean check = false;
        BufferedReader str = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"));
        while((lec = str.readLine()) != null){
            if(lec.contains(num)){
                check = true;
                break;
            }
        }
        return check;
    }
}
