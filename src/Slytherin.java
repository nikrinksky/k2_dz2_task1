public class Slytherin extends Hogwarts {
    private String name;
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authoritativeness;

    public Slytherin(String name, int conjure, int transgress, int trick, int determination, int ambition, int resourcefulness, int authoritativeness) {
        super(conjure, transgress);
        this.name = name;
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authoritativeness = authoritativeness;
    }

    public void printStudent() {
        System.out.print("Студент Хорвардса, факультета " + "Слизари " + getName() + " имееет свойства: ");
        propertiesForAll();
        System.out.print(", хитрость - " + getTrick() + ", решительность - " + getDetermination() + ", амбициозность - " + getAmbition()
                + ", находчивость - " + getResourcefulness() + ", жажда власти - " + getAuthoritativeness() + "\n");
    }

    public void comparisonOfProperties(Slytherin name1) {
        int n1 = name1.getTrick() + name1.getDetermination() + name1.getAmbition() + name1.getResourcefulness() + name1.getAuthoritativeness();
        int n2 = this.trick + this.determination + this.ambition + this.resourcefulness + this.authoritativeness;
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

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthoritativeness() {
        return authoritativeness;
    }

    public void setAuthoritativeness(int authoritativeness) {
        this.authoritativeness = authoritativeness;
    }

}
