public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 1.5f;
        double f = 2.3d;
        char g = 41;
        boolean A = a > 5;
        System.out.println(g);

        // Задание 2
        float weight1 = 78.2f;
        float weight2 = 82.7f;
        float totalWeight = weight1 + weight2;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        float differenceWeights = weight2 - weight1;
        System.out.println("Разница в весе боксеров " + differenceWeights + " кг");

        // Задание 3
        int bananas = 5 * 80;
        System.out.println(bananas + " грамм");
        int milk = 2 * 105;
        System.out.println(milk + " грамм");
        int iceCream = 2 * 100;
        System.out.println(iceCream + " грамм");
        int eggs = 4 * 70;
        System.out.println(eggs + " грамм");
        int breakfast = bananas + milk + iceCream + eggs;
        System.out.println(breakfast + "  грамм");
        double breakfastKG = breakfast / 1000d;
        System.out.println(breakfastKG + " кг");

        // Задание 4
        float daysAmount1 = 7 / 0.25f;
        System.out.println(daysAmount1 + " дней нужно, чтобы сбросить вес");
        float daysAmount2 = 7 / 0.5f;
        System.out.println(daysAmount2 + " дней нужно, чтобы сбросить вес");
        float averageAmountDays = (daysAmount1 + daysAmount2) / 2;
        System.out.println(averageAmountDays + " день в среднем");


        // Задание 5
        double salaryMasha = 67_760d;
        double salaryDenis = 83_690d;
        double salaryKristina = 76_230d;

        double percent = 10;
        double salaryMashaAfterPromotion = salaryMasha * percent / 100 + salaryMasha;
        double salaryDenisAfterPromotion = salaryDenis * percent / 100 + salaryDenis;
        double salaryKristinaAfterPromotion = salaryKristina * percent / 100 + salaryKristina;

        double diffMasha = (salaryMashaAfterPromotion - salaryMasha) * 12;
        double diffDenis = (salaryDenisAfterPromotion - salaryDenis) * 12;
        double diffKristina = (salaryKristinaAfterPromotion - salaryKristina) * 12;

        System.out.println("Маша теперь получает " + salaryMashaAfterPromotion
                + " рублей. Годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisAfterPromotion
                + " рублей. Годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaAfterPromotion
                + " рублей. Годовой доход вырос на " + diffKristina + " рублей");

    }
}