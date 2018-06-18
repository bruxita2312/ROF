pipeline {
    agent any
    stages{
        stage('Build'){
            steps{
			    checkout scm
                echo 'Building...'
                sh './webAppDemo/gradlew assemble -p webappdemo'
				archiveArtifacts 'webappdemo/build/libs/quickstart.war'
            }
        }
        stage('Test'){
            steps{
                echo 'Testing...'
                sh './webappdemo/gradlew test -p webappdemo'
				junit 'webappdemo/build/test-results/test/*.xml'
				archiveArtifacts 'webappdemo/build/reports/tests/test/**/*'
            }
        }
		stage('Deploy'){
            steps{
                echo 'Deploying...'
            }
        }
    }
}