package org.cai.patterns.adapter.service;

/**
 * 定义不同播放接口
 * @Author: caisijun
 * @Date: 2021/1/15 0015
 */
public interface AdvancedMediaPlayer {
    void playMp3(String fileName);
    void playMp4(String fileName);
}
