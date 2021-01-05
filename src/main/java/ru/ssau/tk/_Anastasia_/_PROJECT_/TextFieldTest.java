package ru.ssau.tk._Anastasia_._PROJECT_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest extends JFrame
{
    // Текстовые поля
    JTextField smallField, bigField;

    public TextFieldTest()
    {
        super("Текстовые поля");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создание текстовых полей
        smallField = new JTextField(15);
        smallField.setToolTipText("Короткое поле");
        bigField = new JTextField(" ", 25);
        bigField.setToolTipText("Длиное поле");
        // Настройка шрифта
        bigField.setFont(new Font("Dialog", Font.PLAIN, 14));
        bigField.setHorizontalAlignment(JTextField.RIGHT);
        // Слушатель окончания ввода
        smallField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                JOptionPane.showMessageDialog(TextFieldTest.this,
                        "Ваше слово: " + smallField.getText());
            }
        });
        // Поле с паролем
        JPasswordField password = new JPasswordField(12);
        password.setEchoChar('*');
        // Создание панели с текстовыми полями
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(smallField);
        contents.add(bigField  );
        contents.add(password  );
        setContentPane(contents);
        // Определяем размер окна и выводим его на экран
        setSize(400, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TextFieldTest();
    }
}