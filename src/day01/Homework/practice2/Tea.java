package day01.Homework.practice2;

public class Tea extends Beverage{
    private int amount;
    public Tea(String name, int price, int amount){
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
