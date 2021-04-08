public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles1 = service.calculate(16_500);
        System.out.println(miles1);

        int miles2 = service.calculate(20_000);
        System.out.println(miles2);

        int miles3 = service.calculate(10_200);
        System.out.println(miles3);

        int miles4 = service.calculate(30_150);
        System.out.println(miles4);

    }
}