package tmac12.it.opencvdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by marco on 30/07/16.
 */
public class SamplesActivity extends AppCompatActivity {

    Intent sampleIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samples);
    }

    public void tutorial1(View v) {
        sampleIntent = new Intent(this, Tutorial1Activity.class);
        startActivity(sampleIntent);
    }
    public void tutorial3(View v){
        sampleIntent = new Intent(this, Tutorial3Activity.class);
        startActivity(sampleIntent);
    }
    public void imageManipulations(View v){
        sampleIntent = new Intent(this, ImageManipulationsActivity.class);
        startActivity(sampleIntent);
    }

    public void colorBlobDetection(View v){
        sampleIntent = new Intent(this, ColorBlobDetectionActivity.class);
        startActivity(sampleIntent);
    }

    public void faceDetection(View v){
        sampleIntent = new Intent(this, FdActivity.class);
        startActivity(sampleIntent);
    }
    public void cameraCalibration(View v){
        //sampleIntent = new Intent(this, ColorBlobDetectionActivity.class);
        //startActivity(sampleIntent);
        Toast.makeText(this, "Not yet implemented", Toast.LENGTH_SHORT).show();
    }
    public void puzzle15(View v){
        sampleIntent = new Intent(this, Puzzle15Activity.class);
        startActivity(sampleIntent);
        //Toast.makeText(this, "Not yet implemented", Toast.LENGTH_SHORT).show();
    }
}
