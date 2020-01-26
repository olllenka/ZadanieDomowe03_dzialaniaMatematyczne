public class DzialaniaMatematyczneTester {
    public static void main(String[] args) {
        DzialaniaMatematyczne dm1 = new DzialaniaMatematyczne();

        int a = 5;
        System.out.println("CZy liczba " + a + " jest parzysta? " + dm1.isEven(a));
        System.out.println("CZy liczba " + a + " jest nieparzysta? " + dm1.isOdd(a));

        double b = 2.5;
        System.out.println("Pole koła o promieniu " + b + " wynosi: " + dm1.circleField(b));
        System.out.println("Kwadrat liczby " + b + " ma wartość: " + dm1.power(b));

    }
}
