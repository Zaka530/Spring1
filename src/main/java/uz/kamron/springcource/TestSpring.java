package uz.kamron.springcource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class    TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(
                SpringConfig.class
        );




//
//         Computer computer=context.getBean("computer",Computer.class);
//        System.out.println(computer);

//        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();

//        Music music=context.getBean("rockMusic",Music.class);
//        MusicPlayer musicPlayer=new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music2=context.getBean("classicalMusic",Music.class);
//        MusicPlayer classicalMusicPlayer=new MusicPlayer(music2);
//        classicalMusicPlayer.playMusic();

        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1=context.getBean("classicalMusic",ClassicalMusic.class);


        context.close();
    }
}
