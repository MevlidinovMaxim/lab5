fun main() {
    val set1 = mutableSetOf<String>()
    val set2 = mutableSetOf<String>()

    println("Введите товары первого пользователся: ")
    while (true) {
        var n = readLine()?.toString();
        if (n!! == "стоп") break
        set1.add(n!!);
    }

    println("Введите товары второго пользователся: ")
    while (true) {
        var n = readLine()?.toString();
        if (n!! == "стоп") break
        set2.add(n!!);
    }

    println("Общие товары пользователей: ");
    println(set1.intersect(set2))

    println("Товары исключительно 1-го пользователя: ")
    println(set1 - set1.intersect(set2))

    println("Товары только 1-го пользователся: ")
    println(set1)

    println("Товары только 2-го пользователся: ")
    println(set2)
}