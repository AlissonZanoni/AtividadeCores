package alisson.zanoni.atividadecores;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layoutBlack,layoutBlue,layoutRed,layoutGreen,layoutYellow;
    boolean corSelecionada = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnResetar = findViewById(R.id.btnResetar);
        layoutBlack = findViewById(R.id.layoutBlack);
        layoutRed = findViewById(R.id.layoutRed);
        layoutGreen = findViewById(R.id.layoutGreen);
        layoutBlue = findViewById(R.id.layoutBlue);
        layoutYellow = findViewById(R.id.layoutYellow);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        int preferenciaBackground = preferences.getInt("Cor Background", 0);

        if(preferenciaBackground!=0){
            changeBackgroundColor(preferenciaBackground);
        }

        layoutBlack.setOnClickListener(view -> abrirDialogo(((ColorDrawable)view.getBackground()).getColor()));

        layoutRed.setOnClickListener(view -> abrirDialogo(((ColorDrawable)view.getBackground()).getColor()));

        layoutGreen.setOnClickListener(view -> abrirDialogo(((ColorDrawable)view.getBackground()).getColor()));

        layoutBlue.setOnClickListener(view -> abrirDialogo(((ColorDrawable)view.getBackground()).getColor()));

        layoutYellow.setOnClickListener(view -> abrirDialogo(((ColorDrawable)view.getBackground()).getColor()));

        btnResetar.setOnClickListener(view -> {
            initialColor();
            corSelecionada = false;
        });
    }

    public void changeBackgroundColor(int color){
        layoutBlack.setBackgroundColor(color);
        layoutRed.setBackgroundColor(color);
        layoutGreen.setBackgroundColor(color);
        layoutBlue.setBackgroundColor(color);
        layoutYellow.setBackgroundColor(color);
    }

    public void initialColor(){
        layoutBlack.setBackgroundColor(Color.parseColor("Black"));
        layoutRed.setBackgroundColor(Color.parseColor("Red"));
        layoutGreen.setBackgroundColor(Color.parseColor("Green"));
        layoutBlue.setBackgroundColor(Color.parseColor("Blue"));
        layoutYellow.setBackgroundColor(Color.parseColor("Yellow"));
    }

    public void changePreferences(int color){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putInt("Cor Background", color);
        edit.apply();
    }

    public void abrirDialogo(int color){
        if(!corSelecionada){
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);

            dialog.setTitle("Trocar Cor");
            dialog.setMessage("Você deseja trocar todas as cores?");

            dialog.setCancelable(false);

            dialog.setIcon(android.R.drawable.ic_input_add);

            dialog.setPositiveButton("Sim", (dialogInterface, i) -> {
                changePreferences(color);
                changeBackgroundColor(color);
                corSelecionada = true;
            });
            dialog.setNegativeButton("Não", (dialogInterface, i) -> Toast.makeText(getApplicationContext(), "Operação cancelada", Toast.LENGTH_SHORT).show());

            dialog.create();
            dialog.show();
        }
    }
}