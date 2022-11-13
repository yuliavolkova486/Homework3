public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int productLength1 = 1896345;
        byte productLength2 = 118;
        short productLength3 = 2265;
        long productLength4 = 111364544724L;
        float productLength5 = 88.69F;
        double productLength6 = 69.44;
        System.out.println("Значение переменной productLength1, с типом int, равно " + (productLength1));
        System.out.println("Значение переменной productLength2, с типом byte, равно " + (productLength2));
        System.out.println("Значение переменной productLength3, с типом short, равно " + (productLength3));
        System.out.println("Значение переменной productLength4, с типом long, равно " + (productLength4));
        System.out.println("Значение переменной productLength5, с типом float, равно " + (productLength5));
        System.out.println("Значение переменной productLength6, с типом double, равно " + (productLength6));

        // Задача 2
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        char c = 2;
        short d = 786;
        boolean f = false;
        int g= 569;
        short e = -159;
        double k = 27897;
        byte n = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(e);
        System.out.println(k);
        System.out.println(n);

        // Задача 3
        System.out.println("Задача 3");
        byte studentsInTheClass1 = 23;
        byte studentsInTheClass2 = 27;
        byte studentsInTheClass3 = 30;
        short totalSheetsPaper = 480;
        int totalStudents = studentsInTheClass1 + studentsInTheClass2 + studentsInTheClass3;
        System.out.println("На каждого ученика рассчитано " +(totalSheetsPaper/totalStudents)+ " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        int numberOfMinutes = 2;
        int numberOfBottles = 16;
        int bottlesPerMinute = numberOfBottles / numberOfMinutes;
        int aboutTwentyMinutesAway = 20;
        int minutesPerDay = 24 * 60;
        int minutesInThreeDays = 3 * minutesPerDay;
        int minutesPerMonth = 30 * minutesPerDay;
        System.out.println("За " +(aboutTwentyMinutesAway)+ " минут машина произвела бутылок " +(aboutTwentyMinutesAway * bottlesPerMinute)+ " штук");
        System.out.println("За " +(minutesPerDay)+ " минут машина произвела бутылок " +(minutesPerDay * bottlesPerMinute)+ " штук");
        System.out.println("За " +(minutesInThreeDays)+ " минут машина произвела бутылок " +(minutesInThreeDays * bottlesPerMinute)+ " штук");
        System.out.println("За " +(minutesPerMonth)+ " минут машина произвела бутылок " +(minutesPerMonth * bottlesPerMinute)+ " штук");

        // Задача 5
        System.out.println("Задача 5");
        int oneClassNeedsWhitePaint = 2;
        int oneClassNeedsBrownPaint = 4;
        int totalCansOfPaint = 120;
        int totalClasses = totalCansOfPaint / (oneClassNeedsWhitePaint + oneClassNeedsBrownPaint);
        int totalWhitePaint = totalClasses * oneClassNeedsWhitePaint;
        int totalBrownPaint = totalClasses * oneClassNeedsBrownPaint;
        System.out.println("В школе, где " +(totalClasses)+ " классов, нужно " +(totalWhitePaint)+ " банок белой краски и " +(totalBrownPaint)+ " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int weightOfBananas = 5 * 80;
        int weightOfMilk = 200 / 100 * 105;
        int iceCreamWeight = 2 * 100;
        int eggWeight = 4 * 70;
        float weightSportsBreakfastGr = weightOfBananas + weightOfMilk + iceCreamWeight + eggWeight;
        int grPerKg = 1000;
        float weightSportsBreakfastKg = weightSportsBreakfastGr /(float)grPerKg;
        System.out.println(weightSportsBreakfastGr+ " грамм");
        System.out.println(weightSportsBreakfastKg+ " килограмм");

        // Задача 7
        System.out.println("Задача 7");
        int needToLoseKg = 7;
        int kgPerGr = 1000;
        int needToLoseGr = 7 * kgPerGr;
        int lostWeightPerDayGr1 = 250;
        int lostWeightPerDayGr2 = 500;
        int numberOfDay1 = needToLoseGr / lostWeightPerDayGr1;
        int numberOfDay2 = needToLoseGr / lostWeightPerDayGr2;
        int arithmeticAverageOfDays = 2;
        System.out.println("Если спортсмен будет худеть в день на " +(lostWeightPerDayGr1)+
                " грамм, чтобы похудеть на " +(needToLoseKg)+ " кг, ему потребуется " +(numberOfDay1)+ " дней");
        System.out.println("Если спортсмен будет худеть в день на " +(lostWeightPerDayGr2)+
                " грамм, чтобы похудеть на " +(needToLoseKg)+ " кг, ему потребуется " +(numberOfDay2)+ " дней");
        System.out.println("В среднем, спортсмену понадобится " +((numberOfDay1) + (numberOfDay2)) / (arithmeticAverageOfDays)+
                " день, чтобы похудеть на " +(needToLoseKg)+ " кг");

        // Задача 8
        System.out.println("Задача 8");
        int mashaSalaryBeforeTheIncrease = 67760;
        int denisSalaryBeforeTheIncrease = 83690;
        int kristinaSalaryBeforeTheIncrease = 76230;
        int salaryIncrease = 10;
        int monthsPerYear = 12;
        int mashaSalaryAfterThePromotion = mashaSalaryBeforeTheIncrease / salaryIncrease + mashaSalaryBeforeTheIncrease;
        int denisSalaryAfterThePromotion = denisSalaryBeforeTheIncrease / salaryIncrease + denisSalaryBeforeTheIncrease;
        int kristinaSalaryAfterThePromotion = kristinaSalaryBeforeTheIncrease / salaryIncrease + kristinaSalaryBeforeTheIncrease;
        int theDifferenceInMashaIncome = (mashaSalaryAfterThePromotion * monthsPerYear) - (mashaSalaryBeforeTheIncrease * monthsPerYear);
        int theDifferenceInDenisIncome = (denisSalaryAfterThePromotion * monthsPerYear) - (denisSalaryBeforeTheIncrease * monthsPerYear);
        int theDifferenceInKristinaIncome = (kristinaSalaryAfterThePromotion * monthsPerYear) - (kristinaSalaryBeforeTheIncrease * monthsPerYear);
        System.out.println("Маша теперь получает " +(mashaSalaryAfterThePromotion)+ " рублей. Годовой доход вырос на "
                +(theDifferenceInMashaIncome)+ " рублей");
        System.out.println("Денис теперь получает " +(denisSalaryAfterThePromotion)+ " рублей. Годовой доход вырос на "
                +(theDifferenceInDenisIncome)+ " рублей");
        System.out.println("Кристина теперь получает " +(kristinaSalaryAfterThePromotion)+ " рублей. Годовой доход вырос на "
                +(theDifferenceInKristinaIncome)+ " рублей");

    }
}