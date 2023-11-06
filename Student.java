package CSC205_Week3_Monday;

public class Student {
    private String FirstName, LastName;

    public String getFirstName() {
        return FirstName;
    }
    public void SetFirstName(String NewName) {
        FirstName = NewName.toLowerCase();
    }
    public String getLastName() {
        return LastName;
    }
    public void SetLastName(String NewName) {
        LastName = NewName.toUpperCase();
    }
    float GPA;
    Major Major;
    boolean isVeteran;
}
