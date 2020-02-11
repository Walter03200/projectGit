//Autor:Walter
//Fecha: 4/2/2020

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogit;

import java.util.Scanner;

/**
 *
 * @author walterapacac
 */
public class ProjectoGit {
static Scanner Keyboard= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        // TODO code application logic here
        
        int dni;
        System.out.println("Cual es tu DNI:");
        dni=Keyboard.nextInt();
        char letter=DNIletter(dni);
        System.out.println(dni+":"+letter);
                
    }
    
   private static char DNIletter(int dni){
    char letter='T';
   String letters="TRWAGMYFPDXBNJZSQVHLCKE";
   int res=dni%23;
   letter=letters.charAt(res);
    return letter;
}
}
   
