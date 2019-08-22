package proj;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;



public class ProdutoBean {

	private String nome;
	private String descricao;
	private Integer quantidade;
	
	private Boolean value = false;
	
	Produto produto = new Produto(nome, quantidade, descricao);
	
	 public Boolean getValue() {
	        return value;
	    }
	 
	    public void setValue(Boolean value) {
	        this.value = value;
	    }
	    
	    public void addMessage() {
	        String summary = value ? "Checked" : "Unchecked";
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
	    }

}