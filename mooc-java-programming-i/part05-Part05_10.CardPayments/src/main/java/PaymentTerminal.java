public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.00;

    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            card.addMoney(sum);
            this.money = this.money + sum;
        }
    }

    public double eatAffordably(double payment) {
        if (payment < 2.50) {
            return payment;
        } else {
            this.money = this.money + 2.50;
            this.affordableMeals++;
            return payment - 2.50;
        }
    }

    public double eatHeartily(double payment) {
        if (payment < 4.30) {
            return payment;
        } else {
            this.money = this.money + 4.30;
            this.heartyMeals++;
            return payment - 4.30;

        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.50)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.30)) {
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public double olhar() {
        return this.money;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}