// "Replace with 'newFun()'" "true"

class C {
    @deprecated("", ReplaceWith("newFun()"))
    fun oldFun(): Int {
        return newFun()
    }
}

fun newFun(): Int = 0

fun foo(): Int? {
    return getC()?.<caret>oldFun()
}

fun getC(): C? = null
