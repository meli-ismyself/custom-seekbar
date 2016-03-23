package meliismyself.com.verticalseekbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEx1 = (Button)findViewById(R.id.btnEx1);
        Button btnEx2 = (Button)findViewById(R.id.btnEx2);
        Button btnEx3 = (Button)findViewById(R.id.btnEx3);
        Button btnEx4 = (Button)findViewById(R.id.btnEx4);
        btnEx1.setOnClickListener(this);
        btnEx2.setOnClickListener(this);
        btnEx3.setOnClickListener(this);
        btnEx4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEx1:
               /* Intent intent = new Intent(MainActivity.this, VerticalSeekbar1.class);
                startActivity(intent);*/
                Toast.makeText(getApplicationContext(), "Yang ini masih salah, belum sesuai harapan, hahaha", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnEx2:
                Intent intent2 = new Intent(MainActivity.this, VerticalSeekbar2.class);
                startActivity(intent2);
                break;
            case R.id.btnEx3:
                Intent intent3 = new Intent(MainActivity.this, VerticalSeekbar3.class);
                startActivity(intent3);
                break;
            case R.id.btnEx4:
                Intent intent4 = new Intent(MainActivity.this, VerticalSeekbar4.class);
                startActivity(intent4);
                break;
        }
    }
}
