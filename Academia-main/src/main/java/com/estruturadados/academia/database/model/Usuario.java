/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estruturadados.academia.database.model;

/**
 *
 * @author lab201a
 */
public class Usuario {
    private int codigo;
    private String nome;
    private String senha;
    private String perfil;
    
    public Usuario(){
        
    }

    public Usuario(int codigo, String nome, String senha, String perfil) {
        this.codigo = codigo;
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
