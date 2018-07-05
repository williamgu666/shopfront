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
      }
    }
    stage('Test') {
      steps { 
        sh 'ls -a'
      }
    }
  }
}