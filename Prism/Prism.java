import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Prism {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            double t = 2024;
            for (int i=2024; i > 2; i--) {
                double x = t;
                double y = i - 1;
            
                t = f(x, y);
                
                String str = "f("+ x +","+ y +")=" + t;
                System.out.println(str);
                writer.write(str);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double f(double x, double y) {
        double a = 3 * Math.pow(x, 3) * y + 3 * Math.pow(x, 2) * Math.pow(y, 2) + x * Math.pow(y, 3) + 45;
        double b = Math.pow(x + 1, 3) + Math.pow(y + 1, 3) - 60;
        double k = a / b;
        return k;
    }
}
