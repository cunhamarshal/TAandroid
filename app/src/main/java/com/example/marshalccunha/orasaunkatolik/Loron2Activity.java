package com.example.marshalccunha.orasaunkatolik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class Loron2Activity extends AppCompatActivity {
    GridLayout Loron2Grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loron2);

        Loron2Grid = (GridLayout)findViewById(R.id.Loron2Grid);
        setSingleEvent(Loron2Grid);
    }

    private void setSingleEvent(GridLayout loron2Grid) {
        for (int i = 0 ; i < Loron2Grid.getChildCount();i++)
        {
            CardView cardView = (CardView)Loron2Grid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0)
                    {
                        Intent intent = new Intent(Loron2Activity.this, SinalKruzActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1)
                    {
                        Intent intent = new Intent(Loron2Activity.this, AmiAmanActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2)
                    {
                        Intent intent = new Intent(Loron2Activity.this, Loron2_Gloria.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3)
                    {
                        Intent intent = new Intent(Loron2Activity.this, Loron2_Gloria.class);
                        startActivity(intent);
                    }
                    else if (finalI == 4)
                    {
                        Intent intent = new Intent(Loron2Activity.this, Loron2_kredo.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(Loron2Activity.this, "masih kosong & belum diisi",Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
    }
}
