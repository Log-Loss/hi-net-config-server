package com.logloss.hinetconfigserver;

import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface ModelRepository extends MongoRepository<MultiLayerConfiguration, String> {

}
