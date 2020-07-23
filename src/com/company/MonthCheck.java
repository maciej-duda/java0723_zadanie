package com.company;

import java.util.Scanner;

public class MonthCheck {

    public static void main(String[] args) {
        System.out.println("Podaj numer miesiąca z zakresu 1-12");
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();

        switch(month){
            case "1":
                System.out.println("Wybrany miesiąc to styczeń");
                break;
            case "2":
                System.out.println("Wybrany miesiąc to luty");
                break;
            case "3":
                System.out.println("Wybrany miesiąc to marzec");
                break;
            case "4":
                System.out.println("Wybrany miesiąc to kwiecień");
                break;
            case "5":
                System.out.println("Wybrany miesiąc to maj");
                break;
            case "6":
                System.out.println("Wybrany miesiąc to czerwiec");
                break;
            case "7":
                System.out.println("Wybrany miesiąc to lipiec");
                break;
            case "8":
                System.out.println("Wybrany miesiąc to sierpień");
                break;
            case "9":
                System.out.println("Wybrany miesiąc to wrzesień");
                break;
            case "10":
                System.out.println("Wybrany miesiąc to październik");
                break;
            case "11":
                System.out.println("Wybrany miesiąc to listopad");
                break;
            case "12":
                System.out.println("Wybrany miesiąc to grudzień");
                break;
            default:
                System.out.println(month + " to nie jest numer miesiąca!");
                break;

        }
    }

    }

