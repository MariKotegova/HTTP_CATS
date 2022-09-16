import com.fasterxml.jackson.annotation.JsonProperty;

public class CatsJson {
    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;

    // анотация показывает откуда брать какой параметр
    public CatsJson(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "id : " + id + " \n" +
                "text : " + text + " \n" +
                "type : " + type + " \n" +
                "user : " + user + " \n" +
                "upvotes : " + upvotes + " \n";
    }

    public Integer getUpvotes() {
        return upvotes;
    }
}
