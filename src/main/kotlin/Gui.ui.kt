import kotlinx.html.*
import kotlinx.html.stream.appendHTML

data class UserTable(
    val users: List<UserRow>,
)

data class UserRow(
    val name: String,
)

class Gui {

    fun render(table: UserTable): Appendable.() -> Unit = {
        appendLine("<!DOCTYPE html>")
        appendHTML().html {
            body {
                for (user in table.users) {
                    div {
                        +user.name
                    }
                }
            }
        }
        appendLine()
    }

}
