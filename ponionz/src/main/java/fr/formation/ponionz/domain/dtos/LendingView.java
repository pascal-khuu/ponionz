package fr.formation.ponionz.domain.dtos;

// View of Lending
public class LendingView {
    // Field montant -> borrowAmount
    private int borrowAmount;
    // Field apport -> contribution

    private int contribution;
    // Field durée -> Year
    private int year;
    // Field taux d'intérêt ->interestRate
    private double interestRate;
    // Field taux d'assurance -> insuranceRate
    private double insuranceRate;
    // Field assurance -> lostJobInsurance true if there is a coverage
    // otherwise lostJobInsurance false if there is not a coverage
    private boolean lostJobInsurance;
    // Couverture -> coverage
    private int coverage;

    // Constructor
    public LendingView() {

    }

    // Getters & Setters
    public int getBorrowAmount() {
	return borrowAmount;
    }

    public void setBorrowAmount(int borrowAmount) {
	this.borrowAmount = borrowAmount;
    }

    public int getContribution() {
	return contribution;
    }

    public void setContribution(int contribution) {
	this.contribution = contribution;
    }

    public int getYear() {
	return year;
    }

    public void setYear(int year) {
	this.year = year;
    }

    public double getInterestRate() {
	return interestRate;
    }

    public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
    }

    public double getInsuranceRate() {
	return insuranceRate;
    }

    public void setInsuranceRate(double insuranceRate) {
	this.insuranceRate = insuranceRate;
    }

    public boolean isLostJobInsurance() {
	return lostJobInsurance;
    }

    public void setLostJobInsurance(boolean lostJobInsurance) {
	this.lostJobInsurance = lostJobInsurance;
    }

    public int getCoverage() {
	return coverage;
    }

    public void setCoverage(int coverage) {
	this.coverage = coverage;
    }

    @Override
    public String toString() {
	return "ServiceLendingView [borrowAmount=" + borrowAmount + ", contribution=" + contribution + ", year=" + year
		+ ", interestRate=" + interestRate + ", insuranceRate=" + insuranceRate + ", lostJobInsurance="
		+ lostJobInsurance + ", coverage=" + coverage + "]";
    }

}
