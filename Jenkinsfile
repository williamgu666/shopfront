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
        sh './build_all2.sh'
      }
    }
    stage('Test') {
      steps { 
        sh 'ls -a'
      }
    }
  }
}