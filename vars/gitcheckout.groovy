def call(Map stageParams) {
checkout([
  $class: 'GitSCM', 
  branches: [[name: stageParams.branch]],
  extensions: [], 
  userRemoteConfigs: [[credentialsId: stageParams.credentials, 
                url: stageParams.url]]])
}
