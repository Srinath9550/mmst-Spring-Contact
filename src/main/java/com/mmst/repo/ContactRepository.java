package com.mmst.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mmst.model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}