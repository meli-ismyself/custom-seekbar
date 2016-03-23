package meliismyself.com.verticalseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class VerticalSeekbar4 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_seekbar4);

        VerticalProgressBar vProgressBar = (VerticalProgressBar)findViewById(R.id.ProgressBar01);
        vProgressBar.setMax(100);
        vProgressBar.setProgress(20);
        //vProgressBar.setSecondaryProgress(50);

        VerticalSeekBarCustom2 vSeekBar = (VerticalSeekBarCustom2)findViewById(R.id.SeekBar01);
        vSeekBar.setMax(100);
        vSeekBar.setProgress(30);
        vSeekBar.setOnSeekBarChangeListener(new VerticalSeekBarCustom2.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(VerticalSeekBarCustom2 seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(VerticalSeekBarCustom2 seekBar) {

            }

            @Override
            public void onStopTrackingTouch(VerticalSeekBarCustom2 seekBar) {

            }
        });

        VerticalSeekBarCustom2 vSeekBar2 = (VerticalSeekBarCustom2)findViewById(R.id.SeekBar02);
        vSeekBar2.setMax(100);
        vSeekBar2.setProgress(30);

    }
}
