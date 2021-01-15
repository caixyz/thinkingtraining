package org.cai.patterns.adapter.service.impl;

import org.cai.patterns.adapter.service.AdvancedMediaPlayer;

/**
 * MP3播放接口
 * @Author: caisijun
 * @Date: 2021/1/15 0015
 */
public class Mp3Player implements AdvancedMediaPlayer {
    @Override
    public void playMp3(String fileName) {
        System.out.println("playing mp3 file.name="+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
