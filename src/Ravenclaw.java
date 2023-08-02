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
        int n1 = name1.getIntellect() + name1.getWisdom() + name1.getWit() + name1.getCreativity();
        int n2 = this.intellect + this.wisdom + this.wit + this.creativity;
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
