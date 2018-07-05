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
        sh 'ls -l'
      }
    }
    stage('Test') {
      steps { 
        sh 'ls -a'
      }
    }
  }
}