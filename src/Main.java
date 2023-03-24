public class Main {
    public static void main(String[] args) {
        int cost = 12345;
        byte rate = 20;

        int miles = cost / rate;

        System.out.println("Количество начисленных миль за купленный билет " + miles);
    }
}