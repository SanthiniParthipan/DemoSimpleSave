package sg.edu.rp.c346.id19028654.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor preEdit=prefs.edit();
        preEdit.putString("greetings","Hello!");
        preEdit.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //String msg ="No greetings!";
        SharedPreferences prefs =PreferenceManager.getDefaultSharedPreferences(this);
        String msg =prefs.getString("greetings","No greetings!");

        Toast toast=Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG);
        toast.show();
    }

}
