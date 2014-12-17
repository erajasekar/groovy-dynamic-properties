println new ConfigSlurper("dev").parse(EnvironmentConfigV1.class).logRetentionBytes
println new ConfigSlurper("test").parse(EnvironmentConfigV1.class).logRetentionBytes
println new ConfigSlurper("prod").parse(EnvironmentConfigV1.class).logRetentionBytes