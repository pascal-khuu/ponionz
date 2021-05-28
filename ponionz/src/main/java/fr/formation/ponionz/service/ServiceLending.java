package fr.formation.ponionz.service;

import fr.formation.ponionz.domain.dtos.LendingCreate;
import fr.formation.ponionz.domain.dtos.LendingView;

// service
public interface ServiceLending {

    void createLending(LendingCreate dto);

    LendingView GetLendingById(Long id);

}
