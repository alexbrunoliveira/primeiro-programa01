package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Jdev-Treinamento");
		aluno.setIdade(22);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("455223565785");
		diretor.setNome("Eg�dio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		secretario.setNumeroCpf("23456789456");
		secretario.setIdade(18);
		secretario.setNome("Jo�o");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoamaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoamaiorIdade());
		System.out.println(secretario.pessoamaiorIdade());
		
		System.out.println("Sal�rio � = " + aluno.salario());
		System.out.println("SSal�rio � = " + diretor.salario());
		System.out.println("Sal�rio � = " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
		
		public static void teste (Pessoa pessoa) {
			System.out.println("Essa pessoa � demais = " 
			+ pessoa.getNome() +  "  e o sal�rio � " + pessoa.salario());
		}
	}


