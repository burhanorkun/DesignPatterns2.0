package com.orkun.mydp.state;

public class StoppedState implements State{
    private ControlWatch controlWatch;

    public StoppedState(ControlWatch controlWatch) {
        this.controlWatch = controlWatch;
    }

    @Override
    public void click() {
        controlWatch.setCurrentState(new RunningState(controlWatch));
        System.out.println("Running");
    }
}
