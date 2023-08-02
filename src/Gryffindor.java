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
        int n1 = name1.getNobility() + name1.getHonor() + name1.getBravery();
        int n2 = this.nobility + this.honor + this.bravery;
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
