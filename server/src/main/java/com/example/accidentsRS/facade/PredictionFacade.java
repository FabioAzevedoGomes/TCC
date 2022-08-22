package com.example.accidentsRS.facade;

import com.example.accidentsRS.data.RegionRiskData;
import com.example.accidentsRS.exceptions.PersistenceException;
import com.example.accidentsRS.model.Location;
import org.bson.types.Binary;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PredictionFacade {
    void savePredictiveModel(MultipartFile predictiveModel) throws PersistenceException;
    Binary getPredictiveModel(String modelName);
    float predict(Location location);
    List<RegionRiskData> getForecast();
}
