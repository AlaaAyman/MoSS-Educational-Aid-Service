package com.myspace.moss;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "applications")
public class Application
		extends
			org.drools.persistence.jpa.marshaller.VariableEntity
		implements
			java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Applicant Name")
	private java.lang.String applicantName;
	@org.kie.api.definition.type.Label("Phone Number")
	private java.lang.String phoneNumber;
	@org.kie.api.definition.type.Label("Applicant Type")
	private java.lang.String applicantType;
	@org.kie.api.definition.type.Label("Association Name")
	private java.lang.String associationName;
	@org.kie.api.definition.type.Label("Association Address")
	private java.lang.String associationAddress;
	@org.kie.api.definition.type.Label("Chairman of Board of Directors")
	private java.lang.String associationDirectorName;
	@org.kie.api.definition.type.Label("Orphanage Name")
	private java.lang.String orphanageName;
	@org.kie.api.definition.type.Label("Directorate")
	private java.lang.String directorate;
	@org.kie.api.definition.type.Label("Administration")
	private java.lang.String administration;
	@org.kie.api.definition.type.Label("District")
	private java.lang.String district;
	@org.kie.api.definition.type.Label("Orphanage Address")
	private java.lang.String orphanageAddress;
	@org.kie.api.definition.type.Label("Orphanage Director")
	private java.lang.String orphanageDirector;
	@org.kie.api.definition.type.Label("Director Phone Number")
	private java.lang.String orphanageDirectorPhoneNumber;
	@org.kie.api.definition.type.Label("Child Name")
	private java.lang.String childName;
	@org.kie.api.definition.type.Label("National ID")
	private java.lang.String nationalId;
	@org.kie.api.definition.type.Label("Gender")
	private java.lang.String childGender;
	@org.kie.api.definition.type.Label("Child Lineage")
	private java.lang.String childLineage;
	@org.kie.api.definition.type.Label("Date of birth")
	private java.util.Date dateOfBirth;
	@org.kie.api.definition.type.Label("Educational Level")
	private java.lang.String educationalLevel;
	@org.kie.api.definition.type.Label("Registration status")
	private java.lang.String registrationStatus;
	@org.kie.api.definition.type.Label("Type of education")
	private java.lang.String typeOfEducation;
	@org.kie.api.definition.type.Label("Educational Aid Type")
	private java.lang.String aidType;
	@org.kie.api.definition.type.Label("Aid Description")
	private java.lang.String aidDescription;
	@org.kie.api.definition.type.Label("Requested Aid Value")
	private java.lang.Double aidValue;

	@org.kie.api.definition.type.Label("Bank Account No.")
	private java.lang.String bankAccountNo;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "APPLICATION_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "APPLICATION_ID_SEQ", name = "APPLICATION_ID_GENERATOR")
	private java.lang.Long id;

	public Application() {
	}

	public java.lang.String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(java.lang.String applicantName) {
		this.applicantName = applicantName;
	}

	public java.lang.String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(java.lang.String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public java.lang.String getApplicantType() {
		return this.applicantType;
	}

	public void setApplicantType(java.lang.String applicantType) {
		this.applicantType = applicantType;
	}

	public java.lang.String getAssociationName() {
		return this.associationName;
	}

	public void setAssociationName(java.lang.String associationName) {
		this.associationName = associationName;
	}

	public java.lang.String getAssociationAddress() {
		return this.associationAddress;
	}

	public void setAssociationAddress(java.lang.String associationAddress) {
		this.associationAddress = associationAddress;
	}

	public java.lang.String getAssociationDirectorName() {
		return this.associationDirectorName;
	}

	public void setAssociationDirectorName(
			java.lang.String associationDirectorName) {
		this.associationDirectorName = associationDirectorName;
	}

	public java.lang.String getOrphanageName() {
		return this.orphanageName;
	}

	public void setOrphanageName(java.lang.String orphanageName) {
		this.orphanageName = orphanageName;
	}

	public java.lang.String getDirectorate() {
		return this.directorate;
	}

	public void setDirectorate(java.lang.String directorate) {
		this.directorate = directorate;
	}

	public java.lang.String getAdministration() {
		return this.administration;
	}

	public void setAdministration(java.lang.String administration) {
		this.administration = administration;
	}

	public java.lang.String getDistrict() {
		return this.district;
	}

	public void setDistrict(java.lang.String district) {
		this.district = district;
	}

	public java.lang.String getOrphanageAddress() {
		return this.orphanageAddress;
	}

	public void setOrphanageAddress(java.lang.String orphanageAddress) {
		this.orphanageAddress = orphanageAddress;
	}

	public java.lang.String getOrphanageDirector() {
		return this.orphanageDirector;
	}

	public void setOrphanageDirector(java.lang.String orphanageDirector) {
		this.orphanageDirector = orphanageDirector;
	}

	public java.lang.String getOrphanageDirectorPhoneNumber() {
		return this.orphanageDirectorPhoneNumber;
	}

	public void setOrphanageDirectorPhoneNumber(
			java.lang.String orphanageDirectorPhoneNumber) {
		this.orphanageDirectorPhoneNumber = orphanageDirectorPhoneNumber;
	}

	public java.lang.String getChildName() {
		return this.childName;
	}

	public void setChildName(java.lang.String childName) {
		this.childName = childName;
	}

	public java.lang.String getNationalId() {
		return this.nationalId;
	}

	public void setNationalId(java.lang.String nationalId) {
		this.nationalId = nationalId;
	}

	public java.lang.String getChildGender() {
		return this.childGender;
	}

	public void setChildGender(java.lang.String childGender) {
		this.childGender = childGender;
	}

	public java.lang.String getChildLineage() {
		return this.childLineage;
	}

	public void setChildLineage(java.lang.String childLineage) {
		this.childLineage = childLineage;
	}

	public java.util.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public java.lang.String getEducationalLevel() {
		return this.educationalLevel;
	}

	public void setEducationalLevel(java.lang.String educationalLevel) {
		this.educationalLevel = educationalLevel;
	}

	public java.lang.String getRegistrationStatus() {
		return this.registrationStatus;
	}

	public void setRegistrationStatus(java.lang.String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public java.lang.String getTypeOfEducation() {
		return this.typeOfEducation;
	}

	public void setTypeOfEducation(java.lang.String typeOfEducation) {
		this.typeOfEducation = typeOfEducation;
	}

	public java.lang.String getAidType() {
		return this.aidType;
	}

	public void setAidType(java.lang.String aidType) {
		this.aidType = aidType;
	}

	public java.lang.String getAidDescription() {
		return this.aidDescription;
	}

	public void setAidDescription(java.lang.String aidDescription) {
		this.aidDescription = aidDescription;
	}

	public java.lang.Double getAidValue() {
		return this.aidValue;
	}

	public void setAidValue(java.lang.Double aidValue) {
		this.aidValue = aidValue;
	}

	public java.lang.String getBankAccountNo() {
		return this.bankAccountNo;
	}

	public void setBankAccountNo(java.lang.String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public Application(java.lang.String applicantName,
			java.lang.String phoneNumber, java.lang.String applicantType,
			java.lang.String associationName,
			java.lang.String associationAddress,
			java.lang.String associationDirectorName,
			java.lang.String orphanageName, java.lang.String directorate,
			java.lang.String administration, java.lang.String district,
			java.lang.String orphanageAddress,
			java.lang.String orphanageDirector,
			java.lang.String orphanageDirectorPhoneNumber,
			java.lang.String childName, java.lang.String nationalId,
			java.lang.String childGender, java.lang.String childLineage,
			java.util.Date dateOfBirth, java.lang.String educationalLevel,
			java.lang.String registrationStatus,
			java.lang.String typeOfEducation, java.lang.String aidType,
			java.lang.String aidDescription, java.lang.Double aidValue,
			java.lang.String bankAccountNo, java.lang.Long id) {
		this.applicantName = applicantName;
		this.phoneNumber = phoneNumber;
		this.applicantType = applicantType;
		this.associationName = associationName;
		this.associationAddress = associationAddress;
		this.associationDirectorName = associationDirectorName;
		this.orphanageName = orphanageName;
		this.directorate = directorate;
		this.administration = administration;
		this.district = district;
		this.orphanageAddress = orphanageAddress;
		this.orphanageDirector = orphanageDirector;
		this.orphanageDirectorPhoneNumber = orphanageDirectorPhoneNumber;
		this.childName = childName;
		this.nationalId = nationalId;
		this.childGender = childGender;
		this.childLineage = childLineage;
		this.dateOfBirth = dateOfBirth;
		this.educationalLevel = educationalLevel;
		this.registrationStatus = registrationStatus;
		this.typeOfEducation = typeOfEducation;
		this.aidType = aidType;
		this.aidDescription = aidDescription;
		this.aidValue = aidValue;
		this.bankAccountNo = bankAccountNo;
		this.id = id;
	}

}