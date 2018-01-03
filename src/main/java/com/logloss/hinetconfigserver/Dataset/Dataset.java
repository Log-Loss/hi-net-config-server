package com.logloss.hinetconfigserver.Dataset;

import com.logloss.hinetconfigserver.Utils.DataConfig;

public class Dataset {

    private DataConfig MNISTConfig = new DataConfig(28*28, 10);
    private DataConfig IrisConfig = new DataConfig(3, 3);

    private Dataset() {
        MNISTConfig.setImageType(28, 28, 1);
        IrisConfig.setTensorType();
    }

    public static DataConfig getDataConfig(String dataset) {
        switch (dataset) {
            case "minst":
                return new Dataset().MNISTConfig;
            case "iris":
                return new Dataset().IrisConfig;
        }
        return new DataConfig();
    }
}
