import java.util.*

fun main() {
    val numbers = Stack<Int>()

    while (true){
        var n = readLine()?.toIntOrNull();
        if (n != null) numbers.push(n!!);
        else {
            while (!numbers.empty()) {
                println(numbers.pop())
            }
            break
        }
    }
}