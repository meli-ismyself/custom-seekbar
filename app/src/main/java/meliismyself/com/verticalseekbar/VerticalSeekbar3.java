package meliismyself.com.verticalseekbar;


import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class VerticalSeekbar3 extends Activity {
    TextView textview;
    SeekBar seekbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_seekbar3);

        textview = (TextView)findViewById(R.id.textView);
        seekbar = (SeekBar)findViewById(R.id.seekBar1);
        seekbar.setMax(10);
        seekbar.setProgress(5);
        //initControls();

        seekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //add here your implementation
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //add here your implementation
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {

                textview.setText(" value = " +Integer.toString(progress));
            }
        });
    }

}
