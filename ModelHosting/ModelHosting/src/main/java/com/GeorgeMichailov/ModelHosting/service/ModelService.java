package com.GeorgeMichailov.ModelHosting.service;

import com.GeorgeMichailov.ModelHosting.Models.StringInputData;
import org.springframework.stereotype.Service;
import org.tensorflow.SavedModelBundle;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ModelService {

    private Map<String, SavedModelBundle> modelCache = new ConcurrentHashMap<>();

    public SavedModelBundle getModel(String modelName) {
        if(!modelCache.containsKey(modelName)) {
            SavedModelBundle model = SavedModelBundle.load("" + modelName, "serve")
        }
    }

}
