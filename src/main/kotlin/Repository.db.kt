
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction

private object UserTable : Table("user"){
    val id = integer("id")
    val name = varchar("name", 255)
}

data class User(
    val username: String,
)

class Repository {

    fun getUsers() = transaction {
        UserTable.selectAll().map {
            User(it[UserTable.name])
        }
    }

}