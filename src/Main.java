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
        byte LudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAnreevna = 30;
        short  TotalQuantity = ( short) (LudmilaPavlovna + AnnaSergeevna + EkaterinaAnreevna);
        System.out.println("Общее количество учеников " + TotalQuantity);
        short SheetsOfPaper = (short) (480 / TotalQuantity);
        System.out.println("На каждого ученика рассчитано " + SheetsOfPaper + " листов бумаги" );
        //Задание 4
        byte OneBottle = (byte) (16 / 2);
        System.out.println("За одну минуту " + OneBottle + " бутылок");
        byte minutes = 20;
        short OneMinutes = (short) (minutes * OneBottle);
        System.out.println("За " + minutes + " минут машина произвела " + OneMinutes + " штук бутылок");
        short OneDay= 1440;
        short OneDayBottle= (short) (OneDay * OneBottle);
        System.out.println("За сутки машина произвела " + OneDayBottle + " штук бутылок");
        short ThreeDay = 4320;
        int ThreeDayBottle = (ThreeDay* OneBottle);
        System.out.println("За 3 дня машина произвела " + ThreeDayBottle + " штук бутылок");
        int Month = 43200;
        int MonthBottle = (Month * OneBottle);
        System.out.println("За месяц машина произвела " + MonthBottle + " штук бутылок");
        //Задание 5
        byte jars = 120;
        byte JarsWhite = 2;
        byte jarsBrown = 4;
        byte  TotalNumberOfCans = (byte) (2 + 4);
        byte Class = (byte) (jars / TotalNumberOfCans);
        byte NeedWhitePaint = (byte) (Class * JarsWhite);
        byte NeedSomeBrownPaint = (byte) (Class * jarsBrown);

        System.out.println("В школе, где " + Class + " классов, нужно " + NeedWhitePaint + " банок белой краски и " + NeedSomeBrownPaint + " банок коричневой краски");

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
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;

        int SalaryincreaseMasha = ((Masha * 10) / 100) + Masha;
        int SalaryincreaseDenis = ((Denis * 10) / 100) + Denis;
        int SalaryincreaseKristina =  ((Kristina * 10) / 100) + Kristina;
        int AnnualincomeMasha = (SalaryincreaseMasha * 12) - (Masha * 12);
        int AnnualincomeDenis = (SalaryincreaseDenis * 12) - (Denis * 12);
        int AnnualincomeKristina = (SalaryincreaseKristina * 12)  - (Kristina * 12);

        System.out.println("Маша теперь получает " + SalaryincreaseMasha + " рублей. Годовой доход вырос на " + AnnualincomeMasha +" рублей.");

        System.out.println("Дениc теперь получает " + SalaryincreaseDenis + " рублей. Годовой доход вырос на " + AnnualincomeDenis +" рублей.");

        System.out.println("Кристина теперь получает " + SalaryincreaseKristina + " рублей. Годовой доход вырос на " + AnnualincomeKristina +" рублей.");

    }
}