pipeline {
    agent any
    stages{
        stage('Build'){
            steps{
			    checkout scm
                echo 'Building...'
                sh './webAppdemo/gradlew assemble -p webAppdemo'
				archiveArtifacts 'webAppdemo/build/libs/quickstart.war'
            }
        }
        stage('Test'){
            steps{
                echo 'Testing...'
                sh './webAppdemo/gradlew test -p webAppdemo'
				junit 'webAppdemo/build/test-results/test/*.xml'
				archiveArtifacts 'webAppdemo/build/reports/tests/test/**/*'
            }
        }
		stage('Deploy'){
            steps{
                echo 'Deploying...'
            }
        }
    }
}