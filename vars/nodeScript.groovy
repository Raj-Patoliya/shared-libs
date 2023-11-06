// MySharedLibrary.groovy
def call() {
    def fileResource = libraryResource("index.js")
    writeFile file: "index.js", text: fileResource
    sh "ls"
    sh "node index.js"
}
