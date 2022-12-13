import java.util.Scanner;

class Menu extends Abstract {
    final String NAME = "Oooppss";
    private int pagesQuantity;
    private double food;

    Scanner input = new Scanner(System.in);
    Menu(int pagesQuantity, double food) {
        this.pagesQuantity = pagesQuantity;
        this.food = food;
    }
    Menu(Menu mu){
        this.pagesQuantity = mu.pagesQuantity;
        this.food = mu.food;
    }
    Menu(){
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    void time(){
        System.out.println("Максимальний час приготування 5хв ");
    }
    private void menu(){
        System.out.println("1. Burger ($2.00) \n2. Salad ($1.50)\n3. Coffee ($1.00)\n  Water ($0.00)");
    }
    public void getMenu(){
        menu();
    }
    double yourMoney;
    private double money(){
        System.out.print("Введіть к-сть грошей які ви готові витратити: $");
        yourMoney = input.nextDouble();
        return yourMoney;
    }
    public double getMoney(){
        return money();
    }
    int money(int yourMoney) {
        System.out.print("K-сть грошей які ви готові витратити: $");
        return yourMoney;
    }

    private void yourChoice(){
        System.out.println("Що ви бажаєте замовити?");
        int foodItem = input.nextInt();
        if (foodItem == 1){
            System.out.println("Ви замовили Burger");
            if (yourMoney < 2) {
                System.out.println("K-сть грошей які ви готові витратити менша ніж ціна Burger");
            }
        }
        if (foodItem == 2){
            System.out.println("Ви замовили Salad");
            if (yourMoney < 1.5) {
                System.out.println("K-сть грошей які ви готові витратити менша ніж ціна Salad");
            }

        }
        if (foodItem == 3){
            System.out.println("Ви замовили Coffee");
            if (yourMoney < 1) {
                System.out.println("K-сть грошей які ви готові витратити менша ніж ціна Coffee");
            }
        }
        if (foodItem > 3 || foodItem < 1){
            System.out.println("Ви замовили Water");
        }
    }
    public void getYourChoice(){
        yourChoice();
    }






    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getYourMoney() {
        return yourMoney;
    }

    public void setYourMoney(double yourMoney) {
        this.yourMoney = yourMoney;
    }

}
