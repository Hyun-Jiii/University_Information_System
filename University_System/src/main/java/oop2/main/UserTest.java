/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.main;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author PC
 */
public class UserTest {
     //학사 담당자, 수업 담당자, 학생, 교수의 상위 클래스
    protected String name; //개인의 이름
    protected String id;  //개인 아이디
    protected String passWord; //개인 비밀번호
    protected String peopleNum; //주민번호
    protected String departMent; //학과
    
    String[] UserArray = {id, name,passWord, peopleNum, departMent};
    ArrayList<String> usertest = new ArrayList<>(Arrays.asList(UserArray));
    
}
