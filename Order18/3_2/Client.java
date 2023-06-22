public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);

        String[] edges = {
                "b",
                "c",
                "a",
                "c",
                "b",
        };

        float[] values = {
                4,
                5,
                4,
                2,
                3,
        };

        // Збереження початкового стану трикутника
        Triangle.TriangleMemento initialState = triangle.saveState();

        float maxSquare = Float.MIN_VALUE;
        Triangle.TriangleMemento maxSquareState = null;

        for (int index = 0; index < edges.length; index++) {
            // Відновлення початкового стану трикутника
            triangle.restoreState(initialState);

            switch (edges[index]) {
                case "a":
                    triangle.setA(values[index]);
                    break;
                case "b":
                    triangle.setB(values[index]);
                    break;
                case "c":
                    triangle.setC(values[index]);
                    break;
            }

            float square = triangle.square();
            System.out.println("Area = " + square);

            // Порівняння з максимальною площею
            if (square > maxSquare) {
                maxSquare = square;
                // Збереження стану з максимальною площею
                maxSquareState = triangle.saveState();
            }
        }

        // Відновлення стану з максимальною площею
        triangle.restoreState(maxSquareState);
        System.out.println("Triangle with maximum S: a = " + triangle.getA() +
                ", b = " + triangle.getB() + ", c = " + triangle.getC());
    }

}