/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mayormenor;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Mayormenor {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("ingresa la edad");
        edad = sc.nextInt();
        if (edad<18){
            System.out.println("usted es menor de edad");
        }else
            System.out.println("usted es mayor de edad");
    }
    
}
