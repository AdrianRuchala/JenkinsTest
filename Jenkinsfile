pipeline {
    agent any

    stages {
        stage('Checkout') {
                    steps {
                        checkout([$class: 'GitSCM',
                                  branches: [[name: '*/main']],  // Or your branch specifier
                                  extensions: [],
                                  userRemoteConfigs: [[credentialsId: 'github-credentials',  // Your credential ID
                                                       url: 'https://github.com/AdrianRuchala/JenkinsTest.git']]])
                    }
                }

        stage('Build') {
            steps {
                sh 'chmod +x ./gradlew'
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
