package kotlintest.com.katapupil.post;

public class Package {

    public String id;
    public Size size;
    public Weight weight;
    public int valueInDollars;
    public ContentType contentType;
    public String sender;
    public String recipient;
    public String address;
    public boolean priority;

    public Package(String id, Size size, Weight weight, int valueInDollars, ContentType contentType, String sender, String recipient, String address, boolean priority) {
        this.id = id;
        this.size = size;
        this.weight = weight;
        this.valueInDollars = valueInDollars;
        this.contentType = contentType;
        this.sender = sender;
        this.recipient = recipient;
        this.address = address;
        this.priority = priority;
    }

    public Package() {
    }
}
