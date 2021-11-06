/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.professer;

import oop2.main.User;

/**
 *
 * @author User
 */
public class Professer extends User { //User클래스를 상속 받은 교수 클래스
    public Professer (String peoplenum, String name, String department){//객체 생성을 위한 생성자
        this.name = name;
        this.peopleNum = peoplenum;
        this.departMent = department;
        int random = (int)(Math.random()*(1000-100))+100;
        this.id = "p"+ Integer.toString(random);
        this.passWord = peoplenum.substring(6);
    }
}
