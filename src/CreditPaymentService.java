public class CreditPaymentService {
    public int calculate(double credit, double percent, int year) {
        int payment = (int) (credit * (percent * Math.pow(1 + percent, year * 12) / (Math.pow(1 + percent, year * 12) - 1)));
        return payment;
    }
}
