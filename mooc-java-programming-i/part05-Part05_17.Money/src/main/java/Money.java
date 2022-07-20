public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return newMoney;
    }

    public boolean lessThan(Money compare) {
        int firstEuros = this.euros();
        int compareEuros = compare.euros();
        if (firstEuros < compare.euros()) {
            return true;
        }
        if (firstEuros > compare.euros()) {
            return false;
        }
        int firstCents = this.cents();
        int compareCents = compare.cents();

        if (firstCents < compareCents) {
            return true;
        }
        return false;

    }

    public Money minus(Money decrease) {

        int novo_euro = this.euros - decrease.euros();
        int novo_cent = this.cents - decrease.cents();

        if (this.lessThan(decrease)) {
            novo_euro = 0;
            novo_cent = 0;
        } else {
            if (decrease.cents() > this.cents) {
                novo_euro = novo_euro - 1;
                novo_cent = 100 + (novo_cent);
            }
        }
        Money minusMoney = new Money(novo_euro, novo_cent);
        return minusMoney;
    }

}
