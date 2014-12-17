numberOfTopics = 4
numberOfPartitions = 4
availableDiskSpaceForData = 1024

environments {
    dev {
        availableDiskSpaceForData = 1024
        logRetentionBytes = availableDiskSpaceForData / (numberOfTopics * numberOfPartitions)
    }
    test {
        availableDiskSpaceForData = 10240
        logRetentionBytes = availableDiskSpaceForData / (numberOfTopics * numberOfPartitions)
    }
    prod {
        availableDiskSpaceForData = 102400
        logRetentionBytes = availableDiskSpaceForData / (numberOfTopics * numberOfPartitions)
    }
}

