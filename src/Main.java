import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int total = 0;
        Scanner in = new Scanner(System.in);
        int month = SafeInput.getRangedInt(in, "Enter your birth month ", 12, 1);
        int year = SafeInput.getRangedInt(in, "Enter your birth year ", 2010, 1950);
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                total = 31;
                break;
            case 2:
                total = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                total = 30;
                break;
        }
        int day = SafeInput.getRangedInt(in, "Enter your birth day ", total, 1);
        int hours = SafeInput.getRangedInt(in, "Enter your birth time [hours] ", 24, 1);
        int minutes = SafeInput.getRangedInt(in, "Enter your birth time [minutes] ", 59, 1);
        System.out.println("You were born on " + month + "/" + day + "/" + year);
        System.out.println("Time of Birth: " + hours + ":" + minutes);
    }

}