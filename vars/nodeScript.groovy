def call() {
    def fileResource = libraryResource("index.js")
    writeFile file: "index.js", text: fileResource
    sh "node index.js"
}
