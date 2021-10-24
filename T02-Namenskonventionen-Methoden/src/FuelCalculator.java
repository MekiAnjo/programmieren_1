package t2;

public class FuelCalculator {

	public static double computeFuelConsumption(int kilometres, double fuelAmount) {

		double result = (fuelAmount * 100.0) / kilometres;

		System.out.println("Durchschnittlicher Spritverbrauch auf 100km: " + result + " Liter");
		return result;
	}

	public static void main(String[] args) {
		computeFuelConsumption(42, 60);
	}

}
