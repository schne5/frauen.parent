package ch.bfh.frauen.repository;

import ch.bfh.frauen.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LocationRepository  extends CrudRepository<Location,String> {
}
