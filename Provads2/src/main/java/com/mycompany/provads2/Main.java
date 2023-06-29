/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.provads2;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy ("75768", "Luqueta", "775.156.354-15", "54331", new Endereco("Casa", "485", "rua", "40700530", "Salvador", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.MASCULINO, 78, EstadoCivil.SOLTEIRO, LocalDate.of(1994, Month.MARCH, 2));
        
        System.out.println("Demitindo o motoboy: " + motoboy.toString());   
        System.out.println("");
        
     Engenheiro engenheiro = new Engenheiro("745", "Gustavao", "157.675.136-18", "2234678", new Endereco("Rua", "470B", "Casa", "40200-700", "Salvador", UnidadeFederativa.BAHIA), Setor.ENGENHARIA, Genero.MASCULINO, 270, EstadoCivil.SOLTEIRO, LocalDate.of(1970, Month.MARCH, 4));
        System.out.println("Admitir o engenheiro: " + engenheiro.toString());
        System.out.println("");
        
        Diretor diretor = new Diretor (Bonificacao.GERENTE, "Carlao", "775.456.128-13", "2213349", new Endereco("Rua", "900", "Casa", "40700-100", "Salvador", UnidadeFederativa.BAHIA), Setor.JURIDICO, Genero.MASCULINO, 800, EstadoCivil.SEPARADO, LocalDate.of(1978, Month.MARCH, 6));
        System.out.println("Admitindo diretor: " + diretor.toString());
        System.out.println("");
    }
    
}
    

