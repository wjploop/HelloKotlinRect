import kotlinx.css.properties.IterationCount
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*

data class AppState(
    val lang: String = "lang",
    val version: String = "1.0",
    var count: Int = 0
) : RState

@JsExport
class App(props: RProps) : RComponent<RProps, AppState>(props) {
    init {
        state = AppState()
    }

    override fun RBuilder.render() {

        div {
            p { +"hello" }
            img(src = "https://placekitten.com/408/287") { }
        }
        p {
            +"lang ${state.lang}  version: ${state.version}"
        }
        p {
            +"count ${state.count}"
        }
        button {
            p { +"hello" }
            attrs.onClickFunction = {
                console.log("hello")
                setState(
                    AppState(version = state.version + 1)
                )
            }
        }
    }

}