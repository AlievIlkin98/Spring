package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("testBean",ClassicMusic.class);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();
        System.out.println(music.getSong());
        context.close();
    }
}
