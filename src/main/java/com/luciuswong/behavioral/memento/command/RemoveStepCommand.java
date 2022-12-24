package com.luciuswong.behavioral.memento.command;

import com.luciuswong.behavioral.memento.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand {
    private String step;

    public RemoveStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        memento = receiver.getMemento();
        receiver.removeStep(step);
    }
}