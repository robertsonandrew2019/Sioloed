public class Main {

    public static void main(String[] args) {
        // write your code here

        double v1 = 72 * (22 / 2.0) * (22 / 2.0) * (Math.PI);
        double v2 = 19 * (18 / 2.0) * (18 / 2.0) * (Math.PI);
        double v3 = 50 * (13 / 2.0) * (13 / 2.0) * (Math.PI);
        double v4 = 67 * (16 / 2.0) * (16 / 2.0) * (Math.PI);
        double v5 = 16 * (14 / 2.0) * (14 / 2.0) * (Math.PI);
        double v6 = 53 * (23 / 2.0) * (23 / 2.0) * (Math.PI);
        double v7 = 69 * (22 / 2.0) * (22 / 2.0) * (Math.PI);
        double v8 = 30 * (22 / 2.0) * (22 / 2.0) * (Math.PI);
        double v9 = 52 * (23 / 2.0) * (23 / 2.0) * (Math.PI);
        double v10 = 40 * (16 / 2.0) * (16 / 2.0) * (Math.PI);
        double v11 = 31 * (18 / 2.0) * (18 / 2.0) * (Math.PI);
        double v12 = 75 * (23 / 2.0) * (23 / 2.0) * (Math.PI);
        //above is the water each tower holds in cubic meters at 100% capacity

        int pop = 37640;
        double consump = 0.246;
        double totalDailyConsump = pop * consump;
        double totalConsump = 28 * totalDailyConsump;
        double totalWaterVol = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10 + v11 + v12;
        double volToSave = totalConsump - totalWaterVol;
        double personalSaveAmount = volToSave / 28 / pop;
        double newConsump = consump - personalSaveAmount;
        //above are the operations used to evaluate the amount needed to save enough water

        System.out.print("In order for the water supply to last 28 days, each person must save " + personalSaveAmount + " cubic meters of water per day.");
    }
}
