/**
 * 
 */
package br.com.luana;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.luana.dao.ProdutoDao;
import br.com.luana.dao.IProdutoDao;
import br.com.luana.domain.Produto;

/**
 * @author luana
 *
 */
public class ProdutoTeste {

	private IProdutoDao produtoDao;
	
	public ProdutoTeste() {
		produtoDao = new ProdutoDao();
	}
	
	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setNome("Abobora");
		produto.setPreco(1.50d);
		produto = produtoDao.cadastrar(produto);
	
		assertNotNull(produto);
		assertNotNull(produto.getId());
		
	}
}

