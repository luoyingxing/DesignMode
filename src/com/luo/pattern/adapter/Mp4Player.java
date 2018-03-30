package com.luo.pattern.adapter;

/**
 * Mp4Player
 * <p>
 * Created by luoyingxing on 2018/3/30.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
