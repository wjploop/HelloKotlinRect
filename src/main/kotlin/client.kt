import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            child(App::class) {
//                attrs {
//                    "name" = "wjp"
////                    name = "Kotlin/JS"
//                }
            }
        }
    }
}
