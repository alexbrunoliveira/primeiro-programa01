package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutentincacao;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Qual é o login :");
		String senha = JOptionPane.showInputDialog("Qual é o senha :");
		
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		if(new Secretario().autenticar(login, senha)) { /*Vou travar o contrato para autorizar somente quem realmente tem contrato 100 % legítimo*/ 

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
			
			
			/*
			 * String idade = JOptionPane.showInputDialog("Qual é a idade do aluno ?");
			 * String dataNascimento =
			 * JOptionPane.showInputDialog("Qual é a data de Nascimento  do aluno ?");
			 * String rg =
			 * JOptionPane.showInputDialog("Qual é o Registro geral do aluno ?"); String cpf
			 * = JOptionPane.showInputDialog("Qual é CPF do aluno ?"); String mae =
			 * JOptionPane.showInputDialog("Qual é nome da mãe do aluno ?"); String pai =
			 * JOptionPane.showInputDialog("Qual é o nome do pai do aluno ?"); String
			 * matricula =
			 * JOptionPane.showInputDialog("Qual é a data da matrícula do aluno ?"); String
			 * serie = JOptionPane.showInputDialog("Qual é a série do aluno ?"); String
			 * escola = JOptionPane.showInputDialog("Qual é o nome da escola do aluno ?");
			 */

			/*
			 * String disciplina1 = JOptionPane.showInputDialog("Qual é a Disciplina1 ?");
			 * String nota1 = JOptionPane.showInputDialog("Qual é a nota 1 do aluno ?");
			 * 
			 * String disciplina2 = JOptionPane.showInputDialog("Qual é a Disciplina2 ?");
			 * String nota2 = JOptionPane.showInputDialog("Qual é a nota 2 do aluno ?");
			 * 
			 * String disciplina3 = JOptionPane.showInputDialog("Qual é a Disciplina 3 ?");
			 * String nota3 = JOptionPane.showInputDialog("Qual é a nota 3 do aluno ?");
			 * 
			 * 
			 * String disciplina4 = JOptionPane.showInputDialog("Qual é a Disciplina 4 ?");
			 * String nota4 = JOptionPane.showInputDialog("Qual é a nota 4 do aluno ?");
			 * 
			 */

			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome); 
			/*
			 * aluno1.setNome(nome); 
			 * aluno1.setIdade(Integer.valueOf(idade));
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
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

			if (escolha == 0) { // Opção Sim é Zero

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
					 * disciplina2.setDisciplina("Matemática"); disciplina2.setNota(80);
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

		for (int pos = 0; pos < alunos.size(); pos++) {

			Aluno aluno = alunos.get(pos);
			
			
			if (aluno.getNome().equalsIgnoreCase("alex")) {
				
				Aluno trocar = new Aluno ();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matemática");
				disciplina.setNota(96);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
			}

			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Media do aluno : " + aluno.getMediaNota());
			System.out.println("Resultado :" + aluno.getAlunoAprovado2());
			System.out.println("================================================");
			
			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd ++) {
				 
				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("Materia = " + disc.getDisciplina() + "Nota = " + disc.getNota());
				
			}
		}

		/*
		 * for (Aluno aluno : alunos) {
		 * 
		 * if (aluno.getNome().equalsIgnoreCase("alex")) {
		 * 
		 * alunos.remove(aluno); break; } else {
		 * 
		 * System.out.println(aluno); // Descrição do objeto na memória
		 * System.out.println("Media do aluno =" + aluno.getMediaNota()); //
		 * System.out.println("Resultado é :" + (aluno1.getAlunoAprovado2() ? "Aprovado"
		 * // : "Reprovado")); System.out.println("Resultado é :" +
		 * aluno.getAlunoAprovado2());
		 * System.out.println("------------------------------------------"); }
		 */
		/* Equals e hashCodes (Diferenciar e comparar objetos */

		/*
		 * Aluno aluno1 = new Aluno(); aluno1.setNome("Alex");
		 * aluno1.setNumeroCpf("123");
		 * 
		 * Aluno aluno2 = new Aluno(); aluno2.setNome("Alex");
		 * aluno2.setNumeroCpf("1234");
		 * 
		 * 
		 * 
		 * if (aluno1.equals(aluno2)) { System.out.println("Alunos são iguais"); } else
		 * { System.out.println("Alunos não são iguais"); } }
		 */

/*		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista ");
			System.out.println(aluno.getNome());
			System.out.println("Suas matérias são :");

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		} */
	} else {
		JOptionPane.showMessageDialog(null, "Acesso não permitido");
	}
		
	}
}

