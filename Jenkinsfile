pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/badrul-devops/compozent-task.git'
            }
        }
              
        stage('Test') {
            steps  { 
                
                sh 'mvn clean test'
                }
            }
        
        stage('docker build') {
            steps {
                sh 'cd selenium-test'
                sh 'docker build -t badrul11/selenium-test .'
            }
        }
    }
}
