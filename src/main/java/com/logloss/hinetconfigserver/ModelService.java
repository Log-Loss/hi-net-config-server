package com.logloss.hinetconfigserver;

import com.logloss.hinetconfigserver.Convolution.ConvConfig;
import com.logloss.hinetconfigserver.Convolution.ConvModel;
import com.logloss.hinetconfigserver.Dense.DenseConfig;
import com.logloss.hinetconfigserver.Dense.DenseModel;
import com.logloss.hinetconfigserver.Recurrent.RnnConfig;
import com.logloss.hinetconfigserver.Recurrent.RnnModel;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

    @Autowired
    private ModelRepository modelRepository;

    public MultiLayerConfiguration buildDenseModel(DenseConfig config) {
        MultiLayerConfiguration configuration = new DenseModel(config).getConfig();
        modelRepository.insert(configuration);
        return configuration;
    }

    public MultiLayerConfiguration buildConvModel(ConvConfig config) {
        MultiLayerConfiguration configuration = new ConvModel(config).getConfig();
        modelRepository.insert(configuration);
        return configuration;
    }

    public MultiLayerConfiguration buildRnnModel(RnnConfig config) {
        MultiLayerConfiguration configuration = new RnnModel(config).getConfig();
        modelRepository.insert(configuration);
        return configuration;
    }
}
