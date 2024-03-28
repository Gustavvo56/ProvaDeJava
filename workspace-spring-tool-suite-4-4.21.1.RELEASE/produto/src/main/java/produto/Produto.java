package produto;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo_barras;
	public String nome_produto;
	public String marca_produto;
	public Integer qtd_produto;
	public String data;
	
	
	public Integer getCodigo_barras() {
		return codigo_barras;
	}
	public void setCodigo_barras(Integer codigo_barras) {
		this.codigo_barras = codigo_barras;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public String getMarca_produto() {
		return marca_produto;
	}
	public void setMarca_produto(String marca_produto) {
		this.marca_produto = marca_produto;
	}
	public Integer getQtd_produto() {
		return qtd_produto;
	}
	public void setQtd_produto(Integer qtd_produto) {
		this.qtd_produto = qtd_produto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Produto(Integer codigo_barras, String nome_produto, String marca_produto, Integer qtd_produto, String data) {
		super();
		this.codigo_barras = codigo_barras;
		this.nome_produto = nome_produto;
		this.marca_produto = marca_produto;
		this.qtd_produto = qtd_produto;
		this.data = data;
	}
	
	public Produto() {
		
	}
	
	@Override
	public String toString() {
		return "Produto [codigo_barras=" + codigo_barras + ", nome_produto=" + nome_produto + ", marca_produto="
				+ marca_produto + ", qtd_produto=" + qtd_produto + ", data=" + data + "]";
	}
	
	
	

}
