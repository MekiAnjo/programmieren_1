package t1;

public class BarbecueDinner {

	public static void main(String[] args) {

		int flourAmount = 100;
		int potatoAmount = 1000;
		int frozenPizzaAmount = 4;
		int bbqSpitAmount = 10;

		double potatoSaladAmount = 221.6;
		double minceAmount = 498.4;

		double flourCaloriesPerGram = 364.0 / 100.0;
		double potatoCaloriesPerGram = 69.0 / 100.0;
		double pizzaCaloriesPerServing = 910.0;
		double bbqSpitCaloriesPerServing = 169.0;
		double potatoSaladCaloriesPerGram = 143.0 / 100.0;
		double minceCaloriesPerGram = 241.0 / 100.0;

		double totalCalories = (flourAmount * flourCaloriesPerGram + potatoAmount * potatoCaloriesPerGram
				+ frozenPizzaAmount * pizzaCaloriesPerServing + bbqSpitAmount * bbqSpitCaloriesPerServing
				+ potatoSaladAmount * potatoSaladCaloriesPerGram + minceAmount * minceCaloriesPerGram);

		System.out.println("Einkaufsliste");
		System.out.println("-----------------------");
		System.out.println("Mehl            = " + flourAmount + " gr.");
		System.out.println("Kartoffeln      = " + potatoAmount + " gr.");
		System.out.println("Tiefkühlpizza   = " + frozenPizzaAmount + " Stk.");
		System.out.println("Grillspieße     = " + bbqSpitAmount + " Stk.");
		System.out.println("Kartoffelsalat  = " + potatoSaladAmount + " gr.");
		System.out.println("Hackfleisch     = " + minceAmount + " gr.");
		System.out.println("-----------------------\n");

		System.out.println("Kalorien der Lebensmittel");
		System.out.println("-----------------------");
		System.out.println("Mehl            = " + flourAmount * flourCaloriesPerGram + " kcal");
		System.out.println("Kartoffeln      = " + potatoAmount * potatoCaloriesPerGram + " kcal");
		System.out.println("Tiefkühlpizza   = " + frozenPizzaAmount * pizzaCaloriesPerServing + " kcal");
		System.out.println("Grillspieße     = " + bbqSpitAmount * bbqSpitCaloriesPerServing + " kcal");
		System.out.println("Kartoffelsalat  = " + potatoSaladAmount * potatoSaladCaloriesPerGram + " kcal");
		System.out.println("Hackfleisch     = " + minceAmount * minceCaloriesPerGram + " kcal\n");
		System.out.println("Summe der Kalorien aller Produkte = " + totalCalories + " kcal");
		System.out.println("-----------------------");

		System.out.printf("Einkaufsliste %n-----------------------%n");
		System.out.printf("%-15s = %d gr. %n", "Mehl", flourAmount);
		System.out.printf("%-15s = %d gr. %n", "Kartoffeln", potatoAmount);
		System.out.printf("%-15s = %d Stk. %n", "Tiefkühlpizza", frozenPizzaAmount);
		System.out.printf("%-15s = %d Stk. %n", "Grillspieße", bbqSpitAmount);
		System.out.printf("%-15s = %.1f gr. %n", "Kartoffelsalat", potatoSaladAmount);
		System.out.printf("%-15s = %.1f gr. %n", "Hackfleisch", minceAmount);
		System.out.printf("-----------------------%n%n");

		System.out.printf("Kalorien der Lebensmittel%n-----------------------%n");
		System.out.printf("%-15s = %.2f kcal %n", "Mehl", flourAmount * flourCaloriesPerGram);
		System.out.printf("%-15s = %.2f kcal %n", "Kartoffeln", potatoAmount * potatoCaloriesPerGram);
		System.out.printf("%-15s = %.2f kcal %n", "Tiefkühlpizza", frozenPizzaAmount * pizzaCaloriesPerServing);
		System.out.printf("%-15s = %.2f kcal %n", "Grillspieße", bbqSpitAmount * bbqSpitCaloriesPerServing);
		System.out.printf("%-15s = %.2f kcal %n", "Kartoffelsalat", potatoSaladAmount * potatoSaladCaloriesPerGram);
		System.out.printf("%-15s = %.2f kcal %n%n", "Hackfleisch", minceAmount * minceCaloriesPerGram);
		System.out.printf("Summe der Kalorien aller Produkte = %.2f kcal %n", totalCalories);
		System.out.printf("-----------------------");
	}
}