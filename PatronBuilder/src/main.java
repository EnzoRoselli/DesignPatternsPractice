import models.entities.Cpu;
import models.entities.Monitor;
import models.entities.Robot;
import models.entities.Speakers;

public class main {

    public static void main(String[] args) {

//        Robot robot1 = new Robot.Builder().monitor(Monitor.Samsung).monitor(Monitor.Samsung)
//                .monitor(Monitor.Samsung).cpu(Cpu.Intel).cpu(Cpu.Intel).cpu(Cpu.Intel).build();
//
//        robot1.showItems();

//        Robot robot2 = new Robot.Builder().cpu(Cpu.AMD).monitor(Monitor.LG).speakers(Speakers.Stereo)
//                .cpu(Cpu.AMD).monitor(Monitor.LG).speakers(Speakers.Stereo).build();
//
//        robot2.showItems();

        Robot robot3 = new Robot.Builder().cpu(Cpu.AMD).monitor(Monitor.Samsung).speakers(Speakers.Surround)
                .cpu(Cpu.AMD).monitor(Monitor.Samsung).speakers(Speakers.Surround).build();
        robot3.showItems();
    }
}
