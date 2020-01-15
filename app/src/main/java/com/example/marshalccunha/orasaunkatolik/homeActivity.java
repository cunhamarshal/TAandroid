package com.example.marshalccunha.orasaunkatolik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.PopupMenu;
import android.widget.Toast;

public class homeActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }



    private void setSingleEvent(GridLayout mainGrid){
        for (int i = 0 ; i < mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0)
                    {
                        Intent intent = new Intent(homeActivity.this, Loron2Activity.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1)
                    {
                        Intent intent = new Intent(homeActivity.this, SelukActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2)
                    {
                        Intent intent = new Intent(homeActivity.this, RosarioActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3)
                    {
                        Intent intent = new Intent(homeActivity.this, MisaActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI == 4)
                    {
                        Intent intent = new Intent(homeActivity.this, ViasakraActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI == 5)
                    {
                        Intent intent = new Intent(homeActivity.this, NovenaActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(homeActivity.this, "kosong",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    public void show(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.navigation);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.navigation_tenteng:
                Intent intent = new Intent(homeActivity.this, TentangActivity.class);
                startActivity(intent);
                return true;
            case R.id.navigation_keluar:
                finish();
                return true;
                default:
                    return false;
        }
    }
}
