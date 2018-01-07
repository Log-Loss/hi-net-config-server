package com.logloss.hinetconfigserver;

import com.logloss.hinetconfigserver.Convolution.ConvConfig;
import com.logloss.hinetconfigserver.Convolution.ConvModel;
import com.logloss.hinetconfigserver.Dense.DenseConfig;
import com.logloss.hinetconfigserver.Dense.DenseModel;
import com.logloss.hinetconfigserver.Recurrent.RnnConfig;
import com.logloss.hinetconfigserver.Recurrent.RnnModel;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

    public MultiLayerConfiguration buildDenseModel(DenseConfig config) {
        return new DenseModel(config).getConfig();
    }

    public MultiLayerConfiguration buildConvModel(ConvConfig config) {
        return new ConvModel(config).getConfig();
    }

    public MultiLayerConfiguration buildRnnModel(RnnConfig config) {
        return new RnnModel(config).getConfig();
    }
}
