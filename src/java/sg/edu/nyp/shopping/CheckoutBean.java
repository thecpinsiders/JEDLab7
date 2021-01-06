/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sg.edu.nyp.shopping;
import javax.ejb.Stateless;

/**
 *
 * @author 181627N
 */
@Stateless
public class CheckoutBean {
    public double computePrice(String quantity, String price) {

        int q = Integer.parseInt(quantity);
        double p = Double.parseDouble(price);

        double total = q * p;
        
        return total;
    }
}
