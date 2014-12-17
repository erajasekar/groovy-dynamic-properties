println evaluateCalculatedProperties(new ConfigSlurper("dev").parse(EnvironmentConfigDynamic.class)).logRetentionBytes
println evaluateCalculatedProperties(new ConfigSlurper("test").parse(EnvironmentConfigDynamic.class)).logRetentionBytes
println evaluateCalculatedProperties(new ConfigSlurper("prod").parse(EnvironmentConfigDynamic.class)).logRetentionBytes


private ConfigObject evaluateCalculatedProperties(ConfigObject config) {
    config.calculatedProperties.flatten().each { k, v ->
           // println("Evaluating: ${k} == > ${v}");
            def value = Eval.me("calculationParams", config.calculationParams, v.toString());
           // println("Evaluated: ${k} == > ${value}");
            config.put(k, value);
        }
    return config;
}