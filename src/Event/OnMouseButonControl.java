/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;

import form.Dashboard;
import form.Signin;
import form.Signup;

/**
 *
 * @author Chenhai
 */
public class OnMouseButonControl {
    static public void OnMouseClicked(java.awt.event.MouseEvent evt){
        switch (evt.getComponent().getName()){
            case "Login" :{
                new Dashboard().setVisible(true);
            }break;
            case "Signup" :{
                new Signup().setVisible(true);
            }break;
            case "Back" :{
                new Signin().setVisible(true);
            }break;
            case "Summit" :{
                new Signin().setVisible(true);
            }break;
            case "Reset" :{
                //Create Message box  "Are you sure ?" YesNo
                
                //If(Yes) 
                new Signin().setVisible(true);
            }break;
        }
    }
    
    static public void OnMouseEntered(java.awt.event.MouseEvent evt){
        
        String[] NameComponent = {"Login","Signup","Back","Summit","Reset"};
        for (String NameComponent1 : NameComponent) {
            if (NameComponent1.equals(evt.getComponent().getName())) {
                evt.getComponent().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }
        }
    }
}
