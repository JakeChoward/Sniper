package snipe.me.snipe;

        import android.graphics.Paint;
        import android.support.v7.app.AppCompatActivity;
        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;


public class Homepage extends AppCompatActivity {



    //to let the buttons run
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        //Buttons and functions

        Button Host = (Button) findViewById(R.id.Host);
        Button Join = (Button) findViewById(R.id.Join);

        //Host
        Host.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this, Homepage.class));
            }
        });

//rawr
        //Join
        Join.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this, Homepage.class));
            }
        });

    }

}

