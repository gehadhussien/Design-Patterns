package travelsystem;

import java.util.Scanner;

public class Survey {

    String ans1;
    String ans2;
    String ans3;
    String ans4;
    String ans5;
    String arrOfAnsw[] = new String[5];
    Scanner sc = new Scanner(System.in);

    public Survey() {
        System.out.println("Which Continent you prefer? ");
        System.out.println("A)Africa   B)Asia   C)North America   D)Europe  ");
        ans1 = sc.next();
        ans1.toLowerCase();

        System.out.println("Do you prefer Countryside or Downtown");
        System.out.println("A)Countryside   B)Downtown  ");
        ans2 = sc.next();
        ans2.toLowerCase();

        System.out.println("Your travel budget is ");
        System.out.println("A)Very small budget (less than 500)    B)Small budget (between 500 and 1500)   C)Large budget (between 2500 and 4000)");
        ans3 = sc.next();
        ans3.toLowerCase();

        System.out.println("How old are you ");
        System.out.println("A)18-25    B)26-35   C)36-45 ");
        ans4 = sc.next();
        ans4.toLowerCase();

        System.out.println("What are your most important needs ?");
        System.out.println("A)Quality and comfort    B)Security   C)Competitive prices ");
        ans5 = sc.next();
        ans5.toLowerCase();

        arrOfAnsw[0] = ans1;
        arrOfAnsw[1] = ans2;
        arrOfAnsw[2] = ans3;
        arrOfAnsw[3] = ans4;
        arrOfAnsw[4] = ans5;

        if (arrOfAnsw[0] == "a" && arrOfAnsw[1] == "a" && arrOfAnsw[2] == "a" && arrOfAnsw[3] == "a" && arrOfAnsw[4] == "a") {
            System.out.println("We Reccomend \033[0;5m Baobab Resort  ");

        } else if (arrOfAnsw[0] == "a" && arrOfAnsw[1] == "b" && arrOfAnsw[2] == "b" && arrOfAnsw[3] == "b" && arrOfAnsw[4] == "b") {
            System.out.println("We Reccomend \033[0;5m Eko Hotels & Suites  ");

        } else if (arrOfAnsw[0] == "a" && arrOfAnsw[1] == "b" && arrOfAnsw[2] == "c" && arrOfAnsw[3] == "c" && arrOfAnsw[4] == "c") {
            System.out.println("We Reccomend \033[0;5m Transcorp Hilton Abuja ");

        } else if (arrOfAnsw[0] == "b" && arrOfAnsw[1] == "a" && arrOfAnsw[2] == "a" && arrOfAnsw[3] == "c" && arrOfAnsw[4] == "a") {
            System.out.println("We Reccomend \033[0;5m Shangri-La's Mactan Resort and Spa, Cebu ");

        } else if (arrOfAnsw[0] == "b" && arrOfAnsw[1] == "b" && arrOfAnsw[2] == "b" && arrOfAnsw[3] == "b" && arrOfAnsw[4] == "b") {
            System.out.println("We Reccomend \033[0;5m Aqua Blue Water Park  ");

        } else if (arrOfAnsw[0] == "b" && arrOfAnsw[1] == "b" && arrOfAnsw[2] == "c" && arrOfAnsw[3] == "c" && arrOfAnsw[4] == "c") {
            System.out.println("We Reccomend \033[0;5m Pullman Zamzam Makkah ");

        } else if (arrOfAnsw[0] == "c" && arrOfAnsw[1] == "b" && arrOfAnsw[2] == "c" && arrOfAnsw[3] == "c" && arrOfAnsw[4] == "c") {
            System.out.println("We Reccomend \033[0;5m Pullman Zamzam Makkah ");

        }  else if (arrOfAnsw[0] == "c" && arrOfAnsw[1] == "a" && arrOfAnsw[2] == "a" && arrOfAnsw[3] == "a" && arrOfAnsw[4] == "a") {
            System.out.println("We Reccomend \033[0;5m  Barceló Maya Tropical ");

        }else if (arrOfAnsw[0] == "c" && arrOfAnsw[1] == "b" && arrOfAnsw[2] == "b" && arrOfAnsw[3] == "b" && arrOfAnsw[4] == "b") {
            System.out.println("We Reccomend \033[0;5m Hotel Riu Plaza New York Times Square ");

        }else if (arrOfAnsw[0] == "c" && arrOfAnsw[1] == "b" && arrOfAnsw[2] == "a" && arrOfAnsw[3] == "a" && arrOfAnsw[4] == "b") {
            System.out.println("We Reccomend \033[0;5m Fairmont Château Lake Louise");

        }
    }
}
