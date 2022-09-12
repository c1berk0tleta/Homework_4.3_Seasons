import java.util.Locale;
public class Main {
        public static void main(String[] args) {
            for (Seasons season : Seasons.values()) printInfo(season);
            System.out.print("Моё любимое время года: ");
            printInfo(Seasons.valueOf("Winter"));
        }

        public static void printInfo(Seasons season) {
            System.out.printf("%s %s, ", season.name(), season);
            season.getDescription();
        }
    }

