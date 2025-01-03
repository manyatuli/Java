package OOPS.Interfaces;

public class Car  {
    public static void main(String[] args) {

        Engine engine = new ElectricEngine();
        engine.start();
        engine.stop();

        MediaPlayer media = new CDPlayer();
        media.start();
        media.stop();

        engine=new PowerEngine();
        engine.start();
        engine.stop();

        Accelerate acc= new Accelerate(){
            @Override
            public void start() {
                System.out.println("Accelerator starts");
            }

            @Override
            public void stop() {
                System.out.println("Accelerator stops");
            }
        };

        acc.start();
        acc.stop();
    }


}
