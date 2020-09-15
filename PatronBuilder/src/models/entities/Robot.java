package models.entities;

import java.util.ArrayList;
import java.util.List;

public final class Robot {

    private final List<Cpu> cpu;
    private final List<Monitor> monitor;
    private  final List<Speakers> speakers;

    public Robot(Builder builder) {
        this.cpu = builder.cpu;
        this.monitor = builder.monitor;
        this.speakers = builder.speakers;
    }

    public List<Cpu> getCpu() {
        return cpu;
    }

    public List<Monitor> getMonitor() {
        return monitor;
    }

    public List<Speakers> getSpeakers() {
        return speakers;
    }

    public void showItems() {

        for (int i = 0; i < cpu.size() || i < monitor.size() || i < speakers.size(); i++) {

            if (monitor.size() > i){
                System.out.println("Assembling Monitor " + monitor.get(i).toString() + "...");
            }

            if (cpu.size() > i){
                System.out.println("Assembling CPU " + cpu.get(i).toString() + "...");
            }

            if (speakers.size() > i){
                System.out.println("Assembling Speakers " + speakers.get(i).toString() + "...");
            }
        }
    }

    public static class Builder{

        private List<Cpu> cpu;
        private List<Monitor> monitor;
        private List<Speakers> speakers;

        public Builder() {
            this.cpu = new ArrayList<>();
            this.monitor = new ArrayList<>();
            this.speakers = new ArrayList<>();
        }

        public Builder cpu(Cpu cpu){
            this.cpu.add(cpu);
            return this;
        }

        public Builder monitor(Monitor monitor){
            this.monitor.add(monitor);
            return this;
        }

        public Builder speakers(Speakers speakers){
            this.speakers.add(speakers);
            return this;
        }

        public Robot build(){
            return new Robot(this);
        }
    }
}
