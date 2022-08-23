package jon.gaprep.model;

import java.util.*;

public class Greeting {

    private String message;
    private Date date;

    private List<String> jokes = new ArrayList<>();
    private Map<String,String> advices = new HashMap<>();

    public Map<String, String> getAdvices() {
        return advices;
    }

    public void setAdvices(Map<String, String> advices) {
        this.advices = advices;
    }

    public List<String> getJokes() {
        return jokes;
    }

    public void setJokes(List<String> jokes) {
        this.jokes = jokes;
    }

    public Greeting(String message, Date date) {
        this.message = message;
        this.date = date;
        jokes.add("Knock knock");
        jokes.add("who's there");
        jokes.add("Jackson");
        jokes.add("Jackson who?");
        jokes.add("Jackson made this JSON");
        advices.put("bored", "sit down and listen");
        advices.put("tired", "relax now, go to bed by 11");

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
