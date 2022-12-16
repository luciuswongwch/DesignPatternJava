package com.luciuswong.abstractfactory;


public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capMib);
    // Network createNetwork(String networkName);
}