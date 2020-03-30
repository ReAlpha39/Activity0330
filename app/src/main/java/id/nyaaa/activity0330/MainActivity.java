package id.nyaaa.activity0330;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.m1) {
            startActivity(new Intent(this, Registrasi.class));
        } else if (item.getItemId() == R.id.m2) {
            startActivity(new Intent(this, Menu2.class));
        } else if (item.getItemId() == R.id.m3) {
            startActivity(new Intent(this, Menu3.class));
        }

        return true;
    }
}
