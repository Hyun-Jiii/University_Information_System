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
public class Professer extends User {
    
    public Professer (String peoplenum, String name, String department){
        this.name = name;
        this.peopleNum = peoplenum;
        this.departMent = department;
        int random = (int)(Math.random()*(1000-100))+100;
        this.id = "p1234";//"+ Integer.toString(random);
        this.passWord = peoplenum.substring(6);
    }
}
