def call(Map config) {
 checkout scmGit(branches: [[name: config.branch]], extensions: [], userRemoteConfigs: [[credentialsId: config.id, url: config.url]])
}
