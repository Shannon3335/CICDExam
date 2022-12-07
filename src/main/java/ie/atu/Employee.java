package ie.atu;

public class Employee {
    String name;
    long ppsId;
    String employmentType;
    String gender;
    int age;

    public static void main(String[] args) {

    }
    public Employee(String name, long ppsId, String employmentType, String gender, int age) {
        this.setName(name);
        this.setPpsId(ppsId);
        this.setEmploymentType(employmentType);
        this.setGender(gender);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<3 || name.length()>25)
        {
            throw new IllegalArgumentException("Name must be 3 to 25 character long");
        }
        else
        {
            this.name = name;
        }

    }

    public long getPpsId() {
        return ppsId;
    }

    public void setPpsId(long ppsId) {
        if(Long.toString(ppsId).length() == 11) {
            this.ppsId = ppsId;
        }
        else{
            throw new IllegalArgumentException("PPSId must be 11 digits");
        }
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        if(employmentType.equals("Full-time") || employmentType .equals("Part-time") || employmentType.equals("Contract")){
            this.employmentType = employmentType;
        }
        else{
            throw new IllegalArgumentException("Invalid Employment Type");
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        if(gender.equals("Man") || gender.equals("Woman") || gender.equals("Non-Binary")) {
            this.gender = gender;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Gender");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {

        if(16<age && age<66) {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("Age must be over 16 and below 66");
        }
    }
}
