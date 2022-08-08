/*
 * Created by Maruf Alam Porosh on 3/28/21 11:14 PM
 *  Copyright (c) 2021 . All rights reserved.
 *  Last modified 3/27/21 12:14 AM
 */

package com.marufalam.preschoollearning;

import android.content.Context;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;

public class SoundInterfare {


    public static   SimpleExoPlayer player;

    public static SimpleExoPlayer getPlayer() {
        return player;
    }

    public static void setPlayer(SimpleExoPlayer p) {
        player = p;
    }

    public static void playSound(int sounLink, Context context) {


        try {
            playSound(context,sounLink,1.0f);
        }catch (Exception e){
            e.printStackTrace();
        }




    }

    public static void playSound(Context context, int sounRes, float volume)
    {

        pauseSound();
        //example int sounRes=R.raw.duck;
        SimpleExoPlayer  player =  new SimpleExoPlayer.Builder(context).build();

        DataSpec dataSpec = new DataSpec(RawResourceDataSource.buildRawResourceUri(sounRes));
        final RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
        try {
            rawResourceDataSource.open(dataSpec);
        } catch (RawResourceDataSource.RawResourceDataSourceException e) {
            e.printStackTrace();
        }

        DataSource.Factory factory = () -> rawResourceDataSource;
        ProgressiveMediaSource mediaSource = new ProgressiveMediaSource
                .Factory(factory)
                .createMediaSource(rawResourceDataSource.getUri());

        player.prepare(mediaSource);
        player.setPlayWhenReady(true);
        player.setVolume(volume);

        player.addListener(new Player.EventListener() {
            @Override
            public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
                if (playbackState == Player.STATE_ENDED) {
                    player.release();
                }
            }
        });

        setPlayer(player);
    }


    public  static void pauseSound(){
        if (player != null) {
            player.setPlayWhenReady(false);
            player.stop();
            player.seekTo(0);
            player.release();
        }
    }

}
