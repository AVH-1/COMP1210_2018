/**
 * This project use for tutoring
 * project 09.
 *
 * @author Boyang Yu
 * @version 11/05/2019
 */

public class WirelessNetworkPart1 {
    public static void main(String[] args) {
        WiFi n1 = new WiFi("ATT", 450, 20, 10);
        System.out.println(n1);
        System.out.println();

        Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
        System.out.println(n2);
        System.out.println();

        LTE n3 = new LTE("My iPad", 20.0, 30.00, 1200, 2.0);
        System.out.println(n3);
        System.out.println();

        FiveG n4 = new FiveG("My Phone", 80.0, 50.00, 1200, 10.0);
        System.out.println(n4);
        System.out.println();

    }
}
