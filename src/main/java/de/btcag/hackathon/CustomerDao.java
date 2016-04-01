package de.btcag.hackathon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerDao extends JpaRepository<Customer,Long> {
}
