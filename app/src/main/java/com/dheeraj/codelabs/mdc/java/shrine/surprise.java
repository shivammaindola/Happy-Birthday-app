package com.dheeraj.codelabs.mdc.java.shrine;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.luolc.emojirain.EmojiRainLayout;

public class surprise extends AppCompatActivity {

    MediaPlayer player;

    private EmojiRainLayout mcontainer;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surprise);
        tv = (TextView) this.findViewById(R.id.mywidget);
        tv.setSelected(true);  // Set focus to the textview

    mcontainer=(EmojiRainLayout)findViewById(R.id.activity_main);
        mcontainer.addEmoji(R.drawable.e1);
        mcontainer.addEmoji(R.drawable.e2);
        mcontainer.addEmoji(R.drawable.e3);
        mcontainer.addEmoji(R.drawable.e4);
        mcontainer.addEmoji(R.drawable.e5);
        mcontainer.addEmoji(R.drawable.e6);
        mcontainer.addEmoji(R.drawable.e7);
        mcontainer.addEmoji(R.drawable.e8);

        mcontainer.startDropping();
        mcontainer.setPer(10);
        mcontainer.setDuration(4500);
        mcontainer.setDropDuration(2400);
        mcontainer.setDropFrequency(500);

        mcontainer.startDropping();

        //music
        if(player==null)
        player=MediaPlayer.create(this,R.raw.song);

        player.start();

        Button button=(Button)findViewById(R.id.thankyou_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String sAux = "\nThankyou bro, Me humesha yaad rakhunga is App ko, apne baccho ko bhi dikhaunga or biwi ko bhi \n\n";
               // sAux = sAux + "http://play.google.com/store/apps/details?id=" + context.getPackageName();
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, sAux);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));

            }
        });


    }
    private void stopPlayer(){
        if(player!=null){
            player.release();
            player=null;
        }
    }
    @Override
    protected void onStop(){
        super.onStop();
        stopPlayer();
    }
}
