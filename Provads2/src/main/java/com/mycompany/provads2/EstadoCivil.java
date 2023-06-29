/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.provads2;

/**
 *
 * @author Aluno
 */
public enum EstadoCivil {
    SOLTEIRO("solteiro"),
    CASADO("casado"),
    SEPARADO("separado"),
    DIVORCIADO("divorciado"),
    VIUVO("viuvo");
    
    private final String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
}
