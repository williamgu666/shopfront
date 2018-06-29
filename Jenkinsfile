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
        sh 'ls'
      }
    }
    stage('Test') {
      steps {
	      def mvn_version = 'apache-maven-3.5.3'
		  withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
			sh 'cd functional-e2e-tests && mvn clean verify' 
		  }
      }
    }
  }
}