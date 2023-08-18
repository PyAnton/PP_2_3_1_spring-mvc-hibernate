package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Transactional
    @Override
    public void dell(long id) {
        userDao.dell(id);
    }

    @Transactional
    @Override
    public void update(long id, String firstName, String lastName, String email) {
        userDao.update(id, firstName, lastName, email);
    }

    @Transactional
    @Override
    public List<User> listUsersCount(int count) {
        List<User> listUsers = listUsers();
        if (count >= 15) {
            return listUsers;
        } else {
            return listUsers.subList(0, Math.min(count, listUsers.size()));
        }
    }
}
