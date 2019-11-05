import java.text.DecimalFormat;

/**
 * This project use for tutoring
 * project 09.
 *
 * @author Boyang Yu
 * @version 11/05/2019
 */

public abstract class WirelessNetwork {

    protected String name = "";
    protected double bandwidth = 0.0;
    protected double monthlyCost = 0.0;
    protected static int wirelessNetworkCount = 0;

    public WirelessNetwork(String name, double bandwidth, double monthlyCost) {
        this.name = name;
        this.bandwidth = bandwidth;
        this.monthlyCost = monthlyCost;
        wirelessNetworkCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(double bandwidth) {
        this.bandwidth = bandwidth;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public static int getCount() {
        return wirelessNetworkCount;
    }

    public static void resetCount() {
        WirelessNetwork.wirelessNetworkCount = 0;
    }

    public String toString() {
        DecimalFormat dF = new DecimalFormat("#,##0.00##");
        String toStr;
        toStr = name + " (" + getClass() + ") Cost: $" + dF.format(this.monthlyCost());
        toStr = toStr + "\nBandwidth: " + bandwidth + " Mbps";
        return toStr;
    }

    public abstract double monthlyCost();

}
