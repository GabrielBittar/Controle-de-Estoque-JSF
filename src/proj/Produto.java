package proj;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Produto
 *
 */
@Entity
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	   //test
	@Id
	@GeneratedValue
	private Integer id;
	private String descricao;
	private Double preco;
	
	/**public Produto(Integer id, String descricao, Double preco){
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}*/
	

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
	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
   
}
