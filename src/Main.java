public class Main {
    public static void main(String[] args) {

        // Task 1
        int i = 1;
        while (i<=10) {
            System.out.print(" " + i);
            i ++;
        }{
            System.out.println("\n");
        }

        for (i =10; i>=1; i--){
            System.out.print(" " + i);
        } {
            System.out.println("\n");
        }

        // Task 2
        int friday = 2;
        for (; friday<=31;friday +=7 ) {
            System.out.println("Сегодня пятница " + friday + "-е число. Пора сдавать отчет.");
        }{
            System.out.println("\n");
        }

        // Task 3
        int currentYear = 2022;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (currentYear = startYear;currentYear<= endYear; currentYear+=79) {
            if (currentYear<2022)
            System.out.println("В " + currentYear + " году пролетала комета.");
           else if (currentYear>= 2022)
             System.out.println("В " + currentYear + " году пролетит комета.");

        }

    }
}