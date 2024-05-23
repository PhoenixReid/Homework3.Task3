public class Main {
    public static void main(String[] args) {
        double credit = 1000000;
        double percent = 0.0999 / 12;
        int year1 = 1;
        int year2 = 2;
        int year3 = 3;
        CreditPaymentService service = new CreditPaymentService();
        System.out.println(service.calculate(credit, percent, year1));
        System.out.println(service.calculate(credit, percent, year2));
        System.out.println(service.calculate(credit, percent, year3));
    }
}