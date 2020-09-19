package com.example.classfive;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    private TextView heading,details;
    private ImageView imageView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        heading= findViewById(R.id.detailsHeadingId);
        details= findViewById(R.id.detailsId);
        imageView= findViewById (R.id.singleImageId);

        String value= getIntent().getStringExtra("player_name");

        if(value.equals("Messi")){
            setTitle("Messi");
            imageView.setImageResource (R.drawable.messi);
            heading.setText("Messi Details:");
            String src;

            details.setText(R.string.Messi);
        }


        else if(value.equals("Shakib")){
            setTitle("Shakib Al Hasan");
            imageView.setImageResource (R.drawable.shakib);
            heading.setText("Shakib Al Hasan Details:");
            details.setText(R.string.Shakib);

        }
        else if(value.equals("Neymar")){
            setTitle("Neymar da  Júnior");
            imageView.setImageResource (R.drawable.neymar);
            heading.setText("Neymar da  Júnior Details:");
            details.setText(R.string.Neymar);

        }
        else if(value.equals("Mushfique")){
            setTitle("Mushfiqur Rahman");
            imageView.setImageResource (R.drawable.mushfiqur);
            heading.setText("Mushfiqur Rahman Details:");
            details.setText(R.string.Mushfique);

        }

        else if(value.equals("Tamim")){
            setTitle("Tamim Iqbal");
            imageView.setImageResource (R.drawable.tamim);
            heading.setText("Tamim Iqbal Details:");
            details.setText(R.string.Tamim);

        }

        else if(value.equals("Bill Gates")){
            setTitle("Bill Gates");
            imageView.setImageResource (R.drawable.bill);
            heading.setText("Bill Gates Details:");
            details.setText(R.string.Bill_Gates);

        }

        else if(value.equals("Mark Jukarbarg")){
            setTitle("Mark Jukarbarg");
            imageView.setImageResource (R.drawable.mark);
            heading.setText("Mark Jukarbarg Details:");
            details.setText(R.string.Mark_Jukarbarg);

        }

        else if(value.equals("Jamal Bhuyan")){
            setTitle("Jamal Bhuyan");
            imageView.setImageResource (R.drawable.jamal);
            heading.setText("Jamal Bhuyan Details:");
            details.setText(R.string.Jamal_Bhuyan);

        }

        else if(value.equals("Siddikur Rahman")){
            setTitle("Mohammad Siddikur Rahman");
            imageView.setImageResource (R.drawable.siddikur);
            heading.setText("Mohammad Siddikur Rahman  Details:");
            details.setText(R.string.Siddikur_Rahman);

        }

        else if(value.equals("Virat Kohli")){
            setTitle("Virat Kohli");
            imageView.setImageResource (R.drawable.virat);
            heading.setText("Virat Kohli Details:");
            details.setText(R.string.Virat_Kohli);

        }



    }
}