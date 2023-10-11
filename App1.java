/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Izberete figura za izchislenie: ");
        System.out.println("1. Pravougulnik");
        System.out.println("2. Kvadrat");
        System.out.println("3. Triugulnik");
        System.out.println("4. Prost polygon");
        System.out.println("5. Okruzhnost");
        int choice=scan.nextInt();
        switch(choice){
            case 1:
                calculateRectangle();
                break;
            case 2:
                calculateSquare();
                break;
            case 3:
                calculateTriangle();
                break;
            case 4:
                calculatePolygon();
                break;
            case 5:
                calculateCircle();
                break;
            default:
                System.out.println("Nevaliden izbor.");
                break;
        }
    }
    public static void calculateRectangle(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete dulzhina na strana A: ");
        double a=scan.nextDouble();
        System.out.print("Vuvedete dulzhina na strana B: ");
        double b=scan.nextDouble();
        double perimeter=2*(a+b);
        double area=a*b;
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Plosht: "+area);
    }
    public static void calculateSquare(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete dulzhina na strana: ");
        double a=scan.nextDouble();
        double perimeter=a*4;
        double area=a*a;
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Plosht: "+area);
    }
    public static void calculateTriangle(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete dulzhina na strana A: ");
        double a=scan.nextDouble();
        System.out.print("Vuvedete dulzhina na strana B: ");
        double b=scan.nextDouble();
        System.out.print("Vuvedete dulzhina na strana C: ");
        double c=scan.nextDouble();
        double perimeter=a+b+c;
        double p=perimeter/2;
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Plosht: "+area);
    }
    public static void calculatePolygon(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete broi strani na polygona: ");
        int numS=scan.nextInt();
        double perimeter=0;
        double area=0;
        for(int i=1;i<=numS;i++){
            System.out.print("Vuvedete dulzhina na strana "+i+": ");
            double s=scan.nextDouble();
            perimeter+=s;
        }
        System.out.println("Perimeter: "+perimeter);
    }
    public static void calculateCircle(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete dulzhina na okruzhnosta: ");
        double r=scan.nextDouble();
        double perimeter=2*Math.PI*r;
        double area=Math.PI*(r*r);
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Plosht: "+area);
    }
}
