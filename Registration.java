import java.util.UUID;
public class Registration { private final String id,participantId,eventId; public Registration(String participantId,String eventId){this.id="R"+UUID.randomUUID().toString().substring(0,8).toUpperCase();this.participantId=participantId;this.eventId=eventId;} public String getId(){return id;} public String toFileLine(){return id+"|"+participantId+"|"+eventId;} }
