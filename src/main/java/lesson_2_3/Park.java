package lesson_2_3;

import java.util.ArrayList;
import java.util.List;

public class Park {
    String parkName;
    List<Attraction> attractionsList = new ArrayList<>();

    public Park(String parkName) {
        this.parkName = parkName;
    }

    class Attraction {
        String attractionName;
        String workingHours;
        double cost;

        public Attraction(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost + " руб.");
            System.out.println("---");
        }
    }

    public void addAttraction(String name, String hours, double cost) {
        Attraction newAttraction = new Attraction(name, hours, cost);
        attractionsList.add(newAttraction);
    }

    public void printParkInfo() {
        System.out.println("=== Парк: " + parkName + " ===");
        for (Attraction attraction : attractionsList) {
            attraction.printAttractionInfo();
        }
    }
}