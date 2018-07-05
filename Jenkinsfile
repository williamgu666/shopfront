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
        sh './build_all.sh'
      }
    }
    stage('Test') {
      steps { 
        sh 'ls -a'
      }
    }
  }
}