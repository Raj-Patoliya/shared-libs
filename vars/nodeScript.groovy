// MySharedLibrary.groovy
def call() {
    def fileFromLibrary = libraryResource("index.js")
   if (fileFromLibrary) {
        sh "cp ${fileFromLibrary} ./" 
        sh "ls"
        sh "node index.js"
    } else {
        error("File 'index.js' not found in the shared library.")
    }
}
