calculationParams {
    numberOfTopics = 4
    numberOfPartitions = 4
    availableDiskSpaceForData = 1024
}

calculatedProperties {
    logRetentionBytes = 'calculationParams.availableDiskSpaceForData / (calculationParams.numberOfTopics * calculationParams.numberOfPartitions)'
}
environments {
    dev {
        calculationParams.availableDiskSpaceForData = 1024
    }
    test {
        calculationParams.availableDiskSpaceForData = 10240
    }
    prod {
        calculationParams.availableDiskSpaceForData = 102400
    }
}

