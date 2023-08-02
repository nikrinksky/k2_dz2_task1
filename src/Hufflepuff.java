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
        int n1 = name1.getIndustriousness() + name1.getLoyalty() + name1.getHonesty();
        int n2 = this.industriousness + this.loyalty + this.honesty;
        if (n1 > n2) {
            System.out.println("У " + name1.getName() + " свойства выше и равны: " + n1 + ", так как " + this.getName() + " имеет свойства равны: " + n2);
        } else {
            System.out.println("У " + this.getName() + " свойства выше и равны: " + n2 + ", так как " + name1.getName() + " имеет свойства равны: " + n1);
        }
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
