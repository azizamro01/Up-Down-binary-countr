/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzamain;

/**
 *
 * @author yaffa Jaradat
 */
public abstract class DoughIngredients extends Ingredients{

    public DoughIngredients() {
    }

    public DoughIngredients(String name, double weight, double amountCal) {
        super(name, weight, amountCal);
    }

    
    public abstract String getInfo();
    
    
     
    
    
}
