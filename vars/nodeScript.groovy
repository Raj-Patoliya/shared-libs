def call(){
    def message = "Hello from my shared library!"
    console.log("Message from shared library: $message")
    return message
}