import org.jetbrains.annotations.NotNull;

public class Hogwarts {
    private String name;
    private int conjure;
    private int transgress;

    public Hogwarts(int conjure, int transgress) {
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public void propertiesForAll() {
        System.out.print("колдоввать - " + getConjure() + ", трансгрессировать - " + getTransgress());
    }

    public void compareTo(Hogwarts hogwarts) {
        int n1 = hogwarts.getConjure() + hogwarts.getTransgress();
        int n2 = this.conjure + this.transgress;
        if (n1 > n2) {
            System.out.println("У " + hogwarts.getName() + " из " + hogwarts.getClass().getTypeName() + " свойства выше и равны: " + n1
                    + ", так как " + this.getName() + " из " + this.getClass().getTypeName() + " имеет свойства равны: " + n2);
        } else {
            System.out.println("У " + this.getName() + " из " + this.getClass().getTypeName() + " свойства выше и равны: " + n2
                    + ", так как " + hogwarts.getName() + " из " + hogwarts.getClass().getTypeName() + " имеет свойства равны: " + n1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}
