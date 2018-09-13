public class Cars {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemność silnika
        Car car2 = new Car("Opel", "Vectra", 2004, 1.8);

//        System.out.println("Samochód 1:");
//        System.out.println("Marka: " + car1.brand + ", model: " + car1.model +
//                ", rocznik: " + car1.year + ", pojemność: " + car1.capacity);
//        System.out.println("Samochód 2:");
//        System.out.println("Marka: " + car2.brand + ", model: " + car2.model +
//                ", rocznik: " + car2.year + ", pojemność: " + car2.capacity);

        System.out.printf("%s%n", "Samochód 1:");
        System.out.printf("%s%s %s%s%s%d%s%.1f","Marka: ", car1.brand, "model: ", car1.model, ", rocznik: ", car1.year,", pojemność: ", car1.capacity );
        System.out.printf("%s%s %s%s%s%d%s%.1f","Marka: ", car2.brand, "model: ", car2.model, ", rocznik: ", car2.year,", pojemność: ", car2.capacity );


        /*
        Klasa to … szablon Car
        Obiekt to …reprezentancja/instancja klasy... i jest tworzony na podstawie …klasy...
        Zmienna to …element przechowujacy dane
        Każda zmienna musi mieć określony …typ..., np. int, albo String.
        W klasie mogą się znajdować …zmienne, …metody i …konstruktory
        … są wywoływane przez operator … i służą do tworzenia nowych obiektów.
        Jeśli w klasie zdefiniowano chociaż jeden …konstruktor to kompilator nie wygeneruje dla nas …konstruktora domyślnego.
        Zakładając, że istnieje klasa Car, to przy zapisie:

        Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);

        car1 nazywamy …zmienna ,

        a przy zapisie:

        Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);  Car car2 = car1;

        car1 I car2 to dwie …zmienne wskazujące na ten sam obiekt…
        */


    }
}
