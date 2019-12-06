pipelineJob('Job-KubeadmCreation') {
     description('This is the job for creating a single node kubernetes cluster')
    definition {
        cpsScm {
            scm {
                git('https://github.com/rajbhavesh/Demo.git', 'master')
            }
            scriptPath('jenkinsfile')
        }
    }
}
