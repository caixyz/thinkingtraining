package org.cai.patterns.adapter;

import org.cai.patterns.adapter.service.AdvancedMediaPlayer;
import org.cai.patterns.adapter.service.MediaPlayer;
import org.cai.patterns.adapter.service.impl.Mp3Player;
import org.cai.patterns.adapter.service.impl.Mp4Player;

/**
 * 播放适配器，适配不同播放文件类型 MP3，MP4、、
 * @Author: caisijun
 * @Date: 2021/1/15 0015
 */
public class MediaAdapter  implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * 实例化 播放接口
     * @param audioType
     */
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp3"))
            advancedMediaPlayer=new Mp3Player();
        else if(audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer=new Mp4Player();
    }

    /**
     * 播放方法适配器
     * @param audioType
     * @param fileName
     */
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3"))
            advancedMediaPlayer.playMp3(fileName);
        else if(audioType.equals("mp4"))
            advancedMediaPlayer.playMp4(fileName);
    }


}
