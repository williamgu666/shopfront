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
        sh 'docker build -t hdtrd/djshopfront . && docker push hdtrd/djshopfront'
      }
    }
    stage('Test') {
      steps { 
        sh 'ls -a'
      }
    }
  }
}