package Homework.Modul_Eight;
/*Да се напише клас фирма (Company), който има следните член променливи:
• Име на фирмата – тип string;
• Дата на създаване на фирмата – тип string;
• Булстат – уникален 10 знаков код включващ букви и цифри – тип string.
За всички член променливи напишете get и set методи, като за последния направете проверка за
дължина на string-а в set-метода му(length = 10).
Да се напише клас Фирма-ЕТ, който да наследява класа Фирма и да има следните член променливи:
• Име на собственика, учредил фирмата- тип string;
• Първоначален капитал – тип double;
• Актуален капитал – тип double;
За всички член променливи напишете get и set методи.
Класът Фирма-ЕТ трябва да има метод, който изчислява печалбата към днешна дата на фирмата. Той
трябва да бъде нестатичен, да не приема параметри, и трябва да връща като резултат число double,
което да бъде разликата между актуалния и първоначалния капитал на съответната фирма.
Помислете за общи дейности за всяка фирма, но различаващи се по изпълнение за всяка конкретна
компания. Създайте интерфейс описващ тези действия и ги имплементирайте във Фирма-ЕТ или нов
клас от друг тип компания*/
public interface Companies {
    String companyName();
    String startingDate();
    String bulstat();


    public interface Services {
        String bookAnAppointment();
        String payment();
        String refundPolicy();

    }
}
