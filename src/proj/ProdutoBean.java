package proj;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ProdutoBean{

	private ProdutoDAO produtoDAO = new ProdutoDAO();
	private Produto produto = new Produto();
	//private boolean responseComplete;

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public String enviar() {
		produtoDAO.insereProduto(produto);
		if(produto == null) {
			produto = new Produto();
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Produto nao encontrado!",
							"Erro na insercao!"));
			return null;
		}else {
			//responseComplete = FacesContext.getResponseComplete();
			return "/index.xhtml";
		}
	}

	
}