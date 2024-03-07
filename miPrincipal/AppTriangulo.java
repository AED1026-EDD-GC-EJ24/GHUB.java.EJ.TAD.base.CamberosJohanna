public class AppTriangulo {
    import java.util.Scanner;

    public static void menu() {
        System.out.println("==================================");
        System.out.println("    Operaciones con Triangulo     ");
        System.out.println("==================================");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del primer vértice (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo vértice (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del tercer vértice (x3 y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        Punto v1 = new Punto(x1, y1);
        Punto v2 = new Punto(x2, y2);
        Punto v3 = new Punto(x3, y3);

        Triangulo t1 = new Triangulo(v1, v2, v3);

        double[] lados = t1.longitudes();

        System.out.println("Lado 1: " + lados[0]);
        System.out.println("Lado 2: " + lados[1]);
        System.out.println("Lado 3: " + lados[2]);

        double perimetro = t1.perimetro();
        System.out.println("Perímetro: " + perimetro);

        double area = t1.area();
        System.out.println("Área: " + area);

        scanner.close();
    }

    public static class Punto {
        private double x;
        private double y;

        public Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }

    public static class Triangulo {
        private Punto v1;
        private Punto v2;
        private Punto v3;

        public Triangulo(Punto v1, Punto v2, Punto v3) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }

        public double[] longitudes() {
            double[] lados = new double[3];
            lados[0] = distancia(v1, v2);
            lados[1] = distancia(v2, v3);
            lados[2] = distancia(v3, v1);
            return lados;
        }

        private double distancia(Punto p1, Punto p2) {
            return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        }

        public double perimetro() {
            double[] lados = longitudes();
            return lados[0] + lados[1] + lados[2];
        }

        public double area() {
            double[] lados = longitudes();
            double s = perimetro() / 2;
            return Math.sqrt(s * (s - lados[0]) * (s - lados[1]) * (s - lados[2]));
        }
}
