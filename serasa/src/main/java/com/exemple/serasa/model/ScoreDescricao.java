package com.exemple.serasa.model;

public enum ScoreDescricao {
	//enum utilizado na camada service name()
	INSUFICIENTE("Insuficiente"),
    INACEITAVEL("Inaceitável"),
    ACEITAVEL("Aceitável"),
    RECOMENDAVEL("Recomendácel");


    private String descricao;

    ScoreDescricao(String descricao) {
        this.descricao = descricao;
    }

}
