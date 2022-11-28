import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil();
    /*
      You will need add 1 line to this file to create an instance
      of the CafeUtil class.
      Hint: it will need to correspond with the variable name used below..
    */

        /* ============ App Test Cases ============= */
    // double num = 5.55;
    // String pat = "##.##";
    // System.out.println(appTest.customFormat(pat, num));

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(10));

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 5.0, 4.0, 4.5};
        System.out.printf("Order total: $%.2f \n\n",appTest.getOrderTotal(lineItems));

        System.out.println("----- Price Chart Test-----");
        String product = "coffee";
        double price = 4.00;
        int maxQuantity = 4;
        appTest.printPriceChart(product,price,maxQuantity);

        System.out.println("----- Display Menu Test-----");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

        System.out.println("-----Menu Items And Prices Test------");
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(1.50);
        prices.add(3.50);
        prices.add(4.50);
        prices.add(3.50);
        appTest.displayMenu(menuItems, prices);
    }
}
