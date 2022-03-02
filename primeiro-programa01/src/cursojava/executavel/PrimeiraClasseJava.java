package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutentincacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			//lerArquivo();

			String login = JOptionPane.showInputDialog("Qual � o login :");
			String senha = JOptionPane.showInputDialog("Qual � o senha :");

			if (new FuncaoAutentincacao(new Diretor(login, senha))
					.autenticar()) { /*
										 * Vou travar o contrato para autorizar somente quem realmente tem contrato 100
										 * % leg�timo
										 */

				List<Aluno> alunos = new ArrayList<Aluno>(); // null
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual � a idade do aluno ?");

					/*
					 * String dataNascimento =
					 * JOptionPane.showInputDialog("Qual � a data de Nascimento  do aluno ?");
					 * String rg =
					 * JOptionPane.showInputDialog("Qual � o Registro geral do aluno ?"); String cpf
					 * = JOptionPane.showInputDialog("Qual � CPF do aluno ?"); String mae =
					 * JOptionPane.showInputDialog("Qual � nome da m�e do aluno ?"); String pai =
					 * JOptionPane.showInputDialog("Qual � o nome do pai do aluno ?"); String
					 * matricula
					 * =JOptionPane.showInputDialog("Qual � a data da matr�cula do aluno ?"); String
					 * serie = JOptionPane.showInputDialog("Qual � a s�rie do aluno ?"); String
					 * escola = JOptionPane.showInputDialog("Qual � o nome da escola do aluno ?");
					 * 
					 * 
					 * String disciplina1 = JOptionPane.showInputDialog("Qual � a Disciplina1 ?");
					 * String nota1 = JOptionPane.showInputDialog("Qual � a nota 1 do aluno ?");
					 * 
					 * String disciplina2 = JOptionPane.showInputDialog("Qual � a Disciplina2 ?");
					 * String nota2 = JOptionPane.showInputDialog("Qual � a nota 2 do aluno ?");
					 * 
					 * String disciplina3 = JOptionPane.showInputDialog("Qual � a Disciplina 3 ?");
					 * String nota3 = JOptionPane.showInputDialog("Qual � a nota 3 do aluno ?");
					 * 
					 * 
					 * String disciplina4 = JOptionPane.showInputDialog("Qual � a Disciplina 4 ?");
					 * String nota4 = JOptionPane.showInputDialog("Qual � a nota 4 do aluno ?");
					 * 
					 */

					Aluno aluno1 = new Aluno();
					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

					/*
					 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
					 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
					 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
					 * aluno1.setNomeEscola(escola);
					 */

					for (int pos = 1; pos <= 1; pos++) {

						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota  da disciplina " + pos + " ?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						//disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

					if (escolha == 0) { // Op��o Sim � Zero

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina, 1,2,3 ou 4 ?");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continar a remover ?");

							/*
							 * Disciplina disciplina1 = new Disciplina();
							 * disciplina1.setDisciplina("Banco de dados"); disciplina1.setNota(90);
							 * 
							 * 
							 * 
							 * Disciplina disciplina2 = new Disciplina();
							 * disciplina2.setDisciplina("Matem�tica"); disciplina2.setNota(80);
							 * 
							 * 
							 * Disciplina disciplina3 = new Disciplina();
							 * disciplina3.setDisciplina("Geografia"); disciplina3.setNota(97);
							 * 
							 * 
							 * 
							 * Disciplina disciplina4 = new Disciplina();
							 * disciplina4.setDisciplina("Java Web"); disciplina4.setNota(70);
							 * 
							 * // adicionando na lista aluno1.getDisciplinas().add(disciplina1);
							 * aluno1.getDisciplinas().add(disciplina2);
							 * aluno1.getDisciplinas().add(disciplina3);
							 * aluno1.getDisciplinas().add(disciplina4);
							 * 
							 */
						}
					}

					alunos.add(aluno1);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				/*
				 * for (int pos = 0; pos < alunos.size(); pos++) {
				 * 
				 * Aluno aluno = alunos.get(pos);
				 * 
				 * if (aluno.getNome().equalsIgnoreCase("alex")) {
				 * 
				 * Aluno trocar = new Aluno(); trocar.setNome("Aluno foi trocado");
				 * 
				 * Disciplina disciplina = new Disciplina();
				 * disciplina.setDisciplina("Matem�tica"); disciplina.setNota(96);
				 * 
				 * trocar.getDisciplinas().add(disciplina);
				 * 
				 * alunos.set(pos, trocar); aluno = alunos.get(pos); }
				 * 
				 * System.out.println("Aluno = " + aluno.getNome());
				 * System.out.println("Media do aluno : " + aluno.getMediaNota());
				 * System.out.println("Resultado :" + aluno.getAlunoAprovado2());
				 * System.out.println("================================================");
				 * 
				 * for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
				 * 
				 * Disciplina disc = aluno.getDisciplinas().get(posd);
				 * System.out.println("Materia = " + disc.getDisciplina() + "Nota = " +
				 * disc.getNota());
				 * 
				 * } }
				 */

				/*
				 * for (Aluno aluno : alunos) {
				 * 
				 * if (aluno.getNome().equalsIgnoreCase("alex")) {
				 * 
				 * alunos.remove(aluno); break; } else {
				 * 
				 * System.out.println(aluno); // Descri��o do objeto na mem�ria
				 * System.out.println("Media do aluno =" + aluno.getMediaNota()); //
				 * System.out.println("Resultado � :" + (aluno1.getAlunoAprovado2() ? "Aprovado"
				 * { // : "Reprovado")); System.out.println("Resultado � :" +
				 * aluno.getAlunoAprovado2());
				 * System.out.println("------------------------------------------"); }
				 * 
				 * /* Equals e hashCodes (Diferenciar e comparar objetos
				 */

				/*
				 * Aluno aluno1 = new Aluno(); aluno1.setNome("Alex");
				 * aluno1.setNumeroCpf("123");
				 * 
				 * Aluno aluno2 = new Aluno(); aluno2.setNome("Alex");
				 * aluno2.setNumeroCpf("1234");
				 * 
				 * 
				 * 
				 * if (aluno1.equals(aluno2)) { System.out.println("Alunos s�o iguais"); } else
				 * { System.out.println("Alunos n�o s�o iguais"); } }
				 */

				/*
				 * for (Aluno aluno : alunos) {
				 * System.out.println("Alunos que sobraram na lista ");
				 * System.out.println(aluno.getNome());
				 * System.out.println("Suas mat�rias s�o :");
				 * 
				 * for (Disciplina disciplina : aluno.getDisciplinas()) {
				 * System.out.println(disciplina.getDisciplina()); } }
				 */

				for (Aluno aluno : alunos) { // Separando a lista

					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("----------------Lista dos Aprovados --------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " " + aluno.getNome()
							+ "  com m�da de = " + aluno.getMediaNota());
				}

				System.out.println("----------------Lista dos Reprovados --------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " " + aluno.getNome()
							+ "   com m�da de = " + aluno.getMediaNota());
				}

				System.out.println("----------------Lista dos Recupera��o --------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " " + aluno.getNome()
							+ " com m�da de = " + aluno.getMediaNota());
				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso n�o permitido");
			}

			/* Aqui */

		} catch (Exception e) {
			StringBuilder saida = new StringBuilder();
			e.printStackTrace(); /* Imprime erro no console */

			/* Mensagem do Erro */
			System.out.println("mensagem :" + e.getMessage());

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {

				saida.append("\nClasse do erro : " + e.getStackTrace()[pos].getClassName());
				saida.append("\nM�todo do erro : " + e.getStackTrace()[pos].getMethodName());
				saida.append("\nlinha do erro : " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\nClass : " + e.getClass().getName());

			}

			JOptionPane.showMessageDialog(null, "Erro de convers�o de n�mero" + saida.toString());
		} finally {/* Sempre ser� executado, ocorrendo ou n�o um erro */
			JOptionPane.showMessageDialog(null, "Obrigado por aprender java comigo");
		}
	}

	/*public static void lerArquivo() throws FileNotFoundException {

		File fil = new File("c://lines.txt");
		Scanner scanner = new Scanner(fil);
	} */
}