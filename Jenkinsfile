pipeline {
    agent any
    stages {
        stage('version') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}