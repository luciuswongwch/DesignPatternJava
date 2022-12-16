package com.luciuswong.abstractfactory.gcp;

import com.luciuswong.abstractfactory.Instance;
import com.luciuswong.abstractfactory.Storage;


public class GoogleComputeEngineInstance implements Instance {
    public GoogleComputeEngineInstance(Capacity capacity) {
        // Map capacity to Google Cloud Platform compute instance types. Use GCP API to provision
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped");
    }
}