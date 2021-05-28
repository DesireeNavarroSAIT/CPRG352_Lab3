/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticCalServlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Capture the parameters from the POST requesst (the form)
        String firstNumber = request.getParameter("first");
        String secondNumber = request.getParameter("second");
        //Validation
        if (firstNumber == null || firstNumber.equals("")|| secondNumber == null|| secondNumber.equals("")) {
            request.setAttribute("message", "Please put a number");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
          

        } else if (firstNumber.matches("[A-Za-z]")|| secondNumber.matches("[A-Za-z]")) {
            request.setAttribute("message", "The inputs MUST be a number");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
          

        } else {
         
        }


    }

}

