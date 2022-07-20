public class Main {
    public static void main(String[] args) {

        // Task 1
        int i = 1;
        while (i<=10) {
            System.out.print(i + " ");
            i ++;
        }{
            System.out.println();
        }

        for (i =10; i>=1; i--){
            System.out.print(i + " ");
        } {
            System.out.println();
        }

        // Task 2

        for (int friday = 2; friday<=31;friday +=7 ) {
            System.out.println("Сегодня пятница " + friday + "-е число. Пора сдавать отчет.");
        }{
            System.out.println();
        }

        // Task 3
        int currentYear = 2022;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year<= endYear; year ++) {
            if (year%79 == 0 && year<2022) {
                System.out.println("В " + year + " году пролетала комета.");
            } else if (year % 79 == 0 && year >= 2022){
                System.out.println("В " + year + " году пролетит комета.");
            }
        }
    }
}