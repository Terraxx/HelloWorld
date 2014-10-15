package hu.terraxx.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;

import static android.view.Gravity.*;


public class game extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        start();

        final TextView text = (TextView) findViewById(R.id.change);
        text.setTextSize(100.0f);
        //final TextView showtext = (TextView) findViewById(R.id.showsize);
        text.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        text.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RotateAnimation anim = new RotateAnimation(360.0f,360.0f);
                anim.setDuration(1000);
                anim.setFillEnabled(true);
                anim.setFillAfter(true);
                text.setAnimation(anim);
                text.startAnimation(anim);
            }
        });
    }

    public void start(){
        TextView text = (TextView)findViewById(R.id.change);
        text.setText("Hello");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
