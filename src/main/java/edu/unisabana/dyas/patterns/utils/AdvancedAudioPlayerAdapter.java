package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private final AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "mp4" -> advancedAudioPlayer.playMp4(fileName);
            case "vlc" -> advancedAudioPlayer.playVlc(fileName);
            case "mp3" -> advancedAudioPlayer.playMp3(fileName);
            default -> System.out.println("Formato no soportado: " + audioType);
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}
