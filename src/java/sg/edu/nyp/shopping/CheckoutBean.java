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
    public double computePrice(String weight, String height) {

        int nHeight = Integer.parseInt(height);
        double dWeight = Double.parseDouble(weight);

        double bmi = (10000 / ((double) nHeight * (double) nHeight)) * dWeight;

        //return Double.toString(bmi);
        return bmi;
    }
}
