package org.cai.patterns.adapter.service.impl;

import org.cai.patterns.adapter.service.AdvancedMediaPlayer;

/**
 * mp4播放接口
 * @Author: caisijun
 * @Date: 2021/1/15 0015
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp3(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.name="+fileName);
    }
}
