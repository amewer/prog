package com.example.webuy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class ListeOffresAdapter  extends BaseAdapter {



    private final Context context;
    ArrayList<String> offres;

    public ListeOffresAdapter(ArrayList<String> offres,Context context) {
        this.context = context;
        this.offres=offres;
    }
    @Override
    public int getCount() {
        return offres.size();
    }

    @Override
    public Object getItem(int position) {
        return offres.get(position);
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
        final TextView nomOffre = (TextView) itemView.findViewById(R.id.titreArticle);
        //TextView adresseMagasin = (TextView) itemView.findViewById(R.id.textView2);

        nomOffre.setText(offres.get(position));


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), UneOffre.class);
                intent.putExtra("string",nomOffre.toString());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(intent);

            }
        });

        return itemView;
    }
}
