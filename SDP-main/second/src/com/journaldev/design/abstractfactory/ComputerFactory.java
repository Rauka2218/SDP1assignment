package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;
public class ComputerFactory {
    public static Computer getComputer(IComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
