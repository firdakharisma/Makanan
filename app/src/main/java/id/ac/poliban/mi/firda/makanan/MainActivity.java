package id.ac.poliban.mi.firda.makanan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Makanan> makanans = new ArrayList<>();
    private ListView lvMakanan;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMakanan = findViewById(R.id.listview);

        makanans.addAll(MakananData.getAllMakanan());

        adapter = new MakananAdapter(makanans);

        lvMakanan.setAdapter(adapter);

        lvMakanan.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Makanan yang Anda Pilih")
                    .setMessage("Anda memilih: " +
                            makanans.get(position).getMakananName())
                    .setPositiveButton("OK", null).show();
        });
    }
}
