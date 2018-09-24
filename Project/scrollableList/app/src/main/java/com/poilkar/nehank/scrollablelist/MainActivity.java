package com.poilkar.nehank.scrollablelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    TextView textViewLargeText, textViewSmallText;
    RecyclerView recyclerView;
    String url = "http://34.217.226.151:8000/nearlaw/search/civil";
    ProgressBar progessBar;
    //private List<Hit> moviesList;

    private int currentItems, scrolledOutItems, totalItems;
     boolean isScrolling = false;
    private OnLoadMoreListener onLoadMoreListener;

    private EndlessRecyclerViewScrollListener scrollListener;
MyAdapter myAdapter;
    private List<Hit> movieList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Configure the RecyclerView
        RecyclerView rvItems = (RecyclerView) findViewById(R.id.recyclerView);
        progessBar = (ProgressBar)findViewById(R.id.progressBar);
        myAdapter=new MyAdapter(movieList,this);

        rvItems.setAdapter(myAdapter);
        //myAdapter.notifyDataSetChanged();
        rvItems.setVisibility(View.VISIBLE);
        progessBar.setVisibility(View.GONE);
        loadNextDataFromApi(1);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvItems.setLayoutManager(linearLayoutManager);
        // Retain an instance so that you can call `resetState()` for fresh searches
//        myAdapter.setOnLoadMoreListener(new MyAdapter.OnLoadMoreListener() {
//            @Override
//            public void onLoadMore() {
//
//            }
//        });
        scrollListener = new EndlessRecyclerViewScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                // Triggered only when new data needs to be appended to the list
                // Add whatever code is needed to append new items to the bottom of the list
                //progessBar.setVisibility(view.VISIBLE);
                progessBar.setVisibility(view.VISIBLE);
                loadNextDataFromApi(page);

            }
        };
        // Adds the scroll listener to RecyclerView
        rvItems.addOnScrollListener(scrollListener);
        myAdapter.setOnItemClickListener(MainActivity.this);
    }


    private void loadNextDataFromApi(final int page) {

        JSONObject postparams=new JSONObject();
        try {
            postparams.put("Authorization","Rahul");
            postparams.put("testchk","0");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url+"/"+page,new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

//                System.out.println(response);  //this returns json data
              Userss userss
                =new Gson().fromJson(response,Userss.class);
              List<Hit> hitList=new ArrayList<>();
                for (Hit hit : userss.getHits().getHits()) {
                    hitList.add(hit);
                }

                movieList.addAll(hitList);
                myAdapter.notifyDataSetChanged();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println(error);
            }
        })
        {

            /** Passing some request headers* */
            @Override
            public Map<String,String> getHeaders() throws AuthFailureError {
                HashMap<String,String> headers = new HashMap();
                headers.put("Authorization", "Rahul");
                headers.put("testchk", "0");
                return headers;
            }
        };

        RequestQueue request = Volley.newRequestQueue(this);
        request.add(stringRequest);
    }


    @Override
    public void onItemClick(int position) {

        Hit movie = new Hit();
        Intent intent = new Intent(this,Main2Activity.class);


        Toast.makeText(getApplicationContext(),"You clicked "+ position,Toast.LENGTH_SHORT).show();

        intent.putExtra("caseno",movie.getSource().getCaseNo());
        intent.putExtra("citation",movie.getSource().getDate());
        startActivity(intent);



    }

}
