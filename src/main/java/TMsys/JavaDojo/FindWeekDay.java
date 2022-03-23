package TmSys.JavaDojo;

public class FindWeekDay {

    private static final String[] weekDays = {"Saturday", "Sunday", "Monday","Tuesday", "Wednesday", "Thursday","Friday"};

    public static String findDay(int month, int day, int year) {

        if (month == 1 || month == 2){
            year--;
            month += 12;
        }
Integer.parseInt("200");

        int weekDay = (day + (2*month) + Math.round(((3*(month+1))/5)) + year + Math.round(year/4) - Math.round(year/100) + Math.round(year/400) + 2) % 7;

        return weekDays[weekDay].toUpperCase();
    }
}