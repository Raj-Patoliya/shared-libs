// MySharedLibrary.groovy
def call() {
    def fileFromLibrary = libraryResource("resources/index.js")
   if (fileFromLibrary) {
        sh "cat ${fileFromLibrary}" 
        sh "ls"
        sh "node index.js"
    } else {
        error("File 'index.js' not found in the shared library.")
    }
}
