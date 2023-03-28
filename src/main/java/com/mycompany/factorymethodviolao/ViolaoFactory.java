/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethodviolao;

/**
 *
 * @author Aluno
 */
public abstract class ViolaoFactory {
    protected abstract Violao createViolao(String marca);
    
    public Violao calcularPreco(String tipo) {
        Violao violao = createViolao(tipo); 
        return violao; 
    }
    
}
