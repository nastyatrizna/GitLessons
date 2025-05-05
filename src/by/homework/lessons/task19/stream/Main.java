package by.homework.lessons.task19.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <City> cities = new ArrayList<>();
        cities.add(new City(1, "Minsk", 1900000, Continent.EUROPE));
        cities.add(new City(2, "Tokyo", 13900000, Continent.ASIA));
        cities.add(new City(3, "Lagos", 14900000, Continent.AFRICA));
        cities.add(new City(4, "New York", 8420000, Continent.NORTH_AMERICA));
        cities.add(new City(5, "Rio de Janeiro", 12580000, Continent.SOUTH_AMERICA));
        cities.add(new City(6, "Sydney", 5310000, Continent.AUSTRALIA));
        cities.add(new City(7, "Oslo", 1086000, Continent.EUROPE));
        cities.add(new City(8, "Mumbai", 12480000, Continent.ASIA));
        cities.add(new City(9, "Cairo", 9845000, Continent.AFRICA));
        cities.add(new City(10, "Los Angeles", 3972000, Continent.NORTH_AMERICA));
        cities.add(new City(11, "Buenos Aires", 3075000, Continent.SOUTH_AMERICA));
        cities.add(new City(12, "Melbourne", 4936000, Continent.AUSTRALIA));
        cities.add(new City(13, "Berlin", 3671000, Continent.EUROPE));
        cities.add(new City(14, "Shanghai", 27060000, Continent.ASIA));
        cities.add(new City(15, "Johannesburg", 6000000, Continent.AFRICA));
        cities.add(new City(16, "Mexico City", 9209000, Continent.NORTH_AMERICA));
        cities.add(new City(17, "Brasilia", 6748000, Continent.SOUTH_AMERICA));
        cities.add(new City(18, "Perth", 2100000, Continent.AUSTRALIA));
        cities.add(new City(19, "Rome", 2860000, Continent.EUROPE));
        cities.add(new City(20, "Delhi", 31000000, Continent.ASIA));

        // 1.2.����� ����� �������������� ����� �� ���������� (filter �� ���������� + max)
        for (Continent continent : Continent.values()) {
            Optional<City> mostPopulousCityOnContinent = cities.stream().filter(city -> city.getContinent() == continent).max(Comparator.comparingLong(City::getPopulation));

            mostPopulousCityOnContinent.ifPresent(city -> System.out.println("����� ��������������� ����� � " + continent + ": " + city.getName() + " (" + city.getPopulation() + ")"));
        }

        // 1.3.����� �����, � ����������� ���������� �� ���������� (filter �� ���������� + min)
        for (Continent continent : Continent.values()) {
            Optional<City> leastPopulousCityOnContinent = cities.stream().filter(city -> city.getContinent() == continent).min(Comparator.comparingLong(City::getPopulation));

            leastPopulousCityOnContinent.ifPresent(city -> System.out.println("����� � ����������� ���������� � " + continent + ": " + city.getName() + " (" + city.getPopulation() + ")"));
        }

        // 1.4.����� ����� �������������� ����� (max)
        Optional<City> mostPopulousCity = cities.stream().max(Comparator.comparingLong(City::getPopulation));

        mostPopulousCity.ifPresent(city -> System.out.println("����� ��������������� �����: " + city.getName() + " (" + city.getPopulation() + ")"));

        // 1.5.����� ����� � ����� ��������� ���������� (min)
        Optional<City> leastPopulousCity = cities.stream().min(Comparator.comparingLong(City::getPopulation));

        leastPopulousCity.ifPresent(city -> System.out.println("����� � ����� ��������� ����������: " + city.getName() + " (" + city.getPopulation() + ")"));

        // 1.6.����� ������ ���������� �����, � �������� ��������� ������ 1 ���. (filter + findFirst)
        Optional<City> firstCityOverOneMillion = cities.stream().filter(city -> city.getPopulation() > 1000000).findFirst();

        firstCityOverOneMillion.ifPresent(city -> System.out.println("������ ����� � ���������� ����� 1 ��������: " + city.getName() + " (" + city.getPopulation() + ")"));

        // 1.7.�������� ������ � ���������� ������ 1 ���. (filter)
        List<City> citiesOverOneMillion = cities.stream().filter(city -> city.getPopulation() > 1000000).collect(Collectors.toList());

        System.out.println("������ � ���������� ����� 1 ��������:");
        citiesOverOneMillion.forEach(city -> System.out.println(city.getName() + " (" + city.getPopulation() + ")"));

        // 1.8.������� ��������� �� �������� �������, �� ��������� �������� (map)
        List<String> cityNames = cities.stream().map(City::getName).collect(Collectors.toList());

        System.out.println("�������� �������:");
        cityNames.forEach(System.out::println);

    }
}
