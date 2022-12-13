public class Main {
    public static void main(String[] args) {
      Menu menu = new Menu(3,5);
      Hall hall = new Hall(10,6,20,17, menu.getFood(),menu.getPagesQuantity());
      Kitchen kitchen = new Kitchen(8,6,4);
      Booking.booking();

      System.out.println("Периметр залу: "+hall.getHallSquare());
      System.out.println("Периметр кухні: "+kitchen.getKitchenPerimeter());
      System.out.print("К-сть кухарів: ");

      kitchen.getCooksQuantity();
      hall.geSeatQuantity();
      System.out.println("$"+menu.getMoney());
      menu.getYourChoice();

      Hall hall1 = new Hall(5.0,5,2, (int) menu.getFood(),menu.getPagesQuantity());
      System.out.println("Периметр залу: "+hall1.getHallSquare());
      System.out.println("Периметр залу: "+hall1.hallSquare(5.5,4.5));
      System.out.println("Площа кухні: "+kitchen.kitchenPerimeter(2,3));

      Hall hall2 = new Hall();
      System.out.println("Периметр залу: "+hall2.hallSquare(5,5));

      Hall hall3 = new Hall(hall);
      System.out.println("Периметр залу: "+hall3.hallSquare(5,5));
      Menu menu3 = new Menu(3,5);
      System.out.println("Периметр кухні: "+kitchen.kitchenPerimeter(2.5,3.5));
    }
}