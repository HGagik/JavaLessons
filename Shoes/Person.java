public class Person {
    private double freeMoney;
    private double shoeSize;
    private Shoe[] shoes;

    public Person(double freeMoney, double shoeSize) {
        this.freeMoney = freeMoney;
        this.shoeSize = shoeSize;
    }

    public double getFreeMoney() {
        return freeMoney;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public Shoe[] getShoes() {
        return shoes;
    }

    public void setShoes(Shoe[] shoes) {
        if (hasEnoughMoney(shoes) && hasCorrectSize(shoes) && isInShoeLimit(shoes)) {
            this.shoes = shoes;
            System.out.println("Good luck");
        } else {
            System.out.println("Unable to buy.");
        }                

    }

    private boolean hasEnoughMoney(Shoe[] shoes) {
        double totalCost = 0;
        for (Shoe shoe : shoes) {
            totalCost += shoe.getPrice();
        }
        return totalCost <= freeMoney;
    }

    private boolean hasCorrectSize(Shoe[] shoes) {
        for (Shoe shoe : shoes) {
            if (shoe.getSize() != shoeSize) {
                return false;
            }
        }
        return true;
    }

    private boolean isInShoeLimit(Shoe[] shoes) {
        return shoes.length <= 50;
    }
}