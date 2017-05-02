/**
* Объявление пакета
*/
package form.client; 
/**
* Добавление библиотеки графического интерфейса
*/
import java.awt.*;
/**
* Добавление библиотек графического интерфейса событий
*/
import java.awt.event.*;
/**
* Добавление класса для расчета кредита
*/
import main.CalcClassic;
/**
* Добавление класса ФормМенеджер
*/
import main.FormManager;
/**
* добавление библиотек для создания графического интерфейса
*/
import javax.swing.*;
/**
* Объявление Класса для реализации формы Клиент
*/
public class Client extends JFrame {
/**
* Создание конструктора Клиент
*/
public Client(FormManager manager) {
/**
* Объявление имени формы
*/
setTitle("Клиент");
/**
* Установка размеров для окна Клиент
*/
setPreferredSize(new Dimension(500,300));
/**
* Установка оптимального размера для формы
*/
pack();
/**
* Задание параметров установки панели
*/
getContentPane().setLayout(null);
/**
* Объявление кнопки Выход и объявление его имени
*/
JButton Close = new JButton("Выход");
/**
* Редактирование кнопки Выход
*/
method.Method.Button(Close,394, 227, 80, 23, 15);
/**
* Добавление кнопки Выход на панель
*/
getContentPane().add(Close);
/**
* Обработка событий для кнопки Выход
*/
Close.addActionListener(new ActionListener() {
/**
* Создание события для кнопки Выход
*/
public void actionPerformed(ActionEvent arg0) {
/**
* Вызов вспомогательного класса для управление формами
* Закрытие формы Клиент и открытия формы Эскобар
*/
manager.toggleForms();
/**
* Закрытие метода для управления формами
*/
}
/**
* Закрытие события для кнопки выход
*/
});
/**
* Создание надписи "Сумма кредита" и установка местоположения
*/
Label("Сумма кредита",27, 67, 151, 23, 15);
/**
* Создание надписи "Срок кредитования" и установка местоположения
*/
Label("Срок кредитования",27, 116, 151, 23, 15);
/**
* Создание надписи "Ежемесячный платеж" и установка местоположения
*/
Label("Ежемесячный платеж",27, 169, 161, 23, 15);
/**
* Создание надписи "Руб" и установка местоположения
*/
Label("Руб.",312, 175, 46, 14, 11);
/**
* Создание надписи "Руб" и установка местоположения
*/
Label("Руб.",312, 73, 46, 14, 11);
/**
* Создание надписи "Клиент" и установка местоположения
*/
Label("Клиент",205, 11, 69, 29, 18);
/**
* Объвление текстового поля Сумма
*/
JTextField Summ = new JTextField();
/**
* Установка местоположения текстового поля Сумма и добавление в него записи "10000"
*/
method.Method.TextField(Summ,"10000",205, 70, 86, 20, 10);
/**
* Добавление текстового поля на форму
*/
getContentPane().add(Summ);
/**
* Объявление текстового поля Оплата
*/
JTextField Payment = new JTextField();
/**
* Установка местоположения текстового поля Оплата
*/
method.Method.TextField(Payment, "",205, 172, 86, 20, 10);
/**
* Добавление текстового поля Оплата на форму
*/
getContentPane().add(Payment);
/**
* Объявление выпадающего списка Годы
*/
JComboBox Years = new JComboBox();
/**
* Установка местоположения выпадающего списка Годы
*/
method.Method.ComboBox(Years,false,205, 119, 69, 20);
/**
* Добавление выпадающего списка Годы
*/
getContentPane().add(Years);
/**
* Добавление элементов к выпадающему списку
*/
Years.setModel(new DefaultComboBoxModel(new String[] {"1 год", "2 года", "3 года", "4 года", "5 лет"}));

/**
* Объявления выпадающего списка Месяцы
*/
JComboBox Months = new JComboBox();
/**
* Установка местоположения выпадающего списка Месяцы
*/
method.Method.ComboBox(Months,false,289, 119, 69, 20);
/**
* Добавление выпадающего списка Месяцы на форму
*/
getContentPane().add(Months);
/**
* Добавление элементов к выпадающего списка Месяцы
*/
Months.setModel(new DefaultComboBoxModel(new String[] {"0 мес", "1 мес", "2 мес", "3 мес", "4 мес", "5 мес", "6 мес", "7 мес", "8 мес", "9 мес", "10 мес", "11 мес"}));
/**
* Объявление кнопки "Рассчитать"
*/
JButton Сalculation = new JButton("Рассчитать");
/**
* Установка местоположения кнопки "Рассчитать"
*/
method.Method.Button(Сalculation,10, 327, 116, 23, 15);
/**
* Добавление кнопки "Рассчитать" на форму
*/
getContentPane().add(Сalculation);
/**
* Обрабтка события для кнопки "Рассчитать"
*/
Сalculation.addActionListener(new ActionListener() {
/**
* Создание события для кнопки "Рассчитать"
*/
public void actionPerformed(ActionEvent arg0) {
/**
* Объявление нового объекта для расчета кредита
*/
CalcClassic cc = new CalcClassic();
/**
* Объявление переменной для вычисления процентной ставки 
*/
double bet = 0.18;
/**
* Объявление переменной Месяцы
*/
int month = 0;
/**
* Объявление переменной Годы
*/
int year = 0;
/**
* Объявление переменной Сум и присваивание ей значения из текстового поля Сумма
*/ 
int sum = Integer.parseInt(Summ.getText());
/**
* Объявление переменной Годы и присваивание ей значения из выпадающего списка Годы
*/
int oftheyear = Years.getSelectedIndex();
/**
* Объявление переменной Месяцы и присваивание ей значения из выпадающего списка Месяцы
*/
int months = Months.getSelectedIndex();
/**
* Использование оператора выбора для определения числа лет
*/
switch(oftheyear){ 
/**
* Определение числа месяцев для кейса 0 означающего 1 год
*/
case 0: year = 12; break;
/**
* Определение числа месяцев для кейса 1 означающего 2 года
*/
case 1: year = 24; break;
/**
* Определение числа месяцев для кейса 2 означающего 3 года
*/
case 2: year = 36; break;
/**
* Определение числа месяцев для кейса 3 означающего 4 года
*/
case 3: year = 48; break; 
/**
* Определение числа месяцев для кейса 4 означающего 5 лет
*/
case 4: year = 60; break; 
/**
* Завершение работы оператора выбора
*/
}
/**
* Использование оператора выбора для определения числа месяцев 
*/
switch(months){
/**
* Определение числа месяцев для кейса 0 
*/
case 0: month = 0; break;
/**
* Определение числа месяцев для кейса 1 
*/
case 1: month = 1; break;
/**
* Определение числа месяцев для кейса 2 
*/
case 2: month = 2; break;
/**
* Определение числа месяцев для кейса 3 
*/
case 3: month = 3; break;
/**
* Определение числа месяцев для кейса 4 
*/
case 4: month = 4; break;
/**
* Определение числа месяцев для кейса 5 
*/
case 5: month = 5; break;
/**
* Определение числа месяцев для кейса 6 
*/
case 6: month = 6; break;
/**
* Определение числа месяцев для кейса 7 
*/
case 7: month = 7; break;
/**
* Определение числа месяцев для кейса 8 
*/
case 8: month = 8; break;
/**
* Определение числа месяцев для кейса 9
*/
case 9: month = 9; break;
/**
* Определение числа месяцев для кейса 10
*/
case 10: month = 10; break;
/**
* Определение числа месяцев для кейса 11 
*/
case 11: month = 11; break;
/**
* Завершение работы оператора выбора для определения числа месяцев
*/
}
/**
* Объявление переменной Время и расчет времени в сумме
*/
int time = year + month;
/**
* Расчет оплаты и присваивание результата в текстовое поле Оплата 
*/
Payment.setText(cc.getP(sum, bet, time));
/**
* Завершение работы объекта для расчета кредита
*/
}
/**
* Завершение работы вспомогательного класса для управления кнопки Рассчитать
*/
});
/**
* Установка шрифта, фона и размера надписи
*/
Сalculation.setFont(new Font("Tahoma", Font.PLAIN, 15));
/**
* Установка местоположения кнопки Рассчитать
*/
Сalculation.setBounds(22, 227, 116, 23);
/**
* Завершение работы конструктора Клиент
*/
}
/**
* Объявление метода Надпись
*/
private void Label(String attribute, int x,int y,int width,int height,int Columns) {
/**
* Создание нового объекта Надпись
*/
    JLabel label = new JLabel(attribute);
/**
* Установка шрифта, фона и размера надписи
*/
	label.setFont(new Font("Tahoma", Font.PLAIN, Columns));
/**
* Установка местоположения надписи
*/
	label.setBounds(x, y, width, height);
/**
* Добавление надписи на форму
*/
	getContentPane().add(label);
/**
* Завершение работы метода Надпись
*/
}
/**
*Завершение создания класса Клиент 
*/
}
