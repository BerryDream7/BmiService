public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 135;
        double BMI = service.calculate((int) weight);
        System.out.println(BMI);
    }
}