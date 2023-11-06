def call(){
    def gitCloneCommand = "git clone https://github.com/Raj-Patoliya/shared-libs.git ."
    def exitCode = gitCloneCommand.execute()
    sh "ls -al"
}