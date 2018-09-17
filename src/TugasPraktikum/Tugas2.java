/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas2 {
    public static void main (String[] args){
        Scanner masukan = new Scanner (System.in);
        double suhu = 78;
        System.out.print("Ubah ke dalam : 1. Reamur 2. Farenheit 3. Kelvin");
        int pil = masukan.nextInt();
        switch (pil){
            case 1 : System.out.println("Reamur = "+(suhu*4/5)+" R");
            break;
        case 2 : System.out.println("Farenheit = "+((suhu*9/5)+32)+" F");
                break;
        case 3 : System.out.println("Kelvin = "+(suhu + 273)+" K");
        }
    }
}
