package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    boolean dell(long id);

    boolean update(long id, String firstName, String lastName, String email);

    List<User> listUsers();
    List<User> listUsersCount(int count);
}
