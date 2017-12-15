package com.squadra.Helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.squadra.Helpdesk.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
