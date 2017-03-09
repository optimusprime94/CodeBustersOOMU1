/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

/**
 * @author Elvir, Markus, Carlos
 */
public class MultipOperator implements Token {

    @Override
    public double evaluateToken(IsToken st) {

        return st.getToken().evaluateToken(st) * st.getToken().evaluateToken(st);
    }

    @Override
    public String toString() {

        return ("*");
    }
}
