pipeline {
    agent any

    stages {
	
        stage ('Download from GitHub') {
            steps {
				git 'https://github.com/haris-git-hub/ames.git'
            }
        }

        stage ('Maven clean') {
            steps {
				bat label: 'Maven clean', script: 'mvn clean' 
            }
        }

        stage ('Maven package') {
            steps {
				bat label: 'Maven package', script: 'mvn package' 
            }
        }
				
    }
	
}




