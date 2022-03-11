package alisson.zanoni.atividadecores;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layoutBlack,layoutBlue,layoutRed,layoutGreen,layoutYellow;
    private Button btnResetar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnResetar =findViewById(R.id.btnResetar);
        layoutBlack =findViewById(R.id.layoutBlack);
        layoutRed =findViewById(R.id.layoutRed);
        layoutGreen =findViewById(R.id.layoutGreen);
        layoutBlue =findViewById(R.id.layoutBlue);
        layoutYellow =findViewById(R.id.layoutYellow);


        layoutBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBlack.setBackgroundColor(Color.parseColor("black"));
                layoutRed.setBackgroundColor(Color.parseColor("black"));
                layoutGreen.setBackgroundColor(Color.parseColor("black"));
                layoutBlue.setBackgroundColor(Color.parseColor("black"));
                layoutYellow.setBackgroundColor(Color.parseColor("black"));
            }
        });

        layoutRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBlack.setBackgroundColor(Color.parseColor("red"));
                layoutRed.setBackgroundColor(Color.parseColor("red"));
                layoutGreen.setBackgroundColor(Color.parseColor("red"));
                layoutBlue.setBackgroundColor(Color.parseColor("red"));
                layoutYellow.setBackgroundColor(Color.parseColor("Red"));
            }
        });

        layoutGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBlack.setBackgroundColor(Color.parseColor("green"));
                layoutRed.setBackgroundColor(Color.parseColor("green"));
                layoutGreen.setBackgroundColor(Color.parseColor("green"));
                layoutBlue.setBackgroundColor(Color.parseColor("green"));
                layoutYellow.setBackgroundColor(Color.parseColor("green"));
            }
        });

        layoutBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBlack.setBackgroundColor(Color.parseColor("blue"));
                layoutRed.setBackgroundColor(Color.parseColor("blue"));
                layoutGreen.setBackgroundColor(Color.parseColor("blue"));
                layoutBlue.setBackgroundColor(Color.parseColor("blue"));
                layoutYellow.setBackgroundColor(Color.parseColor("blue"));
            }
        });

        layoutYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBlack.setBackgroundColor(Color.parseColor("yellow"));
                layoutRed.setBackgroundColor(Color.parseColor("yellow"));
                layoutGreen.setBackgroundColor(Color.parseColor("yellow"));
                layoutBlue.setBackgroundColor(Color.parseColor("yellow"));
                layoutYellow.setBackgroundColor(Color.parseColor("yellow"));
            }
        });

        btnResetar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBlack.setBackgroundColor(Color.parseColor("Black"));
                layoutRed.setBackgroundColor(Color.parseColor("Red"));
                layoutGreen.setBackgroundColor(Color.parseColor("Green"));
                layoutBlue.setBackgroundColor(Color.parseColor("Blue"));
                layoutYellow.setBackgroundColor(Color.parseColor("Yellow"));
            }
        });

    }
}