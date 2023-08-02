public class Hufflepuff extends Hogwarts {
    private String name;
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int conjure, int transgress, int industriousness, int loyalty, int honesty) {
        super(conjure, transgress);
        this.name = name;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


    public void printStudent() {
        System.out.print("Студент Хорвардса, факультета " + "Пуффендуя " + getName() + " имееет свойства: ");
        propertiesForAll();
        System.out.print(", трудолюбие - " + getIndustriousness() + ", верность - " + getLoyalty() + ", чесность - " + getHonesty() + "\n");
    }

    public void comparisonOfProperties(Hufflepuff name1) {
        if (name1.getSum() > this.getSum()) {
            System.out.println("У " + name1.getName() + " свойства выше и равны: " + name1.getSum() + ", так как " + this.getName() + " имеет свойства равны: " + this.getSum());
        } else {
            System.out.println("У " + this.getName() + " свойства выше и равны: " + this.getSum() + ", так как " + name1.getName() + " имеет свойства равны: " + name1.getSum());
        }
    }

    public int getSum() {
        return getIndustriousness() + getLoyalty() + getHonesty();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

}
