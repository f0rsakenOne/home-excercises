package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        final List<String> flights = Files.readAllLines(path, charset);
        List<String> trip = new ArrayList<>();
        while ( true ) {
            System.out.println("""
                    What would you like to do:
                    To display list of the cities press 1
                    To exit program press #""");
            String key = input.nextLine();
            if (key.equals("1")) {
                System.out.println(getStartingLocations(flights));
                System.out.println("To select a city from which you would like to start press 1");
                key = input.nextLine();
                if (key.equals("1")) {
                    System.out.println("Select a city");
                    String city = input.nextLine();
                    final String startingCity = city;
                    do {
                        List<String> citiesYouCanFly = getCitiesYouCanFly(city, flights);
                        System.out.println(citiesYouCanFly);
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
        return flights.stream()
                .map((String str) -> str.split("->")[0])
                .collect(Collectors.toSet());
    }

    private static List<String> getCitiesYouCanFly(String city, List<String> flights) {
        return flights.stream()
                .filter((String x) -> x.split("->")[0].contains(city))
                .toList();
    }

}
