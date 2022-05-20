package pizzamain;

import java.util.ArrayList;

public  class Dough {
    ArrayList <DoughIngredients> arr = new ArrayList<>(); 
    private Size doSize ; 
     private double weight ; 
    private double cal  ;
    private double amount ;
    
    // public  static pouredIntoPans(){   
   // }

    public Dough() {
    }

    public Dough(Size doSize) {
        this.doSize = doSize;
    }

    public Size getDoSize() {
        return doSize;
    }

    public void setDoSize(Size doSize) {
        this.doSize = doSize;
    }

   
    public String getInfo() {
        return "Dough{" + "doSize=" + doSize + ", ingr=" +  '}';
    }
    
    public void add(DoughIngredients di ){
        arr.add(di); 
        cal += di.getAmountCal();
        weight += di.getWeight(); 
    }

    public double getWeight() {
        return weight;
    }

    public double getCal() {
        return cal;
    }
    
            
}


