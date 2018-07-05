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
        sh '/usr/local/src/apache-maven/bin/mvn --version'
      }
    }
    stage('Test') {
      steps { 
        sh 'ls -a'
      }
    }
  }
}