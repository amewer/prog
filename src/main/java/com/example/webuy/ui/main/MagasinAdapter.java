package com.example.webuy.ui.main;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;




import com.example.webuy.ListeOffresMagasin;
import com.example.webuy.R;

import java.util.ArrayList;

public class MagasinAdapter extends BaseAdapter {


    private final Context context;
    ArrayList<String> magasins;

    public MagasinAdapter(ArrayList<String> magasins,Context context) {
        this.context = context;
        this.magasins=magasins;
    }


    @Override
    public int getCount() {
        return magasins.size();
    }

    @Override
    public Object getItem(int position) {
        return magasins.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)
                    this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(R.layout.list_items_magasins, null);
        }

        //ImageView logo = itemView.findViewById(R.id.imageView);
        final TextView nomMagasin = (TextView) itemView.findViewById(R.id.titreArticle);
        //TextView adresseMagasin = (TextView) itemView.findViewById(R.id.textView2);

        nomMagasin.setText(magasins.get(position));

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), ListeOffresMagasin.class);
                intent.putExtra("string",nomMagasin.toString());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(intent);

            }
        });


        return itemView;
    }
}
