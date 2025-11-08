pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/ale-greco/ProgAvanzada3.git'
            }
        }
        stage('Compile') {
            steps {
                bat 'javac -cp "lib\\junit-platform-console-standalone-1.14.1.jar" *.java'
            }
        }
        stage('Test') {
            steps {
                bat 'java -jar lib\\junit-platform-console-standalone-1.14.1.jar -cp .\\ --scan-classpath'
            }
        }
        stage('Package') {
            steps {
                bat 'jar cfm HolaMundo.jar manifest.txt *.class'
            }
        }
        stage('SmokeTest') {
            steps {
                bat 'java -jar HolaMundo.jar'
            }
        }
    }
}