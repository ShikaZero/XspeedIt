fun Long.main() : String{
    var result = Pair("", this.toString().toMutableList())
    while (result.second.isNotEmpty()) result = putItemOnBox(result)
    return result.first
}

private fun putItemOnBox(value: Pair<String, MutableList<Char>>): Pair<String, MutableList<Char>> {
    var result = value.first
    var boxSize = 0
    value.second.toList().forEach { article ->
        if(boxSize == 10 || !value.second.any { checkBoxSpace(it, boxSize) }) {
            result += "/"
            boxSize = 0
        }
        value.second.find { checkBoxSpace(it, boxSize) }?.let {
            result += it; value.second.remove(it); boxSize += it.toString().toInt()
        }
    }
    return Pair(result, value.second)
}

private fun checkBoxSpace(it: Char, boxSize: Int) = it.toString().toInt() + boxSize < 11
