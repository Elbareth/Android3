package com.example.boruch.zadanie4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Boruch on 2017-04-02.
 */

public class Quiz extends Activity {
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
    }
    public void Mastiff(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Brawo!!!Poprawna odpowiedź",Toast.LENGTH_SHORT);
        toast.show();
        i++;
    }
    public void SharPei(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Niestety to nie jest poprawna odpowiedz",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void BPP(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Niestety to nie jest poprawna odpowiedz",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void mas(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Niestety to nie jest poprawna odpowiedz",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Golden(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Niestety to nie jest poprawna odpowiedz",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Labrador(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Brawo!!!Poprawna odpowiedź",Toast.LENGTH_SHORT);
        toast.show();
        i++;
    }
    public void Bernandyn(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Niestety to nie jest poprawna odpowiedz",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Pir(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Niestety to nie jest poprawna odpowiedz",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void ber(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Brawo!!!Poprawna odpowiedź",Toast.LENGTH_SHORT);
        toast.show();
        i++;
    }
    public void Pitbull(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Niestety to nie jest poprawna odpowiedz",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void DogArgentynski(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Niestety to nie jest poprawna odpowiedz",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Buldog(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Brawo!!!Poprawna odpowiedź",Toast.LENGTH_SHORT);
        toast.show();
        i++;
    }
    public void DogNiemiecki(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Niestety to nie jest poprawna odpowiedz",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void OwczarekBelgijski(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Niestety to nie jest poprawna odpowiedz",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void OwczarekNiemiecki(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"Brawo!!!Poprawna odpowiedź",Toast.LENGTH_SHORT);
        toast.show();
        i++;
    }
    public void ok(View view){
        TextView text = (TextView) findViewById(R.id.text);
        text.setText("Gratulacje udalo Ci się uzyskać "+i+"punktów");
    }
}
