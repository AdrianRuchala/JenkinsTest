pipeline {
    agent any

    stages {
        stage('Checkout') {
                    steps {
                        checkout([$class: 'GitSCM',
                                  branches: [[name: '*/main']],
                                  extensions: [],
                                  userRemoteConfigs: [[credentialsId: 'github-credentials',
                                                       url: 'https://github.com/AdrianRuchala/JenkinsTest.git']]])
                    }
                }

        stage('Build') {
                    agent {
                        docker {
                            image 'your-android-image-name'
                            label 'android-agent'
                        }
                    }
                    steps {
                        sh './gradlew build'
                    }
                }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Deploy') {
            steps {
                sh 'echo "Deployment step here"'
            }
        }
    }
}
