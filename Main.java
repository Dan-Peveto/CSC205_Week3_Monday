package CSC205_Week3_Monday;
/**
 * Main
 */
public class Main {

    
    public static void main(String[] args) {
        SeasonsLogig();

        Student student1 = new Student();
        student1.FirstName = "Kurt";
        student1.LastName = "Vonnegut";
        student1.GPA = 4.0f;
        student1.Major = Major.ART; 
        System.out.println(student1.FirstName);
    }
    public static void SeasonsLogig() {
        Seasons seasons = Seasons.SPRING; 

        if(seasons == Seasons.SPRING) {
            System.out.println("This is my favorite season!");
        } else if(seasons == Seasons.FALL) {
            System.out.println("I love fall");
        } else {
            System.out.println("Yea this one is okay I guess");
        }
    }
}