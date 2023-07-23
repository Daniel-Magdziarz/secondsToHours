/*This program overloads a method. It also converts seconds to hours and minutes with seconds
 in the first method and minutes with seconds to hours minutes and seconds in the seconds method*/
//Author: Daniel Magdziarz

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(8274));
        System.out.println(getDurationString(303, 34));

    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Time can not be represented in negative values. Please enter a number greater than 0";
        }
        int minutes = seconds / 60;
        int secondsReminder = seconds % 60;
        int hours = minutes / 60;
        int minutesReminder = minutes % 60;

        System.out.println(getDurationString(minutes, secondsReminder));

        return String.format("%dh %dm %ds%n", hours, minutesReminder, secondsReminder);
    }

    public static String getDurationString(int minutes, int seconds){

        if(minutes < 0 || seconds < 0){
            return "No negative values for time. Please enter positive numbers";
        } else if (seconds > 59){
            return "The value for seconds cannot be greater than 59. Tray again.";
        }

        int hours = minutes / 60;
        int minutesReminder = minutes % 60;

        return String.format("%dh %dm %ds", hours, minutesReminder, seconds);
    }


}
