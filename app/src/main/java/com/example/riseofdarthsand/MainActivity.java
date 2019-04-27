package com.example.riseofdarthsand;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.do_it_do_it_do_it_do_it_do_it);
                soundPlayer.start();
                soundPlayer.setLooping(true);
                Log.i("My App", "START");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.r2_activate_elevator_music);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.time_to_abandon_smoking);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sith_lords_are_sissys);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ls_noises_1);
                soundPlayer.start();
                soundPlayer.setLooping(true);
                Log.i("My App", "START");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.do_it);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.palpatine_sound_1);
                soundPlayer.start();
                soundPlayer.setLooping(true);
                Log.i("My App", "START");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.he_stole_your_sand);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.your_mom);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.master_windu);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.happy_landings);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.avengers_assemble);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.get_drunk);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hold_on);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.and_you_killed_me);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.i_hate_you);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ninth_time);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) //onClick interface
            {
                Log.i("My App", "STOP");
                stopPlaying();
                soundPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tenth_time);
                soundPlayer.start();
                soundPlayer.setLooping(false);
                Log.i("My App", "START");
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
}
