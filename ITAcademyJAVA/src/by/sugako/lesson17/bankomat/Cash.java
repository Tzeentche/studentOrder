package by.sugako.lesson17.bankomat;

public class Cash {

    private int amount;

    public int getAmount() {
        return amount;
    }

    public void minus(int value) {
        amount -= value;
    }

    public void plus(int value) {
        amount += value;
    }
}
