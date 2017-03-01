package tr.com.mis49m.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeData();

    }

    private void initializeData() {
        contactList = new ArrayList<>();
        contactList.add(new Contact("Marc-Andre ter Stegen", "#33b5e5", "+34 987654321", "terstegen@fcb.com", false));
        contactList.add(new Contact("Luis Suares", "#ffbb33", "+34 987654321", "suares@fcb.com", false));
        contactList.add(new Contact("Jordi Alba", "#ff4444", "+34 123456789", "alba@fcb.com", false));
        contactList.add(new Contact("Lionel Messi", "#99cc00", "+34 123456789", "messi@fcb.com", false));
        contactList.add(new Contact("Neymar", "#33b5e5", "+34 987654321", "neymar@fcb.com", false));
        contactList.add(new Contact("Javier Mascherano", "#ffbb33", "+34 123456789", "mascherano@fcb.com", false));
        contactList.add(new Contact("Andres Iniesta", "#ff4444", "+34 11235813", "iniesta@fcb.lu", false));
        contactList.add(new Contact("Dani Alves", "#99cc00", "+34 987654321", "alves@fcb.com", false));

    }
}
