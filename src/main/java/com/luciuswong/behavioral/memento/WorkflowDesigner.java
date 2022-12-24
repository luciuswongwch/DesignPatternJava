package com.luciuswong.behavioral.memento;

public class WorkflowDesigner {
    private Workflow workflow;

    public Workflow getWorkflow() {
        return this.workflow;
    }

    public void createWorkflow(String name) {
        workflow = new Workflow(name);
    }
    public Memento getMemento() {
        return workflow == null ? null : new Memento(workflow.getName(), workflow.getSteps());
    }
    public void setMemento(Memento memento) {
        this.workflow = memento == null ? null : new Workflow(memento.getName(), memento.getSteps());
    }

    public void addStep(String step) {
        workflow.addStep(step);
    }
    public void removeStep(String step) {
        workflow.removeStep(step);
    }
    public void print() {
        System.out.println(workflow);
    }

    public class Memento {
        private String name;
        private String[] steps;
        private Memento(String name, String[] steps) {
            this.name = name;
            this.steps = steps;
        }
        private String getName() {
            return name;
        }
        private String[] getSteps() {
            return steps;
        }
    }
}