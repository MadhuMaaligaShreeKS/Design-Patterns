package StructuralDesignPattern.FacadePattern;

class MultimediaFacade {
    private VideoPlayer videoPlayer;
    private AudioPlayer audioPlayer;
    private DisplaySystem displaySystem;

    public MultimediaFacade() {
        this.videoPlayer = new VideoPlayer();
        this.audioPlayer = new AudioPlayer();
        this.displaySystem = new DisplaySystem();
    }

    // Facade methods
    public void playVideo(String videoFile) {
        videoPlayer.playVideo(videoFile);
        displaySystem.displayOnScreen();
    }

    public void playAudio(String audioFile) {
        audioPlayer.playAudio(audioFile);
    }
}
