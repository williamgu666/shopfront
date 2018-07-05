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
        sh 'mvn --version'
      }
    }
    stage('Test') {
      steps { 
        sh 'ls -a'
      }
    }
  }
}