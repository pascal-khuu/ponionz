package fr.formation.ponionz.service;

import org.springframework.stereotype.Service;

import fr.formation.ponionz.domain.dtos.LendingCreate;
import fr.formation.ponionz.domain.dtos.LendingView;
import fr.formation.ponionz.domain.entities.Lending;
import fr.formation.ponionz.repositories.RepositoryLending;

// implementation of service ServiceLending
@Service
public class ServiceLendingImpl implements ServiceLending {

    private final RepositoryLending repository;

    public ServiceLendingImpl(RepositoryLending repository) {
	this.repository = repository;
    }

    // Create lending in the database ponionz
    @Override
    public void createLending(LendingCreate dto) {
	Lending entity = new Lending();
	entity.setBorrowAmount(dto.getBorrowAmount());
	entity.setContribution(dto.getContribution());
	entity.setYear(dto.getYear());
	entity.setInsuranceRate(dto.getInsuranceRate());
	entity.setInterestRate(dto.getInterestRate());
	entity.setLostJobInsurance(dto.isLostJobInsurance());
	entity.setCoverage(dto.getCoverage());
	repository.save(entity);

    }

    // Select * from Lending where id=
    // in the database ponionz
    @Override
    public LendingView GetLendingById(Long id) {
	Lending entity = repository.getById(id).get();
	LendingView view = new LendingView();
	view.setBorrowAmount(entity.getBorrowAmount());
	view.setContribution(view.getContribution());
	view.setYear(entity.getYear());
	view.setInsuranceRate(entity.getInsuranceRate());
	view.setInterestRate(entity.getInterestRate());
	view.setLostJobInsurance(entity.isLostJobInsurance());
	view.setCoverage(entity.getCoverage());
	return view;
    }

}
