package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> flights = Files.readAllLines(path, charset);

        while ( true ) {
            System.out.println("What would you like to do:\n" +
                    "To display list of the cities press 1\n" +
                    "To exit program press #");
            String key = input.nextLine();
            if (key.equals("1")) {
                System.out.println(getStartingLocations(flights));
                System.out.println("To select a city from which you would like to start press 1");
                key = input.nextLine();
                if (key.equals("1")) {
                    List<String> trip = new ArrayList<>();
                    System.out.println("Select a city");
                    String city = input.nextLine();
                    String startingCity = city;
                    do {
                        System.out.println(getCities(city, flights));
                        System.out.println("Select a city you want to flight to");
                        String nextCity = input.nextLine();
                        trip.add(city + " -> " + nextCity);
                        city = nextCity;
                    }
                    while ( !Objects.equals(city, startingCity) );
                    System.out.println("Your trip is : " + trip);
                }
            } else {
                break;
            }
        }

    }

    private static Set<String> getStartingLocations(List<String> flights) {
        Set<String> starting = new HashSet<>();
        for (String i : flights) {
            starting.add(i.split("->")[0]);
        }
        return starting;
    }

    private static List<String> getCities(String city, List<String> flights) {
        List<String> cityFlights = new ArrayList<>();
        for (String i : flights) {
            if (i.split("->")[0].contains(city)) {
                cityFlights.add(i);
            }
        }
        return cityFlights;
    }
}
