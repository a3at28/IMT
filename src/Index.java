public class Index {
    public static void main(String[] args) {
        double mass = 69.5;
        double heightSm = 168.5;
        double heightM = heightSm / 100;
        double bodyMassIndex= mass / (heightM * heightM);
        System.out.println(bodyMassIndex);
    }
}