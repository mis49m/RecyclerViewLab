package tr.com.mis49m.recyclerviewlab;

public class Contact {

    String name;
    String phone;
    String eMail;
    String color;
    boolean isChecked;

    public Contact(String name, String color, String phone, String eMail, boolean isChecked) {
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
        this.color = color;
        this.isChecked = isChecked;
    }

}
