package sce.cz2002.cj.first;

enum Gender {Female, Male, NonBinary};


/**
 * This class shows the staff name, job title, gender and employeeID
 *
 */


public class Staff {
    private String name, jobTitle;
    private Gender gender;
    private int employeeID;

    public Staff(String name, String jobTitle, Gender gender, int employeeID){
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.employeeID = employeeID;
    }

    /*
    Method retrieves the name of the staff
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}
