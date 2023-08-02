public class Main {
    public static void main(String[] args) {

        Gryffindor hariPotter = new Gryffindor("Гарри Поттер", 20, 30, 40, 50, 60);
        Gryffindor germionaGreinjer = new Gryffindor("Гермиона Грейнджер", 15, 19, 18, 17, 26);
        Gryffindor ronUizli = new Gryffindor("Рон Уизли", 5, 9, 8, 7, 6);


        Hufflepuff zahariySmit = new Hufflepuff("Захария Смит", 4, 2, 3, 5, 7);
        Hufflepuff sedrikDeggori = new Hufflepuff("Седрик Диггори", 9, 6, 7, 4, 6);
        Hufflepuff jastinFinchFletchli = new Hufflepuff("Джастин Финч-Флетчли", 7, 3, 8, 10, 5);


        Ravenclaw chjouChang = new Ravenclaw("Чжоу Чанг", 12, 15, 8, 20, 23, 35);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 17, 12, 18, 25, 43, 30);
        Ravenclaw marcusBelbi = new Ravenclaw("Маркус Белби", 20, 12, 16, 33, 45, 24);

        Slytherin drakoMalfoy = new Slytherin("Драко Малфой", 19, 28, 25, 19, 46, 28, 30);
        Slytherin grehemMontegu = new Slytherin("Грэхэм Монтегю", 22, 21, 20, 29, 16, 31, 27);
        Slytherin gregoriGoil = new Slytherin("Грегори Гойл", 18, 20, 11, 19, 26, 40, 26);


        hariPotter.printStudent();
        germionaGreinjer.printStudent();
        ronUizli.printStudent();
        hariPotter.comparisonOfProperties(germionaGreinjer);
        germionaGreinjer.comparisonOfProperties(hariPotter);
        System.out.println();

        zahariySmit.printStudent();
        sedrikDeggori.printStudent();
        jastinFinchFletchli.printStudent();
        zahariySmit.comparisonOfProperties(sedrikDeggori);
        sedrikDeggori.comparisonOfProperties(zahariySmit);
        System.out.println();

        chjouChang.printStudent();
        padmaPatil.printStudent();
        marcusBelbi.printStudent();
        chjouChang.comparisonOfProperties(padmaPatil);
        padmaPatil.comparisonOfProperties(chjouChang);
        System.out.println();

        drakoMalfoy.printStudent();
        grehemMontegu.printStudent();
        gregoriGoil.printStudent();
        drakoMalfoy.comparisonOfProperties(grehemMontegu);
        grehemMontegu.comparisonOfProperties(drakoMalfoy);
        System.out.println();


        zahariySmit.compareTo(hariPotter);
        hariPotter.compareTo(zahariySmit);
        System.out.println();
        drakoMalfoy.compareTo(hariPotter);
        hariPotter.compareTo(drakoMalfoy);
    }
}