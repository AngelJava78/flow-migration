pipeline {
  agent any

  stages {
    stage ('Create package') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('Java app execution') {
      steps{
        sh 'java -jar target/flow-migration-0.0.1-SNAPSHOT.jar --name=Angel --age=20'
      }
    }

  }
}