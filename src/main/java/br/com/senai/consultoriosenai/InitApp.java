package br.com.senai.consultoriosenai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InitApp {

	public static void main(String[] args) {
		SpringApplication.run(InitApp.class, args);
	}
	
	@Autowired
	private Paciente paciente;
	
	@Autowired
	@Qualifier("daoPacienteXML")
	private DaoPaciente daoPaciente;
	
	@Bean
	public CommandLineRunner commandLineRunner (ApplicationContext ctx) {
		return args -> {
			
			daoPaciente.inserir(paciente);
			
			System.out.println(paciente);
			
			System.out.println(paciente.getCidade());
			
			System.out.println("Executando comando no console");
		
		};
	}
}
