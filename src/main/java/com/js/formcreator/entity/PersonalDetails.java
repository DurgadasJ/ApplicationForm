package com.js.formcreator.entity;

public class PersonalDetails {

    private String name;

    private String gender;

    private String dateOfBirth;

    private String nationality;

    private String maritalStatus;

    public String getName(){
       return name;
    }

    public void setName(String name){
      this.name = name;
    }

    public String getGender(){
      return gender;
    }

    public void setGender(String gender){
         this.gender=gender;
    }

    public String getDateOfBirth(){
      return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
         this.dateOfBirth=dateOfBirth;
    }

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality=nationality;
    }

    public String getMaritalStatus(){
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

}

