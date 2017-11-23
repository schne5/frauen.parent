package ch.bfh.frauen.repository;

import ch.bfh.frauen.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EventRepository extends CrudRepository<Event,String> {
}
