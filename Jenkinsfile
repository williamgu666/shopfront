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
        sh 'cd shopfront && docker build -t hdtrd/djshopfront . && docker push hdtrd/djshopfront'
      }
    }
    stage('Test') {
      steps { 
        sh 'ls -a'
        timeout(time: 180, unit: 'SECONDS') {
            try {
                sh 'docker-compose up -d'
                waitUntil { // application is up
                    def r = sh script: 'curl -s http://localhost:8010/health | grep "UP"', returnStatus: true
                    return (r == 0);
                }

                // conduct main test here
                def mvn_version = 'apache-maven-3.5.3'
                def javaHome = tool 'JDK - 8'
                withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
                    sh 'cd functional-e2e-tests && mvn clean verify'
                }

            } finally {
                sh 'docker-compose stop'
            }
        }
      }
    }
  }
}