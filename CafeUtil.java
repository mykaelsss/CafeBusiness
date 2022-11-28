import java.util.ArrayList;
import java.text.DecimalFormat;
public class CafeUtil{

    public int getStreakGoal(int numWeeks){
        int sum = 1;
        for( int i = 2; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }


    public double getOrderTotal(double[] prices){
        int sum = 0;
        for( int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.printf("%d %s %n", menuItems.indexOf(menuItems.get(i)), menuItems.get(i));
        }
    }

        static public double customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        double numOutput = Double.parseDouble(output);
        return numOutput;
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        double sum = customFormat("#.##", price);
        for(int i = 1; i <= maxQuantity; i++){
            System.out.printf("%d - $%.2f\n", i, sum );
            price -= .50;
            sum += price;
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.print("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s There are %d people in front on you\n", userName, customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if(menuItems.size() != prices.size()){
            return false;
        }
        for(int i = 0; i < menuItems.size(); i++){
            System.out.printf("%d %s -- $%.2f \n", menuItems.indexOf(menuItems.get(i)), menuItems.get(i), prices.get(i));
        }
        return true;
    }
}
