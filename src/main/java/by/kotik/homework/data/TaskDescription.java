package by.kotik.homework.data;

public enum TaskDescription {
     Task1("Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата."),
    Task2("Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце" +
            " и корректно определялись все високосные года."),
    Task3("Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность. " +
            "Во сколько раз площадь вписанного квадрата меньше площади заданного?"),
    Task4("Составить программу, печатающую значение true, если указанное высказывание является истинным, " +
            "и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных."),
    Task5("Составить программу, печатающую значение true, если указанное высказывание является истинным, " +
            "и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу)."),
    Task6("Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту."),
    Task7("Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек " +
            "находится ближе к началу координат. x y."),
    Task8("Вычислить значение функции:"),
    Task9("Вычислить длину окружности и площадь круга одного и того же заданного радиуса R."),
    Task10("Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. " +
            "Результат представить в виде таблицы, первый столбец которой – значения аргумента, " +
            "второй - соответствующие значения функции.");

    private String description;

    TaskDescription(String description) {
        this.description = description;
    }

    public String getTaskDescription() {
        return description;
    }
}
