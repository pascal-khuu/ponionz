package fr.formation.ponionz.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.ponionz.domain.entities.Lending;

public interface RepositoryLending extends JpaRepository<Lending, Long> {

    Optional<Lending> getById(Long id);

}
