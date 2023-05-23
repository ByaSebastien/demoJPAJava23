package be.bstorm;

import be.bstorm.entities.User;
import jakarta.persistence.*;

import java.util.List;

public class CustomRequestDemo {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA");
    private static final EntityManager em = emf.createEntityManager();

    public static void getByFirstname(String name){

        TypedQuery<User> query = em.createQuery("select u.firstname,u.lastname from User u where u.firstname = :name", User.class);
        query.setParameter("name",name);
        User u = query.getSingleResult();
    }
}
