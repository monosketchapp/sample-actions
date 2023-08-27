import kotlinx.browser.document

fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)
    container.innerHTML = "<h1>Hello, Kotlin/JS!</h1>"
}