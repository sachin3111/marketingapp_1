package zohocrmapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import zohocrmapp.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
