package com.logloss.hinetconfigserver;

import com.logloss.hinetconfigserver.Convolution.ConvConfig;
import com.logloss.hinetconfigserver.Dense.DenseConfig;
import com.logloss.hinetconfigserver.Recurrent.RnnConfig;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ModelController {

    @Autowired
    private ModelService modelService;

    /* dense neural network */
    @RequestMapping(value = "/dense", method = RequestMethod.POST)
    public void buildDenseModel(@RequestBody DenseConfig config) {
        MultiLayerConfiguration conf = modelService.buildDenseModel(config);
        System.out.println(conf);
//        //for test
//        MultiLayerNetwork model = new MultiLayerNetwork(conf);
//        DataSetIterator iterator = new IrisDataSetIterator(32, 100);
//        model.fit(iterator);
//        Evaluation eval = model.evaluate(iterator);
//        System.out.println(eval);
    }

    /* convolutional neural network */
    @RequestMapping(value = "/conv", method = RequestMethod.POST)
    public void buildConvModel(@RequestBody ConvConfig config) throws Exception {
        MultiLayerConfiguration conf = modelService.buildConvModel(config);
        System.out.println(conf);
//        //for test
//        MultiLayerNetwork model = new MultiLayerNetwork(conf);
//        DataSetIterator iterator = new MnistDataSetIterator(32, 100);
//        model.fit(iterator);
//        Evaluation eval = model.evaluate(iterator);
//        System.out.println(eval);
    }

    /* recurrent neural network */
    @RequestMapping(value = "/rnn", method = RequestMethod.POST)
    public void buildRnnModel(@RequestBody RnnConfig config) throws Exception {
        MultiLayerConfiguration conf = modelService.buildRnnModel(config);
        System.out.println(conf);
    }


}
