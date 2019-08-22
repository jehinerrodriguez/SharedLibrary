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

        stage('Foo Stage IF'){
            steps {
                script { 
                    log.info 'Este es el mensaje desde Foo IF'
                    log.warning 'No hay advertencias desde Foo IF!'
                }
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

        
        stage('Foo Stage ELSE'){
            steps {
                script { 
                    log.info 'Este es el mensaje desde Foo ELSE'
                    log.warning 'No hay advertencias desde Foo ELSE!'
                }
            }
        }

      }
    }
  }
}