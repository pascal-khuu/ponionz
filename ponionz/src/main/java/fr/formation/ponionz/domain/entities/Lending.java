package fr.formation.ponionz.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Table lending in  the database ponionz
@Entity
@Table(name = "lending")
public class Lending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // Field montant -> borrowAmount
    @Column(name = "borrow_amount")
    private int borrowAmount;
    // Field apport -> contribution
    @Column(name = "contribution")
    private int contribution;
    // Field durée -> Year
    @Column(name = "year")
    private int year;
    // Field taux d'intérêt ->interestRate
    @Column(name = "interest_rate")
    private double interestRate;
    // Field taux d'assurance -> insuranceRate
    @Column(name = "insurance_rate")
    private double insuranceRate;
    // Field assurance -> perte d'emploi lostJobInsurance true if coverage false if
    // not coverage
    @Column(name = "lost_job_insurance")
    private boolean lostJobInsurance;
    // Couverture -> coverage
    @Column(name = "coverage")
    private int coverage;

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
	return "Lending [borrowAmount=" + borrowAmount + ", contribution=" + contribution + ", year=" + year
		+ ", interestRate=" + interestRate + ", insuranceRate=" + insuranceRate + ", lostJobInsurance="
		+ lostJobInsurance + ", coverage=" + coverage + "]";
    }

}
