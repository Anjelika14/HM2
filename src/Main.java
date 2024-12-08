public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.75;
        int weight = 56;

        double Index = service.calculate(height, weight);

        System.out.println("Индекс массы тела:" + Index);
    }
}

