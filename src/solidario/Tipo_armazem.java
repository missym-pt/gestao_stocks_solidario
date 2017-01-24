/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario;

/**
 *
 * @author Missy M
 */
public class Tipo_armazem {
    
    private int id_tipo_armazem;
    private String nome_tipo_armazem;
    private Categoria_produtos categoria_produtos;
    
    public Tipo_armazem(int id_tipo_armazem, String nome_tipo_armazem, Categoria_produtos categoria_produtos ){
        this.id_tipo_armazem=id_tipo_armazem;
        this.nome_tipo_armazem=nome_tipo_armazem;
        this.categoria_produtos=categoria_produtos;
    }

    public int getId_tipo_armazem() {
        return id_tipo_armazem;
    }

    public void setId_tipo_armazem(int id_tipo_armazem) {
        this.id_tipo_armazem = id_tipo_armazem;
    }

    public String getNome_tipo_armazem() {
        return nome_tipo_armazem;
    }

    public void setNome_tipo_armazem(String nome_tipo_armazem) {
        this.nome_tipo_armazem = nome_tipo_armazem;
    }

    public Categoria_produtos getCategoria_produtos() {
        return categoria_produtos;
    }

    public void setCategoria_produtos(Categoria_produtos categoria_produtos) {
        this.categoria_produtos = categoria_produtos;
    }
    
    
}
