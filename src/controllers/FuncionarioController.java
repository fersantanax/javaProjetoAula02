package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Departamento;
import entities.Funcionario;
import repositories.FuncionarioRepository;

public class FuncionarioController {

	public void cadastrarFuncionario() {
		try {
			System.out.println("\n CADASTRO DE FUNCIONÁRIO \n");

			Funcionario funcionario = new Funcionario();

			funcionario.setDepartamento(new Departamento());

			funcionario.setId(UUID.randomUUID());

			Scanner scanner = new Scanner(System.in);
			System.out.print("NOME DO FUNCIONÁRIO...: ");
			funcionario.setNome(scanner.nextLine());
			System.out.print("CPF...................: ");
			funcionario.setCpf(scanner.nextLine());
			System.out.print("MATRÍCULA.............: ");
			funcionario.setMatricula(scanner.nextLine());
			System.out.print("SALÁRIO...............: ");
			funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

			funcionario.getDepartamento().setId(UUID.randomUUID());
			System.out.print("SIGLA DO DEPTO........: ");
			funcionario.getDepartamento().setSigla(scanner.nextLine());
			System.out.print("DESCRIÇÃO DO DEPTO....: ");
			funcionario.getDepartamento().setDescricao(scanner.nextLine());

			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarParaTxt(funcionario);

			scanner.close();
		} catch (Exception e) {

			System.out.println("\nFALHA AO CADASTRAR FUNCIONÁRIO!");
			System.out.println("\nERRO: " + e.getMessage());
		}
	}
}