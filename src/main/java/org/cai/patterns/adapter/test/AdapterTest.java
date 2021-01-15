package org.cai.patterns.adapter.test;

import org.cai.patterns.adapter.service.impl.AudioPlayer;
import org.junit.Test;

/**
 * @Author: caisijun
 * @Date: 2021/1/15 0015
 */
public class AdapterTest {

    @Test
    public void playTest(){
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("avi","kk.mp4");
    }
}
