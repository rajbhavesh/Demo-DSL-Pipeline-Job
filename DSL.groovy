pipelineJob('Job-KubeadmCreation') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/rajbhavesh/Demo.git')
            }
            scriptPath('demo/jenkinsfile')
        }
    }
}
