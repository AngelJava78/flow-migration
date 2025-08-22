pipeline {
  agent any

  stages {
    stage ('Create package') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Java app execution') {
      steps{
        sh 'java -jar target/flow-migration.jar --name=Angel --age=20'
      }
    }

  }
}