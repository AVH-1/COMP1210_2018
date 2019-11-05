import java.text.DecimalFormat;

/**
 * This project use for tutoring
 * project 09.
 *
 * @author Boyang Yu
 * @version 11/05/2019
 */

public class Cellular extends WirelessNetwork{
    protected double time, limit = 0.0;
    public static final double COST_FACTOR = 1.0;

    public Cellular(String name, double bandwidth, double monthlyCost, double time, double limit) {
        super(name, bandwidth, monthlyCost);
        this.time = time;
        this.limit = limit;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double dataUsage() {
        return bandwidth / 8000 * time;
    }

    public double monthlyCost() {
        return monthlyCost + (dataUsage() - limit) * Cellular.COST_FACTOR;
    }
    public String toString() {
        String toStr = super.toString();
        DecimalFormat dF = new DecimalFormat("#,##0.0###");
        toStr = toStr + "\nTime: " + time + " seconds";
        toStr += "\nData Limit: " + limit + " GB";
        toStr += "\nData Used: " + dF.format(dataUsage()) + " GB";
        return toStr;
    }


}
