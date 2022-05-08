package by.tms.web.servlet;

import by.tms.entity.User;
import by.tms.service.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/calc")
public class CalculatorServlet extends HttpServlet {

    private final CalculatorService calcService = new CalculatorService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String operand = req.getParameter("operand");

        User user = (User) req.getSession().getAttribute("user");
        Double result = calcService.calc(num1, num2, operand, user);
        req.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/calc.jsp").forward(req, resp);
    }
}
