import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       /*Задача 1
Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
Эту проверку вы уже реализовывали в задании по условным операторам.
Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
«...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».*/

        System.out.println("Task 1");
        checkTheYear(2025);
        System.out.println();

        /*Задача 2
Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
Если устройство старше текущего года, предложите ему установить облегченную версию.
Текущий год можно получить таким способом:
int currentYear = LocalDate.now().getYear();
Или самим задать значение вручную — ввести в переменную числовое значение.
В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную)
и для какой ОС (Android или iOS) установить пользователю.*/

        System.out.println("Task 2");
        os(1, 2023);
        System.out.println();

        /*Задача 3
Возвращаемся к задаче на расчет дней доставки банковской карты. Ваша задача — доработать код, а именно написать метод,
который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
Свыше 100 км доставки нет.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
Напишите программу, которая выдает сообщение в консоль: «Потребуется дней: ... » + срок доставки.
Объявите целочисленную переменную
deliveryDistance = 95, которая содержит дистанцию до клиента.*/

        System.out.println("Task 3");
        delivery(95);
        System.out.println();
    }

    //Методы к задачам

    // Задача 1

    public static void checkTheYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    //Задача 2

    public static void os(int usOS, int yearDev) {
        int currentYear = LocalDate.now().getYear();
        int iOS = 0;
        int android = 1;
        boolean androidOld = usOS == 1 && yearDev < currentYear;
        boolean androidNew = usOS == 1 && yearDev >= currentYear;
        boolean iOSOld = usOS == 0 && yearDev < currentYear;
        boolean iOSNew = usOS == 0 && yearDev >= currentYear;
        if (androidOld) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: ");
        } else if (androidNew) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        } else if (iOSOld) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке: ");
        } else if (iOSNew) {
            System.out.println("Установите версию приложения для iOS по ссылке: ");
        }

    }

    //Задача 3

    public static void delivery(int distance) {
        int deliveryDays = 1;
        if (distance <= 20) {
            System.out.println("Доставка займет " + deliveryDays + " д.");
        } else if (distance > 20 && distance <= 60) {
            deliveryDays ++;
            System.out.println("Доставка займет " + deliveryDays + " д.");
        } else if (distance > 60 && distance <= 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Доставка займет " + deliveryDays + " д.");
        } else if (distance > 100) {
            System.out.println("Доставки нет.");
            }
    }
}
