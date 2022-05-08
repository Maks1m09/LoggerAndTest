package by.tms.web.servlet;

import by.tms.entity.User;
import by.tms.service.UserService;
import by.tms.storage.UserStorage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private final UserService userService = new UserService();
    private static final Logger logger = LogManager.getLogger(UserStorage.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Start");
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User user = new User(name, password, login);
        if (name == null || password == null || login == null) {
            System.out.println("User not created");
        }
        boolean isAdded = userService.add(user);
        if (isAdded) {
            resp.getWriter().println("Ok");
        } else {
            resp.getWriter().println("Error");
        }
        getServletContext().getRequestDispatcher("/authorization.jsp").forward(req, resp);
    }
}
