package generation.org.FarmaciaPopular.model;

	import java.util.List;
	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;
	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



	@Entity
	@Table(name = "tb_categoria")
	public class Categoria {

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private long id; 
		
		@NotBlank
		@Size(min = 2, max = 100)
		private String tipo; 
		
		@NotBlank
		@Size (min = 2, max = 100 )
		private String marca;
		
		@OneToMany (mappedBy = "categoria", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public List<Produto> getProduto() {
			return produto;
		}

		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
	 	
	}

