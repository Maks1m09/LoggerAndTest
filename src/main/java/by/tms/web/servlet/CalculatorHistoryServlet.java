package by.tms.web.servlet;

import by.tms.entity.Operation;
import by.tms.service.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/history")
public class CalculatorHistoryServlet extends HttpServlet {
    private final CalculatorService calcService = new CalculatorService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Operation> all = calcService.findAll();
        req.setAttribute("all", all);
        getServletContext().getRequestDispatcher("/history.jsp").forward(req, resp);
    }

}