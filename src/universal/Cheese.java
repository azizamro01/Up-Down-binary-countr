package pizzamain;
public class Cheese extends Ingredients{
    private final  double weightPerUnit = 20;
    private final  double calPerUnit = 30;
    //note  
    public Cheese() {
       
    }

    public Cheese(String name, double weight, double amountCal) {
        super(name, weight, amountCal);
    }

    @Override
    public void setAmount(double amount) {
        super.setAmount(amount);
        super.setWeight(amount*weightPerUnit); 
        super.setAmountCal(amount*calPerUnit);
        
//To change body of generated methods, choose Tools | Templates.
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
    public String getName() {
        return "Cheese"; //To change body of generated methods, choose Tools | Templates.
    }

  
    public String getInfo() {
        return "Cheese{" + "weightPerUnit=" + weightPerUnit + ", calPerUnit=" + calPerUnit + '}';
    }
    
    
}
