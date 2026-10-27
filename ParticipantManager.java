import java.util.*;
public class ParticipantManager {
    private final List<Participant> participants=new ArrayList<>();
    public void add(Participant p){participants.add(p);} public List<Participant> getAll(){return Collections.unmodifiableList(participants);}
    public Participant findByEmail(String email){for(Participant p:participants)if(p.getEmail().equalsIgnoreCase(email))return p;return null;}
}
