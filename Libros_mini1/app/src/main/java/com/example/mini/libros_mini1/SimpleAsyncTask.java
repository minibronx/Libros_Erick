package com.example.mini.libros_mini1;
import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by Mini on 03/05/2017.
 */

import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Void, String> {

    TextView miTextView;


    SimpleAsyncTask(TextView tv){
        miTextView=tv;
    }

    public void onProgressUpdated(){

    }

    public void onPostExecute(String result){
        miTextView.setText(result);
    }

    @Override
    protected String doInBackground(Void... params) {
        //Se genera un número random entre 0 y 10
        Random r= new Random();
        int n = r.nextInt(11);

        //tiempo para girar el telefono mientras está funcionando
        int s = n* 200;

        //suspension durante el tiempo aleatorio
        try {
            Thread.sleep(s);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        //arroja un String
        return "Despierta al fin de dormir" + s + "milliseconds!" ;
    }
}