package ru.bootwebapp.PP_3_1_2_BOOTCRUD.dao;

import org.springframework.stereotype.Repository;
import ru.bootwebapp.PP_3_1_2_BOOTCRUD.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        if (user.getId() < 0) {
            entityManager.persist(user);
        } else {
            entityManager.merge(user);
        }
    }

    @Override
    public void deleteUser(int id) {
        User user = getUserById(id);
        entityManager.remove(user);
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select user from User user", User.class).getResultList();
    }

    @Override
    public User getUserById(int id) {
        User user = new User();
        try {
            user = entityManager.find(User.class, id);
        } catch (NullPointerException e) {
            System.out.println("THERE IS NO SUCH USER WITH THIS ID = " + id);
        }
        return user;
    }
}
