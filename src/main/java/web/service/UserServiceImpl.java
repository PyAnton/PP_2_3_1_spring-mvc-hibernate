package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

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
    public boolean dell(long id) {

        if (userDao.findUserById(id)!=null) {
            userDao.dell(id);
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean update(long id, String firstName, String lastName, String email) {
        if (userDao.findUserById(id)!=null) {
            userDao.update(id, firstName, lastName, email);
            return true;
        }
        return false;
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
