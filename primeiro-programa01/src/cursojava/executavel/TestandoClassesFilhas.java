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
		diretor.setNome("Egídio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("23456789456");
		secretario.setIdade(18);
		secretario.setNome("João");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoamaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoamaiorIdade());
		System.out.println(secretario.pessoamaiorIdade());
		
		System.out.println("Salário é = " + aluno.salario());
		System.out.println("SSalário é = " + diretor.salario());
		System.out.println("Salário é = " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
		
		public static void teste (Pessoa pessoa) {
			System.out.println("Essa pessoa é demais = " 
			+ pessoa.getNome() +  "  e o salário é " + pessoa.salario());
		}
	}


