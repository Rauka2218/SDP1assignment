package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
public class  PcFactory implements IComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;


    public PcFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}