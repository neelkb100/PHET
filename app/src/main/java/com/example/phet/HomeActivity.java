package com.example.phet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.phet.Model.ModelAdapter;
import com.example.phet.Model.TModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    List<TModel> tModelList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        tModelList = new ArrayList<>();

        tModelList.add(

                new TModel(
                        1,"Devkund Waterfall Trek","Saturday, October 5, 2019",4.6,1050,R.drawable.devkund));


        tModelList.add(

                new TModel(
                        1,"Kurdugad Fort","\tSunday, October 6, 2019",4.3,1000,R.drawable.kurdugadfort));


        tModelList.add(

                new TModel(
                        1,"Moonlight camping in jungle & visit to Ozarde waterfall","Saturday, October 12, 2019",4.5,1999,R.drawable.ozarde));

        tModelList.add(

                new TModel(
                        1,"Camping & Trek to Kalavantin Durg","Saturday, November 9, 2019",4.7,1750,R.drawable.durg));

        tModelList.add(

                new TModel(
                        1,"Sindhudurga Tour- Scuba diving,Beach camping","Saturday, novemeber 16, 2019",4.6,6000,R.drawable.sindhudurgfort));

        tModelList.add(

                new TModel(
                        1,"Sandhan- The Valley of shadows Full Descend Trek & Camping","Saturday, November 23, 2019",4.5,2450,R.drawable.sandhan));

        tModelList.add(

                new TModel(
                        1,"Harischandragad Via Nalichi Vaat","Saturday, December 14, 2019",4.8,5000,R.drawable.harishchandragad));

        tModelList.add(

                new TModel(
                        1,"Beachside Camping - Konkan","Saturday, December 28, 2019",4.6,2499,R.drawable.konkan));


        ModelAdapter adapter = new ModelAdapter(this,tModelList);

        recyclerView.setAdapter(adapter);
    }
}
