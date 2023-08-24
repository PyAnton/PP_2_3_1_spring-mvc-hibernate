package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void dell(long id);
    void update(long id, String firstName, String lastName, String email);
    User findUserById(long id);
    List<User> listUsers();
}
