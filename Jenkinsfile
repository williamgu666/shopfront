pipeline {
  agent any
  stages {
    stage('myStage'){
      steps {
        sh 'ls -la' 
      }
    }
    stage('Build') {
      steps { 
        sh 'pwd && mvn --version'
        sh 'cd shopfront && mvn clean install'
      }
    }
    stage('Test') {
      steps { 
        sh 'ls -a'
      }
    }
  }
}