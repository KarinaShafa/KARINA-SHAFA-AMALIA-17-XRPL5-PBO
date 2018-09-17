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
public class Tugas3 {
    public static void main (String[] args){
        //deklarasi variabel
        String nama, tempatlahir,kelamin, alamat, motto;
        int nis, tanggallahir;
        
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilan output ke user
        System.out.print("Nama : ");
        nama = keyboard.next();
        
        System.out.print("NIS : ");
        nis = keyboard.nextInt();
        
        System.out.print("Tempat Lahir : ");
        tempatlahir = keyboard.next();
        
        System.out.print("Tanggal Lahir : ");
        tanggallahir = keyboard.nextInt();
        
        System.out.print("Jenis Kelamin : ");
        kelamin = keyboard.next();
        
        System.out.print("Alamat di Malang : ");
        alamat = keyboard.next();
        
        System.out.print("Motto Hidup : ");
        motto = keyboard.next();
        
        //menampilkan apa yang sudah simpan di variabel
        System.out.println("-------------------");
        System.out.println("Nama : " + nama);
        System.out.println("NIS : " + nis);
        System.out.println("Tempat Lahir : " + tempatlahir);
        System.out.println("Tanggal Lahir : " + tanggallahir); 
        System.out.println("Jenis Kelamin : " + kelamin);
        System.out.println("Alamat di Malang : " + alamat);
        System.out.println("Motto Hidup : " + motto);
    }
    }
