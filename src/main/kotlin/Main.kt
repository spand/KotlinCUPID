
val repo = Repository()
val gui = Gui()

fun main() {
    // Here we wire the modules together.
    val output = gui.render(UserTable(repo.getUsers().map { UserRow(it.username) }))
    System.out.output()
}
