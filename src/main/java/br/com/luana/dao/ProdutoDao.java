package br.com.luana.dao;

import br.com.luana.domain.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProdutoDao implements IProdutoDao{

	public Produto cadastrar(Produto produto) {
        EntityManagerFactory entityManagerFactory = 
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();
         
        entityManager.close();
        entityManagerFactory.close();
        
        return produto;
}
}
