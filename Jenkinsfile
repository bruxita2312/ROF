pipeline {
    agent any
    stages{
        stage('Build'){
            steps{
			    checkout scm
                echo 'Building...'
                sh './webAppdemo/quickstart/gradlew assemble -p webAppdemo/quickstart'
				archiveArtifacts 'webAppdemo/build/libs/quickstart.war'
            }
        }
        stage('Test'){
          steps{
            echo 'Testing...'
            sh './webAppdemo/quickstart/gradlew test -p webAppdemo/quickstart'
				    junit './webAppdemo/quickstart/build/test-results/test/*.xml'
				    archiveArtifacts './webAppdemo/quickstart/build/reports/tests/test/**/*'
            }
        }
		stage('Deploy'){
            steps{
                echo 'Deploying...'
            }
        }
    }
}