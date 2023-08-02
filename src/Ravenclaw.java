public class Ravenclaw extends Hogwarts {
    private String name;
    private int intellect;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int conjure, int transgress, int intellect, int wisdom, int wit, int creativity) {
        super(conjure, transgress);
        this.name = name;
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void printStudent() {
        System.out.print("Студент Хорвардса, факультета " + "Когтевранцы " + getName() + " имееет свойства: ");
        propertiesForAll();
        System.out.print(", ум - " + getIntellect() + ", мудрость - " + getWisdom() + ", остроумие - " + getWit() + ", творчентво - " + getCreativity() + "\n");
    }

    public void comparisonOfProperties(Ravenclaw name1) {
        if (name1.getSum() > this.getSum()) {
            System.out.println("У " + name1.getName() + " свойства выше и равны: " + name1.getSum() + ", так как " + this.getName() + " имеет свойства равны: " + this.getSum());
        } else {
            System.out.println("У " + this.getName() + " свойства выше и равны: " + this.getSum() + ", так как " + name1.getName() + " имеет свойства равны: " + name1.getSum());
        }
    }

    public int getSum() {
        return getIntellect() + getWisdom() + getWit() + getCreativity();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

}
