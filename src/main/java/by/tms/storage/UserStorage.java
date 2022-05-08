package by.tms.storage;

import by.tms.entity.User;
import by.tms.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    private final List<User> users = new ArrayList<>();
    private static final Logger logger = LogManager.getLogger(UserStorage.class);

    public void save(User user) {
        logger.debug("method is executed save in UserStorage");
        users.add(user);
    }

    public User findByLogin(String login) {
        logger.debug("method is executed findByLogin in UserStorage");
        for (User user : users) {
            if (user == null || user.getLogin() == null) {
                System.out.println("Check user and password");
            } else if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    public boolean isExistsByLogin(String login) {
        logger.debug("method is executed isExistsByLogin in UserStorage");
        for (User user : users) {
            if (user == null || user.getLogin() == null) {
                System.out.println("Check user and password");
            } else if (user.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }
}
