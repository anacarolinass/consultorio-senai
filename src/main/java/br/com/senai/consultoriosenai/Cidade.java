package br.com.senai.consultoriosenai;

import org.springframework.stereotype.Component;

@Component
public class Cidade {
	
	private Integer Id;
	
	private String Descricao;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	

}
