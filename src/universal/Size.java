package pizzamain;

public class Size {
    private int small ; 
    private int medium; 
    private int larg ; 

    public Size() {
    }

    public Size(int small, int medium, int larg) {
        this.small = small;
        this.medium = medium;
        this.larg = larg;
    }

    public int getSmall() {
        return small;
    }

    public void setSmall(int small) {
        this.small = 10;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = 15;
    }

    public int getLarg() {
        return larg;
    }

    public void setLarg(int larg) {
        this.larg = 25;
    }

    public String getInfo() {
        return "Size{" + "small=" + small + ", medium=" + medium + ", larg=" + larg + '}';
    }
    
    
}
