package demo.maps.app.mapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText me, friend;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        me = (EditText)findViewById(R.id.userid);
        friend = (EditText)findViewById(R.id.userid_friend);
        b = (Button)findViewById(R.id.button_connect);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Constants.USERNAME = "" + me.getText();
                Constants.USERNAME_FRIEND = "" + friend.getText();
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
                finish();

            }
        });


    }
}
