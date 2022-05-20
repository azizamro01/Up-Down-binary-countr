package pizzamain;

import java.util.ArrayList;

abstract class PizzaPan {

    private String panType;
    private Size panSiza;
    private Dough dough;
    private double weight;
    private double cal;
    private double amount;
    ArrayList<PizzaIngredients> arr = new ArrayList<>(); // to avoid user enter invalid ingr. 

//    
//    public void bake (){
//        
//    }
//    public double calories(){
//       
//    } 
//    
//    public void cut(){
//        
//    }
//    public void valid(){
//     to check if the pan size is suitable for the dough    
//    }
    public PizzaPan() {
    }

    public PizzaPan(String panType, Size panSiza, Dough dough) {
        this.panType = panType;
        this.panSiza = panSiza;
        this.dough = dough;
    }

    public String getPanType() {
        return panType;
    }

    public void setPanType(String panType) {
        this.panType = panType;
    }

    public Size getPanSiza() {
        return panSiza;
    }

    public void setPanSiza(Size panSiza) {
        this.panSiza = panSiza;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getInfo() {
        return "PizzaPan{" + "panType=" + panType + ", panSiza=" + panSiza + ", dough=" + dough + '}';
    }

    public void add(PizzaIngredients pi) {
        arr.add(pi);
        cal += pi.getAmountCal();
        weight += pi.getWeight();
    }

}
