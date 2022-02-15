# Kotlin gradle CUPID example

Dan North (@tastapod) released https://dannorth.net/2022/02/10/cupid-for-joyful-coding/ in which he advocates for domain based grouping of files vs their type.
A nice idea since it should allow you to add features but only adding a single folder and not changes in all modules ie.
database, gui, domain, etc.

However, type based grouping in modules in gradle super nice since we can scope dependencies to their respective modules so the gui does not have access to JDBC and vice versa.

This is an attempt to get the best of both worlds.

The idea is to group files by creating a sub suffix so gui components are called <name>.ui.kt and include these into the corresponding modules by using gradle sourceset filters `include("**/*.ui.kt")`.

# CAVEATS

While it seems to work in gradle terms, IDEA has problems with modules and overlapping folders.
This results in no editor support which is a total blocker :-/
