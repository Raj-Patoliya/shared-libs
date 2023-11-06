// MySharedLibrary.groovy
def call() {
    def fileFromLibrary = libraryResource("index.js")
    sh "cat ${fileFromLibrary}"
}
