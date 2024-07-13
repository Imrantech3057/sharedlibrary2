def download(repo)
{
  git 'https://github.com/Imrantech3057/${repo}
}
def build()
{
  sh 'mvn package'
}
def deploy(jobname,ip,appname)
{
  sh 'scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${appname}
}
def runselenium(jobname)
{
  sh 'java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar
}
