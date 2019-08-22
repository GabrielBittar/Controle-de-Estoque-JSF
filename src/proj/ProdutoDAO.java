package proj;

import javax.persistence.*;

public class ProdutoDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjTest");
	private EntityManager em = factory.createEntityManager();
	
	public String insereProduto(Produto produto) {
		try {
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
			return "/index.xhtml";
		}catch(Exception e) {
			return null;
		}
	}
}
