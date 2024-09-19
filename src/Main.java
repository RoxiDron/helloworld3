public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задание 1
        int bananas = 3;
        System.out.println("Бананов " + bananas + " кг");
        byte  apples = 4;
        System.out.println("Яблоков " + apples + " кг");
        short tangerines = 5;
        System.out.println("Мандаринов " + tangerines + " кг");
        long oranges = 6;
        System.out.println("Апельсинов " + oranges + " кг");
        float lemous = 7;
        System.out.println("Лимонов " + lemous + " кг");
        double pears = 6;
        System.out.println("Груш " + pears + " кг");
        //Задание 2
        float a = 27.12f;
        System.out.println(a);
        long b = 987_678_965_549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
        //Задание 3
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAnreevna = 30;
        short  totalQuantity = ( short) (ludmilaPavlovna + annaSergeevna + ekaterinaAnreevna);
        System.out.println("Общее количество учеников " + totalQuantity);
        short sheetsOfPaper = (short) (480 / totalQuantity);
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaper + " листов бумаги" );
        //Задание 4
        byte oneBottle = (byte) (16 / 2);
        System.out.println("За одну минуту " + oneBottle + " бутылок");
        byte minutes = 20;
        short oneMinutes = (short) (minutes * oneBottle);
        System.out.println("За " + minutes + " минут машина произвела " + oneMinutes + " штук бутылок");
        short oneDay= 1440;
        short oneDayBottle= (short) (oneDay * oneBottle);
        System.out.println("За сутки машина произвела " + oneDayBottle + " штук бутылок");
        short threeDay = 4320;
        int threeDayBottle = (threeDay* oneBottle);
        System.out.println("За 3 дня машина произвела " + threeDayBottle + " штук бутылок");
        int month = 43200;
        int monthBottle = (month * oneBottle);
        System.out.println("За месяц машина произвела " + monthBottle + " штук бутылок");
        //Задание 5
        byte jars = 120;
        byte jarsWhite = 2;
        byte jarsBrown = 4;
        byte totalNumberOfCans = (byte) (2 + 4);
        byte class0 = (byte) (jars / totalNumberOfCans);
        byte needWhitePaint = (byte) (class0 * jarsWhite);
        byte needSomeBrownPaint = (byte) (class0 * jarsBrown);

        System.out.println("В школе, где " + class0 + " классов, нужно " + needWhitePaint + " банок белой краски и " + needSomeBrownPaint + " банок коричневой краски");

        //Задание 6
        short bananas1 = (short) (5 * 80);
        short milk = (short) (105 * 2);
        short iceСream = (short) (2 * 100);
        short eggs = (short) (4 * 70);
        short totalWeight = (short) (bananas1 + milk + iceСream + eggs);
        float totalWeight1 = (float) totalWeight / 1000;
        System.out.println("Общий вес = " + totalWeight + " граммах." + "Общий вес = " + totalWeight1 + " килограмм.");
        //Задание 7
        short gr = 250;
        short gr2 = 500;
        short gr3 = (short) (7 * 1000);
        short х1 = (short) (gr3 / gr);
        short х2 = (short) (gr3 / gr2);
        short x4 = (short) (((gr3 / gr) + (gr3 / gr2)) / 2);
        System.out.println("У спортсмена уйдёт " + х1 + " дней, если будет терять по " + gr + " грамм и уйдёт " + х2 + " дней, если будет терять по " + gr2 + " килограмм");
        System.out.println("В среднем у спортсмена уйдёт " + x4 + " день");
        //Задание 8

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int salaryincreaseMasha = ((masha * 10) / 100) + masha;
        int salaryincreaseDenis = ((denis * 10) / 100) + denis;
        int salaryincreaseKristina =  ((kristina * 10) / 100) + kristina;
        int annualincomeMasha = (salaryincreaseMasha * 12) - (masha * 12);
        int annualincomeDenis = (salaryincreaseDenis * 12) - (denis * 12);
        int annualincomeKristina = (salaryincreaseKristina * 12)  - (kristina * 12);

        System.out.println("Маша теперь получает " + salaryincreaseMasha + " рублей. Годовой доход вырос на " + annualincomeMasha +" рублей.");

        System.out.println("Дениc теперь получает " + salaryincreaseDenis + " рублей. Годовой доход вырос на " + annualincomeDenis +" рублей.");

        System.out.println("Кристина теперь получает " + salaryincreaseKristina + " рублей. Годовой доход вырос на " + annualincomeKristina +" рублей.");

    }
}