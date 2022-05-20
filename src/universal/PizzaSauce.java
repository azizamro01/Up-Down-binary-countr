package pizzamain;
public class PizzaSauce extends Ingredients {

    public PizzaSauce() {
    }
    
    public PizzaSauce(String name, double weight , double amountCal) { 
        super(name,weight, amountCal);
    }

    @Override
    public void setAmountCal(double amountCal) {
        super.setAmountCal(15); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAmountCal() {
        return super.getAmountCal(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(5); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getWeight() {
        return super.getWeight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName("Sauce"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInfo() {
        return "suace"; //To change body of generated methods, choose Tools | Templates.
    }

   
}
