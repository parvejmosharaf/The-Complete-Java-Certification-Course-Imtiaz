package java_imtiaz.basic_java;

public class ControlFlow {
    public static void main(String[] args) {
        boolean hungry = true;
        if(hungry){
            System.out.println("hungry.");
        }else{
            System.out.println("I am not hungry.");
        }

        int hungerRating = 5;
        if(!(hungerRating < 6)){
            System.out.println("Not hungry!");
        }else{
            System.out.println("I'm starving...");
        }

        int favoriteTemp = 75;
        int currentTemp = 100;
        String opinion;

        if(currentTemp < favoriteTemp - 30){
            opinion = "It's Pretty darn Cold";
        }
        else if(currentTemp < favoriteTemp - 20){
            opinion = "It's kinda cold out...";
        }
        else if(currentTemp > favoriteTemp + 10){
            opinion = "It's too hot!";
        }
        else {
            opinion = "It's a beautiful day.";
        }
        System.out.println(opinion);

        int month = 3;
        String monthString;

        switch (month){
            case 1: monthString = "January";
            break;
            case 2: monthString = "feb";
            break;
            case 3: monthString = "march";
            break;
            case 4: monthString = "april";
            break;
            default: monthString = "not valid!";
        }
        System.out.println(monthString);

    }
}
