fun main() {
    var numbers = mutableListOf<Int>();

    while (true){
        //анализирует строку как число Int и возвращает результат или null если строка не является допустимым представлением числа.
        var n = readLine()?.toIntOrNull();
        if (n != null) numbers.add(n!!);
        else {
            for (i in 0..numbers.last()-1){
                println(numbers.removeAt(0));
            }
            break
        }
    }
}