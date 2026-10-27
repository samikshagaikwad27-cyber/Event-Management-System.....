import java.util.*;
public class FeedbackManager { private final List<Feedback> feedback=new ArrayList<>(); public void add(Feedback f){feedback.add(f);} public List<Feedback> getAll(){return Collections.unmodifiableList(feedback);} }
