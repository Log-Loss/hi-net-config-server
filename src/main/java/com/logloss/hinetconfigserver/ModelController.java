package com.logloss.hinetconfigserver;

import com.logloss.hinetconfigserver.Convolution.ConvConfig;
import com.logloss.hinetconfigserver.Convolution.ConvModel;
import com.logloss.hinetconfigserver.Dense.DenseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModelController {

    @Autowired
    private ModelService modelService;

    /* dense neural network */
    @RequestMapping(value = "/dense", method = RequestMethod.POST)
    public void buildDenseModel(@RequestBody DenseConfig config) {
        System.out.println(modelService.buildDenseModel(config));
    }

    /* convolutional neural network */
    @RequestMapping(value = "/conv", method = RequestMethod.POST)
    public void buildConvModel(@RequestBody ConvConfig config) throws Exception {
        System.out.println(modelService.buildConvModel(config));
    }
}
