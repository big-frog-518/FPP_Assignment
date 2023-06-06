package day7.q5;

import java.util.Objects;

/**
 * @Author Jinxu Zheng
 * @Date 6/6/2023
 **/
public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;

    Computer(String manufacturer,String processor,int ramSize,double processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }
    int getRamSize(){
        return ramSize;
    }
    double getProcessorSpeed(){
        return processorSpeed;
    }

    double computePower(){
        return ramSize*processorSpeed;
    }

    public String toString() {
        return "ramSize:"+ getRamSize()+";"+"processorSpeed:"+getProcessorSpeed()+";"+"computerPower:"+computePower();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramSize == computer.ramSize && Double.compare(computer.processorSpeed, processorSpeed) == 0 && Objects.equals(manufacturer, computer.manufacturer) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }
}
