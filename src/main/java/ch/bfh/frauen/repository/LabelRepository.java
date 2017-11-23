package ch.bfh.frauen.repository;

import ch.bfh.frauen.model.Label;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LabelRepository extends CrudRepository<Label,String> {
}
