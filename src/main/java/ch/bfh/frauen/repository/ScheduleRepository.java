package ch.bfh.frauen.repository;

import ch.bfh.frauen.model.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ScheduleRepository extends CrudRepository<Schedule,String> {
}
