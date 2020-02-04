package id.ac.poliban.mi.firda.makanan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class MakananAdapter extends BaseAdapter {

    private List<Makanan> data = new ArrayList<>();

    public MakananAdapter(List<Makanan> data) {
        this.data = data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView image;
        TextView tvMakananName;
        TextView tvMakananDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_makanan, parent, false);

        image = convertView.findViewById(R.id.image);
        tvMakananName = convertView.findViewById(R.id.tv_makanan_name);
        tvMakananDesc = convertView.findViewById(R.id.tv_makanan_description);

        Glide.with(parent.getContext())
                .load(data.get(position). getImage())
                .apply(new RequestOptions().override(60, 60))
                .into(image);
        tvMakananName.setText(data.get(position).getMakananName());
        tvMakananDesc.setText(data.get(position).getMakananDesc());

        return convertView;
    }
}
