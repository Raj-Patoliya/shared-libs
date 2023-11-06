// MySharedLibrary.groovy
def call() {
    def gitCloneCommand = "git clone https://github.com/Raj-Patoliya/shared-libs.git ."
    def exitCode = gitCloneCommand.execute()

    if (exitCode != 0) {
        error("Git clone failed with exit code $exitCode")
    }
}
