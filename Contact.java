public class Contact {
    private String name;
    private String email;
    private String extraInfo;

    public Contact(String name, String email, String extraInfo) {
        this.name = name;
        this.email = email;
        this.extraInfo = extraInfo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    @Override
    public String toString() {
        return "Contact{name='" + name + "', email='" + email + "', extra='" + extraInfo + "'}";
    }
}
