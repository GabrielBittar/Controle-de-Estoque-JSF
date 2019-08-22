package proj;

public class ProdutoBean{

	private String nome;
	private String descricao;
	private Integer quantidade;
	private static String tipo;

	
	public Produto produto = new Produto(nome, quantidade, descricao);
	
	    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		produto.setNome(nome);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		produto.setDescricao(descricao);
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		produto.setQuantidade(quantidade);
	}

	public String getTipo() {
	return tipo;
	}

	public void setTipo(String tipo) {
	ProdutoBean.tipo = tipo;
	}
	
	public void persistProduto() {
		
		produto.setDescricao(this.descricao);
		produto.setNome(this.nome);
		produto.setQuantidade(this.quantidade);
		produto.doGet(this.produto);
		
		System.out.println(ProdutoBean.tipo);
	}

}