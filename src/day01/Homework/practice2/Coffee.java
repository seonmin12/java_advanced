package day01.Homework.practice2;

public class Coffee extends Beverage {
    private int amount;
    public Coffee(String name, int price, int amount){
        super(name,price);
        this.amount =amount;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public void calcPrice() {

    }
}
