# Hi, Net Configuration Server
This server handles the parameters received from the frontend and build the real model configuration for training.

### Requirements
* JDK 1.8
* Maven  

### Getting Start
Run the Spring Boot Application   
It's on port `8080` by default  
     
The example json format is shown below
```
{
  "dataset": "iris",
  "globalVariable": {
    "iteration": "1",
    "lr": "0.01",
    "l2": "0.0002"
  },
  "layers": [
    {
      "outputDim": "1000",
      "activation": "relu",
      "weightInit": "xavier",
      "type": "dense"
    },
    {
      "outputDim": "500",
      "activation": "relu",
      "weightInit": "xavier",
      "type": "dense"
    },
    {
      "outputNum": "10",
      "activation": "softmax",
      "lossFunction": "neg",
      "type": "output"
    }
  ]
}
```