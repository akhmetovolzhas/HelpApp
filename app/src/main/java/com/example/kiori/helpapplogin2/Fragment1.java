package com.example.kiori.helpapplogin2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import java.util.ArrayList;

public class Fragment1 extends ListFragment implements OnItemClickListener {

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
        products.add(new HelpRequest("Help for Temirlan", "Temirlan Murzagaliev suffers from Hodgkin's lymphoma and needs money for treatment. He is a good sun, friend and NIS student, who have good marks at school and already passed some international exams, entered foreign universities.However he is all and in order to continue living Temirlan needs donations from other people", R.drawable.request1));
        products.add(new HelpRequest("A girl in Astana needs crutches", "Girl fell from 5th floor and underwent 3 operation on legs. She is from poor family with many children, therefore can't buy crutches by herself. If someone can give money or bring crutches here is the address:Abylaykhana-15", R.drawable.request2));
        products.add(new HelpRequest("Looking for baby carriage", "I have a little child and i need baby carriage,baby bath for him. if someone has them in house or can buy new one for us, i would appreciate that. Zhanar. Phone number: +7 707 3027632", R.drawable.request3));
        products.add(new HelpRequest("Alone with 3 children", "I'm left alone with 3 children and we need help with clothes and food. We will be very happy, if you will help us even a little bit. My phone:87476667237 ", R.drawable.request4));
        products.add(new HelpRequest("20 cats", "in the Akkol city grandmother has 20 cats. They need attention, warm house and delicious food, but pension of old lady is too small. Let's help her and her pets!", R.drawable.request5));
        //products.add(new HelpRequest("", "", R.drawable.request2));
        //for (int i = 1; i <= 20; i++) {
            //products.add(new HelpRequest("Product " + i, "Product descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct descProduct desc " + i,
                   // R.drawable.helpicon));
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
