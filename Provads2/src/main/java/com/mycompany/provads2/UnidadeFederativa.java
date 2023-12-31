/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.provads2;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
  BAHIA("Bahia", "BA"),
  SAO_PAULO("Sao paulo", "SP"),
  RIO_DE_JANEIRO("Rio de janeiro", "RJ");

 private final String nome;
 private final String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

    public static UnidadeFederativa getRIO_DE_JANEIRO() {
        return RIO_DE_JANEIRO;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

  
}
