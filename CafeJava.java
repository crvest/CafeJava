public class CafeJava {
    public static void main(String[] args) {
        // app variables
        // lines of text that will apear in the app
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ". Your total is $";

        // menu variables
        double mochaPrice = 3.5;
        double dripCoffee = 2.25;
        double latte = 5.30;
        double cappuccino = 5.70;

        // customer name variables (add yours below)
        String customer1 = "Cinduri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // order complettions (add yours bneow)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // app interactio simulation (add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // displays 'welcome to cafe java, cindhurri'
        // ** your customer interaction print statements will go here ** //

        // 1
        System.out.println(generalGreeting + customer1 + pendingMessage);

        // 2
        if (isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + readyMessage + displayTotalMessage + cappuccino);
        } else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }

        // 3
        if (isReadyOrder2) {
            System.out.println(generalGreeting + customer2 + readyMessage + displayTotalMessage + 2*cappuccino);
        } else {
            System.out.println(generalGreeting + customer2 + pendingMessage);
        }

        // 4
        System.out.println(generalGreeting + customer3 + displayTotalMessage + (latte-dripCoffee));
    }
}