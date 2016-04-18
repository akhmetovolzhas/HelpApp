package com.example.kiori.helpapplogin2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import java.util.ArrayList;

public class Fragment2 extends ListFragment implements OnItemClickListener {

    ArrayList<HelpRequest> products = new ArrayList<HelpRequest>();
    BoxAdapter boxAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        fillData();
        boxAdapter = new BoxAdapter(getActivity(), products);
        setListAdapter(boxAdapter);
        getListView().setOnItemClickListener(this);
    }

    void fillData() {
        products.add(new HelpRequest("Children clothes", "I can give away children clothes and bed with blanket, pillows. Aksamal 87716655589 Please call me, if you are interested.", R.drawable.give1));
        products.add(new HelpRequest("Orthopedic sandals", "Hello! I'm giving away orthopedic sandals for girl. I bought it few month before, but don't need them anymore.Size : 32. My phone number : 87015286203 ", R.drawable.give2));
        products.add(new HelpRequest("Dishwasher", "Good evening. We want to give away dishwasher Veko.It is not working, but can be repaired by people, who know technique well 87012209880 Lyazzat", R.drawable.give3));
        products.add(new HelpRequest("Lost and found", "Hello. Today on a Saryarka street i found key from house with a trinket. Maybe someone needs them a lot. Call :87021300249 Thank you!", R.drawable.give4));
        //products.add(new HelpRequest("", "", R.drawable.request2));
        //for (int i = 1; i <= 20; i++) {
            //products.add(new HelpRequest("Product 2 " + i, "Product descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct desc " + i,
                    //R.drawable.helpicon));
        //}
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent mIntent = new Intent(getActivity(), DetailPageActivity.class);
        Bundle mBundle = new Bundle();
        mBundle.putSerializable("HelpRequest", products.get(position));
        mIntent.putExtras(mBundle);
        startActivity(mIntent);

        //Toast.makeText(getActivity(), products.get(position).Title, Toast.LENGTH_SHORT).show();
    }
}
