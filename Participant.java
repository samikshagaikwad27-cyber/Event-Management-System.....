import java.util.UUID;
public class Participant {
    private final String id,name,email,phone;
    public Participant(String name,String email,String phone){this.id="P"+UUID.randomUUID().toString().substring(0,8).toUpperCase();this.name=name;this.email=email;this.phone=phone;}
    public String getId(){return id;} public String getName(){return name;} public String getEmail(){return email;} public String getPhone(){return phone;}
    public String toFileLine(){return id+"|"+name+"|"+email+"|"+phone;}
    public String toString(){return id+" - "+name+" ("+email+")";}
}
