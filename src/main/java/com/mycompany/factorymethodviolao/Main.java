/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethodviolao;

public class Main {
    public static void main(String[] args) {
        ViolaoFactory factory = new ViolaoFactoryConcreto();
        System.out.println("Giannini");
        Violao g = factory.calcularPreco("GIANNINI");
        System.out.println(g.getPreco());
        
        System.out.println("Tagima");
        Violao t = factory.calcularPreco("TAGIMA");
        System.out.println(t.getPreco());
        
        System.out.println("Eagle");
        Violao e = factory.calcularPreco("EAGLE");
        System.out.println(e.getPreco());
        
    }
}
