package com.company;
public class NumberCheck {
    public static void main(String[] args) {
        int[] numbers = {10, 69, 42, 1442, -12};
        int resultNumber;
        int chosenNumber = Integer.parseInt(args[0]);

        if (chosenNumber <= 5) {
            switch (chosenNumber){
                case 1:
                    resultNumber = numbers[0]%2;
                    if (resultNumber == 0) {
                        System.out.println("Wybrales liczbe kryjaca sie pod numerem '1'. Ta liczba to " +numbers[0] + ". Jest to liczba parzysta");
                    }
                    else {
                        System.out.println("Wybrales liczbe kryjaca sie pod numerem '1'. Ta liczba to " + numbers[0] + ". Liczba jest nieparzysta!");
                    }
                break;
                case 2:
                    resultNumber = numbers[1]%2;
                    if (resultNumber == 0) {
                        System.out.println("Wybrales liczbe kryjaca sie pod numerem '2'. Ta liczba to " +numbers[1] + ". Jest to liczba parzysta");
                    }
                    else {
                        System.out.println("Wybrales liczbe kryjaca sie pod numerem '2'. Ta liczba to " + numbers[1] + ". Liczba jest nieparzysta!");
                    }
                break;
                case 3:
                    resultNumber = numbers[2]%2;
                    if (resultNumber == 0) {
                        System.out.println("Wybrales liczbe kryjaca sie pod numerem '3'. Ta liczba to " +numbers[2] + ". Jest to liczba parzysta");
                    }
                    else {
                        System.out.println("Wybrales liczbe kryjaca sie pod numerem '3'. Ta liczba to " + numbers[2] + ". Liczba jest nieparzysta!");
                    }
                break;
                case 4:
                    resultNumber = numbers[3]%2;
                    if (resultNumber == 0) {
                        System.out.println("Wybrales liczbe kryjaca sie pod numerem '4'. Ta liczba to " +numbers[3] + ". Jest to liczba parzysta");
                    }
                    else {
                        System.out.println("Wybrales liczbe kryjaca sie pod numerem '4'. Ta liczba to " + numbers[3] + ". Liczba jest nieparzysta!");
                    }
                break;
                case 5:
                    resultNumber = numbers[4]%2;
                    if (resultNumber == 0) {
                        System.out.println("Wybrales liczbe kryjaca sie pod numerem '5'. Ta liczba to " +numbers[4] + ". Jest to liczba parzysta");
                    }
                    else {
                        System.out.println("Wybrales liczbe kryjaca sie pod numerem '5'. Ta liczba to " + numbers[4] + ". Liczba jest nieparzysta!");
                    }
                break;
            }
        }
        else {
            System.out.println("Wpisałeś liczbę spoza zakresu (1-5), lub Twój input nie jest liczbą!");
        }
    }
}
