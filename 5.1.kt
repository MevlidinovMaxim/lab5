fun main() {
    val dict = mapOf("Аутентичный" to "подлинный","Идиосинкразия" to "непереносимость",
        "Коллаборация" to "сотрудничество профессионалов над общим проектом");
    print("Введите слово: ")
    var word = readLine().toString();
    if (word in dict)
        print(dict[word])
    else println("Значения этого слова нет в словаре.")
}