pipeline {
    agent any

    stages {
        stage('Getting the project from GIT') {
            steps {
                echo 'Pulling..'
                git branch: 'master', url: 'https://github.com/joaoalvescoelho/Adivinha.git'
            }
        }

        stage('Cleaning the project') {
            steps {
                echo 'Cleaning project ...'
                sh 'mvn clean'
            }
        }

        stage('Artifact Construction') {
            steps {
                echo "Artifact construction"
                sh 'mvn package'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn --batch-mode -Dmaven.test.failure.ignore=true test'
            }
        }
    }
}
