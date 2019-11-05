/**
 * This project use for tutoring
 * project 09.
 *
 * @author Boyang Yu
 * @version 11/05/2019
 */

public class LTE extends Cellular {
    public static final double COST_FACTOR = 4.0;

    public LTE(String name, double bandwidth, double monthlyCost, double time, double limit) {
        super(name, bandwidth, monthlyCost, time, limit);
    }

    public double monthlyCost() {
        return monthlyCost + (dataUsage() - limit) * LTE.COST_FACTOR * 2;
    }

    public String toSting() {
        return super.toString();
    }

}
