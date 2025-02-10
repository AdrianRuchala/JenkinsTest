pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/AdrianRuchala/JenkinsTest.git'
            }
        }

        stage('Build') {
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
