import java.util.*;
public class RegistrationManager { private final List<Registration> items=new ArrayList<>(); public void add(Registration r){items.add(r);} public List<Registration> getAll(){return Collections.unmodifiableList(items);} }
