/**
 * This project use for tutoring
 * project 09.
 *
 * @author Boyang Yu
 * @version 11/05/2019
 */

public class WiFi extends WirelessNetwork {
    private double modemCost = 0.0;

    public WiFi(String name, double bandwidth, double monthlyCost, double modemCost) {
        super(name, bandwidth, monthlyCost);
        this.modemCost = modemCost;
    }

    public double getModemCost() {
        return modemCost;
    }

    public void setModemCost(double modemCost) {
        this.modemCost = modemCost;
    }

    public double monthlyCost() {
        return modemCost + monthlyCost;
    }
}
