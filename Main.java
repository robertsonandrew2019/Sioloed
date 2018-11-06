public class Main {

    public static void main(String[] args) {

        double volume = 72 * (22 / 2.0) * (22 / 2.0) * (Math.PI);
        volume += 19 * (18 / 2.0) * (18 / 2.0) * (Math.PI);
        volume += 50 * (13 / 2.0) * (13 / 2.0) * (Math.PI);
        volume += 67 * (16 / 2.0) * (16 / 2.0) * (Math.PI);
        volume += 16 * (14 / 2.0) * (14 / 2.0) * (Math.PI);
        volume += 53 * (23 / 2.0) * (23 / 2.0) * (Math.PI);
        volume += 69 * (22 / 2.0) * (22 / 2.0) * (Math.PI);
        volume += 30 * (22 / 2.0) * (22 / 2.0) * (Math.PI);
        volume += 52 * (23 / 2.0) * (23 / 2.0) * (Math.PI);
        volume += 40 * (16 / 2.0) * (16 / 2.0) * (Math.PI);
        volume += 31 * (18 / 2.0) * (18 / 2.0) * (Math.PI);
        volume += 75 * (23 / 2.0) * (23 / 2.0) * (Math.PI);

        double volumeToSave = ((37640 * 0.246 * 28) - volume) / (28 * 37640);

        System.out.printf("\nIn order for the water supply to last 28 days, each person must save %f cubic meters of water per day.\n", volumeToSave);
    }
}
