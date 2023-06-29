/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.provads2;

/**
 *
 * @author Aluno
 */
public enum Genero {
   MASCULINO('M', "Masculino"),
   FEMININO('F', "Femino");
   
   private final char caratere;
   private final String texto;

    private Genero(char caratere, String texto) {
        this.caratere = caratere;
        this.texto = texto;
    }

    public char getCaratere() {
        return caratere;
    }

    public String getTexto() {
        return texto;
    }
   
}
