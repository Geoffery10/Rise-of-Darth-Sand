package com.example.riseofdarthsand;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.annotation.RawRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer soundPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button stopbtn = findViewById(R.id.stopbtn);

        //Buttons are defined here
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);
        Button btn9 = findViewById(R.id.button9);
        Button btn10 = findViewById(R.id.button10);
        Button btn11 = findViewById(R.id.button11);
        Button btn12 = findViewById(R.id.button12);
        Button btn13 = findViewById(R.id.button13);
        Button btn14 = findViewById(R.id.button14);
        Button btn15 = findViewById(R.id.button15);
        Button btn16 = findViewById(R.id.button16);
        Button btn17 = findViewById(R.id.button17);
        Button btn18 = findViewById(R.id.button18);

        stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
            }
        });

        //Button clicks are here
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.do_it_do_it_do_it_do_it_do_it, true);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.r2_activate_elevator_music, false);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.time_to_abandon_smoking, false);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.sith_lords_are_sissys, false);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.ls_noises_1, false);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.do_it, false);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.palpatine_sound_1, true);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.he_stole_your_sand, false);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.your_mom, false);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.master_windu, false);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.happy_landings, false);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.avengers_assemble, false);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.get_drunk, false);
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.hold_on, false);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.and_you_killed_me, false);
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.i_hate_you, false);
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.ninth_time, false);
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                startPlaying(R.raw.tenth_time, false);
            }
        });

    }

    private void stopPlaying()
    {
        if (soundPlayer != null)
        {
            soundPlayer.reset();
            soundPlayer.stop();
            soundPlayer.release();
            soundPlayer=null;
        }
    }

    private void startPlaying(@RawRes int sound, boolean loopingTrue)
    {
        Log.i("My App", "STOP");
        stopPlaying();
        soundPlayer = MediaPlayer.create(getApplicationContext(), sound);
        soundPlayer.start();
        soundPlayer.setLooping(loopingTrue);
        Log.i("My App", "START");
    }
}
