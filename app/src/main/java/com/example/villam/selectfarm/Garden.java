package com.example.villam.selectfarm;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.villam.API;
import com.example.villam.Adapter;
import com.example.villam.Farm;
import com.example.villam.MainActivity;
import com.example.villam.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Garden extends Fragment {

    ListView listView;
    ArrayList<Farm> farms;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.garden, container, false);


        Adapter adapter = new Adapter(getActivity(), R.layout.listlayout, farms);
        listView.setAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }



    private class GetData extends AsyncTask<Void, ArrayList<Farm>, ArrayList<Farm>>{

        @Override
        protected ArrayList<Farm> doInBackground(Void... voids) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://66.42.48.59:8000/api/Gardens")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            API api = retrofit.create(API.class);
            Call<List<Farm>> call = api.getData();

            call.enqueue(new Callback<List<Farm>>() {
                @Override
                public void onResponse(Call<List<Farm>> call, Response<List<Farm>> response) {

                }

                @Override
                public void onFailure(Call<List<Farm>> call, Throwable t) {

                }
            });
            return null;
        }
    }
}
