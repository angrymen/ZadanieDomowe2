public class Shop {

    public static void main(String[] args) {

        Trousers trousersOne = new Trousers(32, "Jeans", "Blue", "Male", "Regular", "Big Star", 99.99,"PLN", true, 0.5);
        Trousers trousersSecond = new Trousers(28,"Cotton","Orange","Famale", "Slim","Totti romani",100.99, "EUR", false,0);

        System.out.println(trousersOne);

//        trousersOne.forGender = "Male";
//
//        trousersOne.fabric = "Jeans";
//        trousersOne.producer = "Big Star";
//        trousersOne.size = 32;
//        trousersOne.color = "Blue";
//        trousersOne.style = "Regular";
//
//        trousersOne.discount = 0.5;
//        trousersOne.promotion = trousersOne.discount > 0;
//        trousersOne.price = 99.99;
//        trousersOne.currency = "PLN";
//
        double priceSum = trousersOne.price - (trousersOne.price * trousersOne.discount);



        System.out.println("Spodnie dla: " + trousersOne.forGender);
        System.out.println("Materiał: " + trousersOne.fabric);
        System.out.println("Producent: " + trousersOne.producer);
        System.out.println("Rozmiar: " + trousersOne.size);
        System.out.println("Kolor: " + trousersOne.color);
        System.out.println("Styl: " + trousersOne.style);
        System.out.println("Promocja: " + trousersOne.promotion);
        System.out.printf("%.2f%n", priceSum);
        System.out.println("Zniżka: " + (trousersOne.discount * 100) + "%");



//        trousersSecond.forGender = "Famale";
//
//        trousersSecond.fabric = "Cotton";
//        trousersSecond.producer = "Totti romani";
//        trousersSecond.size = 28;
//        trousersSecond.color = "Orange";
//        trousersSecond.style = "Slim";
//
//        trousersSecond.discount = 0;
//        trousersSecond.promotion = trousersOne.discount > 0;
//        trousersSecond.price = 100.99;
//        trousersSecond.currency = "EUR";
//
        double priceSumSecond = trousersSecond.price - (trousersSecond.price * trousersSecond.discount);

        System.out.println("Spodnie dla: " + trousersSecond.forGender);
        System.out.println("Materiał: " + trousersSecond.fabric);
        System.out.println("Producent: " + trousersSecond.producer);
        System.out.println("Rozmiar: " + trousersSecond.size);
        System.out.println("Kolor: " + trousersSecond.color);
        System.out.println("Styl: " + trousersSecond.style);
        System.out.println("Promocja: " + trousersSecond.promotion);
        System.out.printf("%.2f%n", priceSumSecond);
        System.out.println("Zniżka: " + (trousersSecond.discount * 100) + "%");


    }

}
