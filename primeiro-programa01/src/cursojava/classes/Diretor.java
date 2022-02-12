package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

/*Classe filha de pessoa (extends Pessoa)*/

public class Diretor extends Pessoa implements PermitirAcesso{
	
	private String registroEcducacao;
	private int tempoDirecao;
	private String titulacao;
	
	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
	}
	
	// atributo padrão para ñ quebrar as outras classes
	
	public Diretor() {
	}
	
	
	public String getRegistroEcducacao() {
		return registroEcducacao;
	}
	public void setRegistroEcducacao(String registroEcducacao) {
		this.registroEcducacao = registroEcducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEcducacao=" + registroEcducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		
		return 3900.50;
	}
	
	@Override
	public boolean autenticar() {
		return login.equals("alex") && senha.equals("123");
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	
}
