package generation.org.FarmaciaSpring.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

		@Entity
	@Table (name = "tb_categoria")
	public class Categoria {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id; 
		
		@NotBlank
		@Size(min = 2, max = 30 )
		private String tipo; 
		
		@NotBlank
		@Size(min = 2, max = 250 )
		private String descricao;
		
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

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
}
