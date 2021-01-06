/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.edu.nyp.shopping;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 181627N
 */
@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {

    //Inject your EJB here
    @EJB
    CheckoutBean checkoutBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String quantity = request.getParameter("quantity");
        String price = request.getParameter("price");
        
        double totalprice;
        totalprice = checkoutBean.computePrice(quantity, price);
        
        request.getSession().setAttribute("totalprice", totalprice);
    }

}
