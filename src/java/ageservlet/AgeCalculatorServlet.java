package ageservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Capture the parameters from the POST requesst (the form)
        String age = request.getParameter("ageC");
        //Validation
        if (age == null || age.equals("")) {
            request.setAttribute("message", "Please put your age");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
          

        } else if (age.matches("[A-Za-z]{1,10}")) {
            request.setAttribute("message", "Age MUST be a number");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
          

        } else {
            int numberAge = Integer.parseInt(age);
            int finalAge = numberAge + 1;
            request.setAttribute("message", "Your age next birthday will be " + finalAge);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }


    }

}
