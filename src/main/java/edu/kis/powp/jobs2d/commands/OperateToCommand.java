package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class OperateToCommand implements DriverCommand {
    private int x;
    private int y;

    public OperateToCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void execute(Job2dDriver job2dDriver) {
        job2dDriver.operateTo(x,y);
    }
}
