package generation.org.FarmaciaPopular.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import generation.org.FarmaciaPopular.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List <Categoria> findAllByTipoContainingIgnoreCase(String tipo);
	
	public List<Categoria> findAllByMarcaContainingIgnoreCase (String marca);
	
	
	
	
}
