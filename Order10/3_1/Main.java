public class Main {
    public static void main(String[] args) {
        PrintableString hello = new PrintableString("");
        PrintableString helloComa = new PostComaDecorator(hello);
        PrintableString hello1Coma = new PreWordDecorator(helloComa, "Hello");
       /* PrintableString hello1ComaSpace = new PostSpaceDecorator(hello1Coma);*/
        PrintableString helloComaWorld = new PostWordDecorator(hello1Coma, "World");
        PrintableString helloWorldComaEndlSpaceExclaim = new PostExclaimDecorator(helloComaWorld);

        helloWorldComaEndlSpaceExclaim.print();
    }
}