package io.mcore.myapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import io.mcore.myapp.model.Customer;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByFirstName(@Param("name")String firstName);

	public List<Customer> findByLastName(@Param("lastname")String lastName);
	
	@Override
	@RestResource(exported = false)
	//Avoid Expose DELETE verb
	public void delete(Customer t);

}