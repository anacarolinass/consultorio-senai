package br.com.senai.consultoriosenai;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;


@Component
@Qualifier("daoPacientePostgres")
public class DaoPacientePostgres implements DaoPaciente {
	
	
	public void inserir(Paciente paciente) {
		
		System.out.println("Inserindo no banco");
	}
	
	
	

}
