package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;

import model.Usuario;

public class UsuarioService {

	private Usuario usuario;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-ds");
	
	public UsuarioService() {
		super();
		
	}

	private boolean validarEmail(String email) {
		String regex = ".*@.*\\.com$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	}

	public boolean cadastrarUsuario(Usuario novoUsuario) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		if (validarEmail(novoUsuario.getEmail())) {


			try {

				em.getTransaction().begin();
				em.persist(novoUsuario);
				transaction.commit();
				;
				return true;

			} catch (HibernateException e) {
				if (transaction.isActive()) {
					transaction.rollback();
				}
				e.printStackTrace();
			} finally {
				if (em != null && em.isOpen()) {
					em.close();
					emf.close();
				}
			}
		}

		return false;

	}

	public boolean autenticarLogin(String email, String senha) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			
			 TypedQuery<Usuario> query = em.createQuery(
			            "FROM Usuario WHERE email = :email AND senha = :senha",
			            Usuario.class
			        );
			 query.setParameter("email", email);
			 query.setParameter("senha", senha);
			 String nomeUsuario = usuario.getNome();

        Usuario usuario = query.getSingleResult();
        return usuario != null;
        
		}catch (NoResultException e) {
			e.printStackTrace();
		}
		finally {
			if(transaction.isActive()) {
				transaction.rollback();
			}
			em.close();
		}
		return false;
	}
}

	