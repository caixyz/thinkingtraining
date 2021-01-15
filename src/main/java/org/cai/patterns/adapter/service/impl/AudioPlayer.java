package org.cai.patterns.adapter.service.impl;

import org.cai.patterns.adapter.MediaAdapter;
import org.cai.patterns.adapter.service.MediaPlayer;

/**
 * 播放接口
 * @Author: caisijun
 * @Date: 2021/1/15 0015
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        mediaAdapter = new MediaAdapter(audioType);
        if(audioType.equalsIgnoreCase("mp3")){
            mediaAdapter.play(audioType,fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter.play(audioType,fileName);
        }
        else
            System.out.println("Invalid media "+audioType+"format not supported");
    }
}
