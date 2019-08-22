#!/usr/bin/env groovy
def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {

        stage('Stage IF') {
          steps {
            echo "El numero del Stage 1 es: " + buildNumber
          }
        }

        stage('Foo Stage'){
                script { 
                    log.info 'Starting'
                    log.warning 'Nothing to do!'
            }
        }
        
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Stage ELSE') {
          steps {
            echo "El numero del Stage 2 es: " + buildNumber
          }
        }
      }
    }
  }
}