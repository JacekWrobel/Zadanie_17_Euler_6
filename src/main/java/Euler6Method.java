public class Euler6Method {

    public int squareDifference(int number) {
        int sumSquare = 0;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sumSquare += i * i;
            sum += i;
        }
        return (sum * sum) - sumSquare;
    }
}
