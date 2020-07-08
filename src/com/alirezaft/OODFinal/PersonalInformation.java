package com.alirezaft.OODFinal;

public class PersonalInformation {
    private String Name;
    private Gender gender;
    private String DateofBirth;

    public PersonalInformation(String name, Gender gender, String BirthDate){
        Name = name;
        this.gender = gender;
        DateofBirth = BirthDate;
    }

    public String getName() {
        return Name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: " + Name + "\n");
        sb.append("Gender: " + gender.toString() + "\n");
        sb.append("Date of birth: " + DateofBirth);

        return sb.toString();
    }
}


