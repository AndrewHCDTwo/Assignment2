package sheridan.cdo.assignment2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;


@RepositoryRestResource
public interface CityRepository extends JpaRepository<City, String> {

    List<City> findByName(String name);
}