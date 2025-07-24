package hackerrank.ifelse.javareflection;

public class Student {

    private String name;
    private String id;
    private String email;

    public Student(String name, String email, String id){
        this.name= name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
