package cursojava.classesauxiliares;
import cursojava.interfaces.PermitirAcesso;

/*Receber somente quem tem o contrato da interface de permitir o acesso e chamar o autenticar*/

public class FuncaoAutentincacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutentincacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
