package StructuralDesignPattern.FacadePattern;

public class Main {
    public static void main(String[] args) {
        MultimediaFacade multimediaFacade = new MultimediaFacade();

        // Using facade to play video
        multimediaFacade.playVideo("example_video.mp4");

        // Using facade to play audio
        multimediaFacade.playAudio("example_audio.mp3");
    }
}