fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val evenNumbers = mutableListOf<Int>()
    list.forEach { if (it % 2 == 0) evenNumbers.add(it) }
    list.removeAll(evenNumbers) 
    println(list)
    // Or use filter and toList to create a new list
    val filteredList = list.filter { it % 2 != 0 }
    println(filteredList)
}