def call(Map config){
  sh "docker build -t config.image:${BUILD_NUMBER} ."
}
