package generation.org.FarmaciaPopular.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import generation.org.FarmaciaPopular.model.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome); 
	
	public List<Produto> findAllByPreco (double preco);
	
}
