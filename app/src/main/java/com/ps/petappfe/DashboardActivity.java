package com.ps.petappfe;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ps.petappfe.Model.Petsitter;
import com.ps.petappfe.Model.PopularPetsitter;
import com.ps.petappfe.Util.PetsitterAdapter;
import com.ps.petappfe.Util.PopularPetsitterAdapter;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    RecyclerView popularRecycler, petsitterRecycler;
    PopularPetsitterAdapter popularPetsitterAdapter;
    PetsitterAdapter petsitterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ps_dashboard);

        List<Petsitter> petsitterList = new ArrayList<>();
        petsitterList.add(new Petsitter("Marco", "EUR 8", R.drawable.llustration, "4.5", "Cane"));
        petsitterList.add(new Petsitter("Davide", "EUR 10", R.drawable.llustration, "4.2", "Gatto"));
        petsitterList.add(new Petsitter("Luca", "EUR 8", R.drawable.llustration, "4.5", "Gatto"));
        petsitterList.add(new Petsitter("Maria", "EUR 8", R.drawable.llustration, "4.2", "Gatto"));
        petsitterList.add(new Petsitter("Stefano", "EUR 8", R.drawable.llustration, "4.5", "Cane"));
        petsitterList.add(new Petsitter("Silvia", "EUR 5", R.drawable.llustration, "4.2", "Cane"));
        petsitterList.add(new Petsitter("Maria", "EUR 8", R.drawable.llustration, "4.2", "Gatto"));
        petsitterList.add(new Petsitter("Stefano", "EUR 8", R.drawable.llustration, "4.5", "Cane"));
        petsitterList.add(new Petsitter("Silvia", "EUR 5", R.drawable.llustration, "4.2", "Cane"));
        setAsiaRecycler(petsitterList);

    }

    private void setPopularRecycler(List<PopularPetsitter> popularPetsitterList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularPetsitterAdapter = new PopularPetsitterAdapter(this, popularPetsitterList);
        popularRecycler.setAdapter(popularPetsitterAdapter);

    }

    private void setAsiaRecycler(List<Petsitter> petsitterList) {

        petsitterRecycler = findViewById(R.id.petsitter_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        petsitterRecycler.setLayoutManager(layoutManager);
        petsitterAdapter = new PetsitterAdapter(this, petsitterList);
        petsitterRecycler.setAdapter(petsitterAdapter);

    }

        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();
        ThirdFragment thirdFragment = new ThirdFragment();
    }





