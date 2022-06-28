package br.com.alura.springdata;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springdata.service.CargoService;
import br.com.alura.springdata.service.FuncionarioService;
import br.com.alura.springdata.service.UnidadeTrabalhoService;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{
	private Boolean system = true;

	private final CargoService cargoService;

	private final FuncionarioService funcionarioService;

	private final UnidadeTrabalhoService unidadeTrabalhoService;

	public SpringDataApplication(CargoService cargoService,
			FuncionarioService funcionarioService, 
			UnidadeTrabalhoService unidadeTrabalhoService) {
		this.cargoService = cargoService;
		this.funcionarioService = funcionarioService;
		this.unidadeTrabalhoService = unidadeTrabalhoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		while (system) {
			System.out.println("Qual função deseja executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Funcionario");
			System.out.println("2 - Cargo");
			System.out.println("3 - Unidade");
			
			Integer function = scanner.nextInt();

			switch (function) {
				case 1:
					cargoService.inicial(scanner);
					break;
				case 2:
					funcionarioService.inicial(scanner);
					break;
				case 3:
					unidadeTrabalhoService.inicial(scanner);
					break;
				default:
					System.out.println("Finalizando");
					system = false;
					break;
			}
		}
	}
}
