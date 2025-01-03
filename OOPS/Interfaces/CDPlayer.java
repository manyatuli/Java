package OOPS.Interfaces;

public class CDPlayer implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("Media Player starts");
    }

    @Override
    public void stop() {
        System.out.println("Media Player stops");
    }
}
