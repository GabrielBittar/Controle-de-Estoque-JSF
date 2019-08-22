package proj;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Produto
 *
 */
@Entity
public class Produto implements Serializable  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String descricao;
	private String nome;
	private Integer quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, Integer quantidade, String descricao){
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	
	@OneToOne(fetch = FetchType.LAZY)  
	
	protected void doGet(Produto produto) {
		
		Produto produtoVar;
		
		produtoVar = produto;
		
		EntityManagerFactory emf;
		EntityManager em;
		
		emf = Persistence.createEntityManagerFactory("ProjTest");
		em = emf.createEntityManager();

				em.getTransaction().begin();
				em.merge(produtoVar);
				em.getTransaction().commit();
					
	}
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}   
	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
   
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
