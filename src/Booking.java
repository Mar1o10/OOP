class Booking {
    static double bookPrice = 5;
    static double bookTime;
    static {
        bookTime = 24;
    }
    static void booking(){
        System.out.println("Ціна бронювання місця на "+bookTime+"год. дорівнює "+bookPrice+"$");
    }
}
