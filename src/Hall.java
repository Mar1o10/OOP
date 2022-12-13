import java.util.Scanner;
public class Hall extends Menu {
    private double length;
    private double width;
    private int seatQuantity;
    private int people;
    Scanner input = new Scanner(System.in);


    public Hall(double length, double width, int seatQuantity, int people,double food,int pagesQuantity) {
        super(pagesQuantity,food);
        this.length = length;
        this.width = width;
        this.seatQuantity = seatQuantity;
        this.people = people;
    }

    // перевизначений конструктор, яким передбачено рівність усіх сторін
    Hall(double e, int seatQuantity,int people,int food,int pagesQuantity) {
        super(food, pagesQuantity);
        length = width = e;
        this.seatQuantity = seatQuantity;
        this.people = people;
    }
    //перевизначений конструктор, який  створює клон  існуючого екземпляра класу
    Hall(Hall hl) {
        this.length = hl.length;
        this.width = hl.width;
        this.seatQuantity = hl.seatQuantity;
        this.people = hl.people;
    }
    // перевизначений конструктор, що не  приймає жодного параметру
    Hall(){
    }
    /////////////////////////////////////////////////////////////////////////////////////////////


    private double hallSquare() {
        double s;
        s = length * width;
        return s;
    }
    public double getHallSquare(){
        return hallSquare();
    }
    // перевизначений метод, що повертає знач. площі залу
    int hallSquare(int length,int width) {
        int s;
        s = length * width;
        return s;
    }
    // метод з статичним ім’ям та динамічною логікою
    double hallSquare(double length,double width) {
        double s;
        s = 2 * (length + width);
        return s;
    }
    private void seatQuantity() {
        System.out.print("Введіть вашу к-сть людей: ");
        int yourPeople = input.nextInt();
        if (yourPeople > seatQuantity - people) {
            System.out.println("Вільних місць немає,вам доведеться зачекати...\n Ласкаво просимо в "+NAME);
            getMenu();
        }else {
            System.out.println("Ласкаво просимо в "+NAME);
            getMenu();
        }
    }
    public void geSeatQuantity(){
        seatQuantity();
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

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(int seatQuantity) {
        this.seatQuantity = seatQuantity * 2;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

}


