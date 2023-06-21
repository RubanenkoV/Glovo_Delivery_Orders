public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Sugar(new Sugar(espresso)); // Додати 2 порції цукру до еспресо
        System.out.println(espresso);

        Beverage darkRoast = new DarkRoast();
        darkRoast = new WhippedCream(new Sugar(new Sugar(darkRoast))); // Додати вершки та дві порції цукру до чорної кави
        System.out.println(darkRoast);

        Beverage darkRoast1 = new DarkRoast();
        darkRoast1 = new Cream(new Sugar(darkRoast1)); // Додати крем та порцію цукру до чорної кави
        System.out.println(darkRoast1);

        Beverage decaf = new Decaf();
        decaf = new Milk(new Sugar(new Sugar(decaf))); // Додати молоко та дві порції цукру до кави без кофеїну
        System.out.println(decaf);
    }
}