package pizzamain;

public class Flour extends DoughIngredients {

    public Flour() {
        
    }

    public Flour(String name, double weight, double amountCal) {
        super(name, weight, amountCal);
    }

    @Override
    public String getInfo() {
        return "Name:"+ getName()+ "weight"+ getWeight()  +"";
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

//    @Override
//    public void setName(String name) {
//        super.setName(name); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public String getName() {
        return "flour"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
