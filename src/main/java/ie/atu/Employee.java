package ie.atu;

public class Employee {
    String name;
    long ppsId;
    String employmentType;
    String gender;
    int Age;

    public Employee(String name, long ppsId, String employmentType, String gender, int age) {
        this.setName(name);
        this.setPpsId(ppsId);
        this.setEmploymentType(employmentType);
        this.setGender(gender);
        this.setAge(Age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPpsId() {
        return ppsId;
    }

    public void setPpsId(long ppsId) {
        this.ppsId = ppsId;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
