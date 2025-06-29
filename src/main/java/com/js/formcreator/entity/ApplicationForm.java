package com.js.formcreator.entity;

public class ApplicationForm {

    private Long id;
    private PersonalDetails personalDetails;
    private IdentityDetails identityDetails;
    private EducationDetails educationDetails;
    private ProfessionalDetails professionalDetails;
    private ContactDetails contactDetails;
    private Additionalnfo additionalnfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public IdentityDetails getIdentityDetails() {
        return identityDetails;
    }

    public void setIdentityDetails(IdentityDetails identityDetails) {
        this.identityDetails = identityDetails;
    }

    public EducationDetails getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(EducationDetails educationDetails) {
        this.educationDetails = educationDetails;
    }

    public ProfessionalDetails getProfessionalDetails() {
        return professionalDetails;
    }

    public void setProfessionalDetails(ProfessionalDetails professionalDetails) {
        this.professionalDetails = professionalDetails;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Additionalnfo getAdditionalnfo() {
        return additionalnfo;
    }

    public void setAdditionalnfo(Additionalnfo additionalnfo) {
        this.additionalnfo = additionalnfo;
    }

}
