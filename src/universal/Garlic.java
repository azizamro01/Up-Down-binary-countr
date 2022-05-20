package pizzamain;
public class Garlic extends PizzaIngredients {

    public Garlic() {
    }

    public Garlic(String name, double weight, double amountCal) {
        super(name, weight, amountCal);
    }

   
    public String getInfo() {
        return "garlic"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAmountCal(double amountCal) {
        super.setAmountCal(amountCal); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAmountCal() {
        return super.getAmountCal(); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public void setWeight(double weight) {
//        super.setWeight(weight); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public double getWeight() {
        return super.getWeight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
