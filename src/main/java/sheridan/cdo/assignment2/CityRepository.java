//Andrew Do
//Programming Assignment 2
//Prog27545 Web Application Design and Implementation
//Last edited 2026-02-12

package sheridan.cdo.assignment2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;


@RepositoryRestResource
public interface CityRepository extends JpaRepository<City, String> {

    // Searches the H2 database for cities that match the given name and outputs the result to the resfful API
    List<City> findByName(String name);

    // Searches the H2 database for cities that match the given country and outputs the result to the resfful API
    List<City> findByCountry(String country);

    // Searches the H2 database for cities with a population greater than the given value and outputs the result to the resfful API
    List<City> findByPopulationGreaterThan(long population);

    // Searches the H2 database for cities with a population less than the given value and outputs the result to the resfful API
    List<City> findByPopulationLessThan(long population);

    // Searches the H2 database for cities with a population between the two given values and outputs the result to the resfful API
    List<City> findByPopulationBetween(long low, long high);
}