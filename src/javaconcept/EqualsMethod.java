package javaconcept;

import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsMethod {

    private String title;
    private String author;
    private int publicationYear;

    public EqualsMethod(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getters (optional)
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }


    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        EqualsMethod other = (EqualsMethod) obj;

        return this.publicationYear == other.publicationYear
                && Objects.equals(this.title, other.title)
                && Objects.equals(this.author, other.title);
    }


    @Override
    public int hashCode(){
        return Objects.hash(title, author, publicationYear);
    }


    Map<String, String> map = new HashMap<>();
}
