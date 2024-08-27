def call(Map config){
  sh "docker build -t ${config.image}:${BUILD_NUMBER} ."
  docker.withRegistry( 'https://index.docker.io/v1/', "${config.user}" ){
                        sh "docker push ${config.image}:${BUILD_NUMBER}"
                    }
}
