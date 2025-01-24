public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        System.out.printf("\nПри внеcении 20000 бонус:");
        System.out.println(service.calculate(20000));

        System.out.printf("\nПри внеcении 500 бонус:");
        System.out.println(service.calculate(500));

        System.out.printf("\nПри внеcении 860 бонус:");
        System.out.println(service.calculate(860));

        System.out.printf("\nПри внеcении 20 бонус:");
        System.out.println(service.calculate(20));

        System.out.printf("\nПри внеcении 1003 бонус:");
        System.out.println(service.calculate(1003));
    }
}connect 46.174.52.109:27028