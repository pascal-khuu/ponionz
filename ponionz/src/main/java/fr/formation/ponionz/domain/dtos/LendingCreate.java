package fr.formation.ponionz.domain.dtos;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import fr.formation.ponionz.validation.Contribution;
import fr.formation.ponionz.validation.Coverage;

@Coverage
@Contribution
public class LendingCreate {
    // Field montant -> borrowAmount
    @NotNull
    @Min(100000)
    @Max(600000)
    private int borrowAmount;
    // Field apport -> contribution
    @Min(0)
    private int contribution;
    // Field durée -> Year
    @Min(2)
    @Max(30)
    @NotNull
    private int year;
    // Field taux d'intérêt ->interestRate
    @NotNull
    @DecimalMin(value = "0.01")
    private double interestRate;
    // Field taux d'assurance -> insuranceRate
    @DecimalMin(value = "0.0")
    private double insuranceRate;
    // Field assurance -> perte d'emploi lostJobInsurance true if coverage false if
    // not coverage
    private boolean lostJobInsurance;
    // Couverture -> coverage
    @Min(30)
    @Max(70)
    private int coverage;

    // Constructor
    public LendingCreate() {

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
	return "LendingCreate [borrowAmount=" + borrowAmount + ", contribution=" + contribution + ", year=" + year
		+ ", interestRate=" + interestRate + ", insuranceRate=" + insuranceRate + ", lostJobInsurance="
		+ lostJobInsurance + ", coverage=" + coverage + "]";
    }

}
