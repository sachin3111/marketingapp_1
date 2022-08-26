package zohocrmapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import zohocrmapp.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
