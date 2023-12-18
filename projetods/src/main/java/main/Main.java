package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Endereco;
import model.Usuario;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		
		Usuario usuario = em.find(Usuario.class, 1);
		System.out.println(usuario);
		
		em.remove(usuario);
		
		
		
		
		
		
		
		

		/*
		 * try { em.getTransaction().begin();
		 * 
		 * Endereco endereco = new Endereco(null, "22123123", "rua 1", "22", "Brotas",
		 * "Bahia");
		 * 
		 * Usuario usuario = new Usuario(); usuario.setNome("Diogo");
		 * usuario.setEmail("diogo@.com"); usuario.setSenha("1235");
		 * usuario.setEndereco(endereco);
		 * 
		 * em.persist(usuario);
		 * 
		 * em.getTransaction().commit(); System.out.println("Funcionou");
		 * 
		 * } catch (Exception e) { if (em.getTransaction().isActive()) {
		 * em.getTransaction().rollback(); } e.printStackTrace();
		 * System.out.println("não funcionou");
		 * 
		 * } finally { em.close(); } emf.close(); }
		 */

	}
}
