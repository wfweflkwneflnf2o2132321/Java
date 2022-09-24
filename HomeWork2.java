package Dz2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HomeWork2 {
    public static void main(String[] args) {
        Horn horn = new Horn();
        EngineV12 engineV12 = new EngineV12();
        ONE one=new ONE(horn,engineV12);
        System.out.println(one.engine.getSpeed());
        System.out.println(one.beeper.makeSound());
        System.out.println(one.Savedays());
        System.out.println(one.Savemoney());



        HornBus hornBus=new HornBus();
        EBUS ebus=new EBUS();
        Bus15 bus15=new Bus15(hornBus,ebus);
        System.out.println(bus15.engineBus.getSpeed());
        System.out.println(bus15.beeperBus.makeSound());

    }
}
