package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import demo.domain.Team;

import java.util.List;

@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team,Long>{
    List<Team> findByName(@Param("name") String name);

}
