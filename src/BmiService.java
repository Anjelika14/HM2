public class BmiService {
    public int calculate(double height, int weight) {
        double Index = weight / Math.pow(height, (double) 2.0F);

        return (int) Index;
    }
}

