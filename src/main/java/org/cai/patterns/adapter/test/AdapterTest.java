package org.cai.patterns.adapter.test;

import org.cai.patterns.adapter.service.impl.AudioPlayer;
import org.junit.Test;

/**
 * 适配器模式 ：就是使接口适配不同 场景
 * 优点：对外暴露一个接口
 * 缺点：对内增加了一个适配器对象，不利于项目以后的扩展和维护
 *
 *
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
