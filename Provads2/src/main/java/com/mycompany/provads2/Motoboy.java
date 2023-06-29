/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provads2;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario{
    private String CarteiraDeHabilitacao;

    public Motoboy(String CarteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento);
        this.CarteiraDeHabilitacao = CarteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return CarteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String CarteiraDeHabilitacao) {
        this.CarteiraDeHabilitacao = CarteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n CarteiraDeHabilitacao: " + CarteiraDeHabilitacao;
    }

    @Override
    public double SalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
