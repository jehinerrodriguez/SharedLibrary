#!/usr/bin/env groovy
def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Stage 1') {
          steps {
            echo "El número del Stage 1 es: " + buildNumber
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Stage 2') {
          steps {
            echo "El número del Stage 2 es: " + buildNumber
          }
        }
      }
    }
  }
}