package br.com.senai.consultoriosenai;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("daoPacienteXML")
public class DaoPacienteXML implements DaoPaciente{

	@Override
	public void inserir(Paciente paciente) {
		
		System.out.println("Inserindo no XML");
		
	}
	
	

}
