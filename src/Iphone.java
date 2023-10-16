public class Iphone implements MusicPlayer, Phone, Internet, Iphone2007 {
    private Music currentlyPlaying;

    @Override
    public void play() {
        if (currentlyPlaying != null) {
            System.out.println("Playing music: " + currentlyPlaying.getName());
        } else {
            System.out.println("No music is currently selected.");
        }
    }

    @Override
    public void pause() {
        if (currentlyPlaying != null) {
            System.out.println("Pausing music: " + currentlyPlaying.getName());
        } else {
            System.out.println("No music is currently selected.");
        }
    }

    @Override
    public void stop() {
        if (currentlyPlaying != null) {
            System.out.println("Stopping music: " + currentlyPlaying.getName());
            currentlyPlaying = null;
        } else {
            System.out.println("No music is currently selected.");
        }
    }

    @Override
    public void call() {
        // Implementação para fazer uma chamada
    }

    @Override
    public void receiveCall() {
        // Implementação para receber uma chamada
    }

    @Override
    public void endCall() {
        // Implementação para encerrar uma chamada
    }

    @Override
    public void openTab() {
        // Implementação para abrir uma nova guia
    }

    @Override
    public void closeTab() {
        // Implementação para fechar a guia atual
    }

    @Override
    public void search(String query) {
        // Implementação para realizar uma pesquisa na internet
    }

    @Override
    public void playMusic(Music music) {
        currentlyPlaying = music;
        System.out.println("Playing music: " + currentlyPlaying.getName());
    }

    @Override
    public void displayCurrentlyPlaying() {
        if (currentlyPlaying != null) {
            System.out.println("Currently playing: " + currentlyPlaying.getName());
        } else {
            System.out.println("No music is currently playing.");
        }
    }

    @Override
    public void nextTrack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextTrack'");
    }

    @Override
    public void previousTrack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'previousTrack'");
    }

    @Override
    public void sendSMS() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendSMS'");
    }
}
