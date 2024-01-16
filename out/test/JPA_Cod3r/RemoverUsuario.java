package teste.basico;

import org.basico.Usuario;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class RemoverUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class,6L);
        if(usuario!= null){
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        }

        em.close();
        emf.close();


    }
}
