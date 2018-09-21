package ch.epfl.sweng.bootcamp;

import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.mainGoButton);
        text = findViewById(R.id.mainName);
    }
}
