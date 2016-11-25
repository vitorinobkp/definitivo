package model;

public class VendaRules {
	public String validarCadastro(Produto produto) {
		if (produto.codigo <= 0) {
			return "C�digo n�o informado.";
		}
		if (produto.nome == null || produto.nome.equals("")) {
			return "Produto n�o pode ficar vazio.";
		}
		return null;
	}
}
