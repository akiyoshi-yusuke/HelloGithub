#!groovy

node {
    step([$class: 'GitHubSetCommitStatusBuilder'])

    stage 'Checkout'
    checkout scm

    stage 'Build and test'
    env.PATH = "${tool 'maven3.3.9'}/bin:${env.PATH}"

    try {
        echo "Build and test ${env.BRANCH_NAME}"
        sh 'mvn clean test'
        currentBuild.result = 'SUCCESS'
    } catch (err) {
        currentBuild.result = 'FAILURE'
    }

    stage 'Notify'
    step([$class: 'GitHubCommitNotifier', resultOnFailure: 'FAILURE'])
    
    // And notify Hipchat, LINE bot or Slack...etc
}
