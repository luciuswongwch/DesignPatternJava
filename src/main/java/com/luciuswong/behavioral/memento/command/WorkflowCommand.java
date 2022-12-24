package com.luciuswong.behavioral.memento.command;


public interface WorkflowCommand {
    void execute();
    void undo();
}