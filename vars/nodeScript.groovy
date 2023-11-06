// MySharedLibrary.groovy
def call() {
    def fileResource = libraryResource("index.js")
    sh "echo ${fileResource}"
}
