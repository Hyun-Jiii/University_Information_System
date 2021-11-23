/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.main;

/**
 *
 * @author User
 */
public class User {
    

    //학사 담당자, 수업 담당자, 학생, 교수의 상위 클래스
    protected String name; //개인의 이름
    protected String id;  //개인 아이디
    protected String passWord; //개인 비밀번호
    protected String peopleNum; //주민번호
    protected String departMent; //학과
    public final static int ID = 0;  // 각 테이블의 아이디 순서
    public final static int PW = 2;  // 각 테이블의 비밀번호 순서
    
    public User(){
    }
    
    public User(String name){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
        
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getPeopleNum() {
        return peopleNum;
    }

    public String getDepartMent() {
        return departMent;
    }
    
    public void exchageInfo(){
        
    }
}
