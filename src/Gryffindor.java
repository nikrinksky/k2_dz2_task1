public class Gryffindor extends Hogwarts {
    private String name;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int conjure, int transgress, int nobility, int honor, int bravery) {
        super(conjure, transgress);
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void printStudent() {
        System.out.print("Студент Хорвардса, факультета " + "Грифиндор " + getName() + " имееет свойства: ");
        propertiesForAll();
        System.out.print(", благородство - " + getNobility() + ", честь - " + getHonor() + ", храбрость - " + getBravery() + "\n");
    }

    public void comparisonOfProperties(Gryffindor name1) {
        if (name1.getSum() > this.getSum()) {
            System.out.println("У " + name1.getName() + " свойства выше и равны: " + name1.getSum() + ", так как " + this.getName() + " имеет свойства равны: " + this.getSum());
        } else {
            System.out.println("У " + this.getName() + " свойства выше и равны: " + this.getSum() + ", так как " + name1.getName() + " имеет свойства равны: " + name1.getSum());
        }
    }

    public int getSum() {
        return getNobility() + getHonor() + getBravery();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

}
