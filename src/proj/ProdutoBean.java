package proj;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;



public class ProdutoBean {

	private String teste = "foo";
	private Integer beta = 96;
	private Boolean value = false;
	
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

		
	public String getTeste() {
		return "bar";
	}

	public Integer getBeta() {
		return 4472;
	}
}