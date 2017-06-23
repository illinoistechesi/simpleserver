import org.json.simple.JSONObject;

public class Patient {
    
    private String name;

    Patient(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
}