package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {
		
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {7.1,5.7,9.6,7.8};
		
		/*Criação do aluno*/
		Aluno aluno = new Aluno ();
		aluno.setNome("Alex Fernando Egidio");
		aluno.setNomeEscola("JDEV Treinamento");
		
		
		/*Criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógida de Programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		
		System.out.println("Nome do aluno = " + aluno.getNome() + "inscrito no curso :" + aluno.getNomeEscola());
		
		System.out.println("--------------Disciplina do aluno----------------");
				for (Disciplina d : aluno.getDisciplinas()) {
			
			
			System.out.println();
			System.out.println("Disciplina : " + d.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			
			
			/*Encontrando menor valor em um array*/
			double notaMax = 0.0;
			for (int pos = 0 ; pos < d.getNota().length; pos ++) {
				System.out.println("Nota " + (pos + 1) + "  é igual = " + d.getNota()[pos]);
				
				if (pos ==0) {
					notaMax = d.getNota()[pos];
				}else {
					if (d.getNota()[pos] < notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			
			System.out.println("A menor nota da Disciplina = " + d.getDisciplina() + "e de valor " + notaMax);
			
		}
				
	}
}