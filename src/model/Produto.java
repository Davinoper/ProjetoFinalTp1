package model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Produto {
	
		@NotEmpty(message="Campo nome n�o pode estar vazio!")
		private String produto;
		@NotEmpty(message="Campo descri��o n�o pode estar vazio!")
	    private String descricao;
		@NotEmpty(message="Campo marca n�o pode estar vazio!")
	    private String marca;
	    private Origem origem;
	    private int id;
	 
	    
	    public Produto() {
	    	
	    }
	    
		
		
		public Produto(String produto, String descricao, String marca, Origem origem, int id) {
			super();
			this.produto = produto;
			this.descricao = descricao;
			this.marca = marca;
			this.origem = origem;
			this.id = id;
			
		}



		public String getProduto() {
			return produto;
		}
		public void setProduto(String produto) {
			this.produto = produto;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public Origem getOrigem() {
			return origem;
		}
		public void setOrigem(Origem origem) {
			this.origem = origem;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	
	    
	    
	    
	    
	
	
	
}
