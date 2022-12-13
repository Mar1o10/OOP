public class Kitchen implements Interface {
    private double length;
    private double width;
    private int cooks;

    public Kitchen(double length, double width, int cooks) {
        this.length = length;
        this.width = width;
        this.cooks = cooks;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////

    public void note() {
        System.out.println("Клієнт чекає -_-");
    }

    private double kitchenPerimeter(){
        double p;
        p = 2*(length+width);
        return p;
    }
    public double getKitchenPerimeter(){
        return kitchenPerimeter();
    }
    double kitchenPerimeter(double length,double width){
        double p;
        p = length * width;
        return p;
    }
    // перевизначений метод, що повертає знач. периметру кухні
    int kitchenPerimeter(int length, int width) {
        int p = 2 * (length + width);
        return p;
    }

    private void cooksQuantity(){
        System.out.println(cooks);
    }
    public void getCooksQuantity(){
        cooksQuantity();
    }



    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getCooks() {
        return cooks;
    }

    public void setCooks(int cooks) {
        this.cooks = cooks;
    }
}
