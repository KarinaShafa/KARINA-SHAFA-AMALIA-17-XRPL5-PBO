/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JobsheetPBOLanjutan;

/**
 *
 * @author ASUS
 */
public class TugasPraktikum1 {
    public static void main(String[] args){
        int x, y;
        for(x=1; x<=4; x++){
            for(y=1;y<=4; y++){
        if(x==4||x==1||y==1||y==4){
            System.out.print("@");
        }
        else
            System.out.print(" ");
        }
        System.out.println();
    }
    }
}