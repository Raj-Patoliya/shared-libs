// MySharedLibrary.groovy
def call() {
    def fileResource = libraryResource("index.js")
   if (fileResource) {
        def fileContents = readFile(fileResource)
        return fileContents
    } else {
        error("File 'myFile.txt' not found in the shared library.")
        return null
    }
}
