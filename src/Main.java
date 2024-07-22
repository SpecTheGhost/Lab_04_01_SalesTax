public class Main {
    public static void main(String[] args) {
        double purchasePrice = 20;
        double salesTaxRate = 0.05;
        double salesTax = purchasePrice * salesTaxRate;

        System.out.println("The purchase price is: $" + purchasePrice);
        System.out.println("The sales tax at 5% is: $" + salesTax);
    }
}
