package pizzamain;
public abstract class Ingredients {
    private String name ; 
    private double weight ; 
    private double amountCal  ;
    private double amount ; 

    public Ingredients() {
    }

    public Ingredients(String name, double weight, double amountCal) {
        this.name = name;
        this.weight = weight;
        this.amountCal = 0;
        this.amount= 0 ; 
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    } /// protected ** 

    public double getWeight() {
        return weight;
    }
    

    protected  void setWeight(double weight) {
        this.weight = weight;
    }  

    public double getAmountCal() {
        return amountCal;
    }

    public void setAmountCal(double amountCal) {
        this.amountCal = amountCal;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
        
    }


    public abstract  String getInfo() ;
    

    
 
}


