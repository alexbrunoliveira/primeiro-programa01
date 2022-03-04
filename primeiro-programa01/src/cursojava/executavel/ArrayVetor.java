package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {
		
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {7.1,5.7,9.6,7.8};
		
		/*Cria��o do aluno*/
		Aluno aluno = new Aluno ();
		aluno.setNome("Alex Fernando Egidio");
		aluno.setNomeEscola("JDEV Treinamento");
		
		
		/*Cria��o da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("L�gida de Programa��o");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno aluno2 = new Aluno ();
		aluno2.setNome("Alex Bruno");
		aluno2.setNomeEscola("JDEV Treinamento");
		
		
		/*Cria��o da disciplina*/
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de Java m�dulo II");
		disciplina3.setNota(notas);
		
		aluno2.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("L�gida de Programa��o II");
		disciplina4.setNota(notasLogica);
		
		aluno2.getDisciplinas().add(disciplina4);
		
		//----------------------------------
		
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;

		
		for (int pos = 0; pos <arrayAlunos.length; pos ++) {
			System.out.println("Nome do aluno � :" + arrayAlunos[pos].getNome());;
			
			
			for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println();
				System.out.println("Nome d disciplina � : "+ d.getDisciplina());
				System.out.println();
				
				for (int posnota =0; posnota < d.getNota().length; posnota ++) {
					System.out.println("A nota n�mero : " +(posnota + 1)+ "  � igual " + d.getNota()[posnota] );
				}
				
			}
		}
	}
}