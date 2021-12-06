package exceptions;

public class BankAccount {

  private int credit;

  BankAccount(int credit) {
    this.credit = credit;
  }

  public void depositMoney(int amount) throws InvalidMoneyException {
    if (amount < 0) {
      throw new InvalidMoneyException("Geldbetrag muss >= 0 sein.");
    }
    credit += amount;
    System.out.println("Neuer Kontostand: " + credit + "€");
  }

  public void withdrawMoney(int amount) throws InvalidMoneyException {
    if (credit <= 0) {
      throw new InvalidMoneyException("Nicht genug Geld auf dem Konto");
    }
    credit -= amount;
    System.out.println("Neuer Kontostand: " + credit + "€");
  }

  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount(6_000_000);

    try {
      myAccount.withdrawMoney(350_000);
      myAccount.depositMoney(-5000);
    } catch (InvalidMoneyException e) {
      e.printStackTrace();
    }
  }
}
