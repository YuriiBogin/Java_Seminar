package HomeWork_S2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class HW_2_2 {
    public HW_2_2() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        File fl = new File("file.txt");

        if (fl.createNewFile()){
            System.out.println("Текстовый файл создан.");
        }
        else{
            System.out.println("Текстовый файл уже существует.");
        }

        String text = String.valueOf(buildString());

        FileWriter writer = new FileWriter (fl);
        assert text != null;
        writer.write(text);
        writer.close();

        System.out.println ("Имя файла: " + fl .getName());
        System.out.println ("Путь: " + fl.getPath());
        System.out.println ("Полный путь: " +
                fl.getAbsolutePath());
        System.out.println ("Родительский каталог: " +
                fl.getParent());
        System.out.println (fl.exists() ?
                "Файл существует" :
                "Файл  не существует");
        System.out.println (fl.canWrite() ?
                "Свойство - можно записывать" :
                "Свойство - нельзя записывать");
        System.out.println (fl.canRead() ?
                "Свойство - можно читать" :
                "Свойство - нельзя читать");
        System.out.println ("Это директория ? " +
                (fl.isDirectory() ?
                        "да": " нет"));
        System.out.println ("Это обычный файл ? " +
                (fl.isFile() ?
                        "да" : "нет"));
        System.out.println ("Последняя модификация файла : "
                + fl. lastModified());
        System.out.println ("Размер файла : " + fl.length()
                + " bytes");


    }
    static StringBuilder buildString() {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < 101; i++) {
            str.append("TEXT");

        }
        return str;
    }


}



