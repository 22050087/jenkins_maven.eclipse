pipeline {
    agent { docker { image 'maven:3.8.6-amazoncorretto-18' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}