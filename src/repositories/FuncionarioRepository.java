package repositories;

import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	public void exportarParaTxt(Funcionario funcionario) {
		try {

			PrintWriter printWriter = new PrintWriter("c:\\temp\\funcionario_" + funcionario.getId() + ".txt");

			printWriter.write("\nID DO FUNCIONÁRIO..: " + funcionario.getId());
			printWriter.write("\nNOME...............: " + funcionario.getNome());
			printWriter.write("\nCPF................: " + funcionario.getCpf());
			printWriter.write("\nMATRICULA..........: " + funcionario.getMatricula());
			printWriter.write("\nSALÁRIO............: " + funcionario.getSalario());
			printWriter.write("\nSIGLA DO DEPTO.....: " + funcionario.getDepartamento().getSigla());
			printWriter.write("\nDESCRIÇÂO DO DEPTO.: " + funcionario.getDepartamento().getDescricao());
			printWriter.flush();
			printWriter.close();
			System.out.println("\nARQUIVO TXT GRAVADO COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("\nFALHA AO GRAVAR ARQUIVO TXT:");
			System.out.println("\nERRO: " + e.getMessage());

		}
	}

}
