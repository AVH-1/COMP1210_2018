/**
 * This project use for tutoring
 * project 09.
 *
 * @author Boyang Yu
 * @version 11/05/2019
 */

public class FiveG extends Cellular{
    public static final double COST_FACTOR = 5.0;

    public FiveG(String name, double bandwidth, double monthlyCost, double time, double limit) {
        super(name, bandwidth, monthlyCost, time, limit);
    }

    public double monthlyCost() {
        return monthlyCost + (dataUsage() - limit) * FiveG.COST_FACTOR * 3;
    }
}
