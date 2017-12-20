package com.myapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ACoef = req.getParameter("A");
        String BCoef = req.getParameter("B");
        String CCoef = req.getParameter("C");
        try {
            double a = Double.parseDouble(ACoef);
            double b = Double.parseDouble(BCoef);
            double c = Double.parseDouble(CCoef);
            double D = Math.pow(b, 2) - 4*a*c;
            double x1, x2;
            String answer;
            if (D > 0){
                x1 = (-b + Math.sqrt(D))/(2*a);
                x2 = (-b - Math.sqrt(D))/(2*a);
                answer = "x1 = " + String.valueOf(x1) + "; x2 = " + String.valueOf(x2) + ".";
            }
            else if (D == 0){
                x1 = (-b)/(2*a);
                answer = "x1 = " + String.valueOf(x1) + ".";
            }
            else {
                answer = "уравнение не имеет действительных корней.";
            }
            req.setAttribute("answer", "Ответ: " + answer);
        }
        catch (NumberFormatException exception) {
            req.setAttribute("answer", "- Допустим ввод только чисел. Попробуйте снова.");
        }
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
