public class BmiService {
    public double calculate(int weight) {
        double height = 1.89;
        return weight / (height * height);
    }
}
