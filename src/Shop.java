public class Shop {

    public static void main(String[] args) {

        Trousers trousersOne = new Trousers();

        trousersOne.forGender = "Male";

        trousersOne.fabric = "Jeans";
        trousersOne.producer = "Big Star";
        trousersOne.size = 32;
        trousersOne.color = "Blue";
        trousersOne.style = "Regular";

        trousersOne.discount = 0.5;
        trousersOne.promotion = trousersOne.discount > 0;
        trousersOne.price = 99.99;
        trousersOne.currency = "PLN";

        double priceSum = (trousersOne.price * trousersOne.discount);



        System.out.println("Spodnie dla: " + trousersOne.forGender);
        System.out.println("Materiał: " + trousersOne.fabric);
        System.out.println("Producent: " + trousersOne.producer);
        System.out.println("Rozmiar: " + trousersOne.size);
        System.out.println("Kolor: " + trousersOne.color);
        System.out.println("Styl: " + trousersOne.style);
        System.out.println("Promocja: " + trousersOne.promotion);
        System.out.printf("%.2f%n", priceSum);
        System.out.println("Zniżka: " + (trousersOne.discount * 100) + "%");

    }

}
