package org.example.HW02;
// Дана строка sql-запроса "select * from students where ". Сформируйте часть
// WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.
//
//Параметры для фильтрации:
// , "country":"Russia", "city":"Moscow", "age":"null"}

public class hw2_Task01 {
    public static void main(String[] args) {
        String str = "select * from students where ";
        String json_line = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(getItemFromJson(json_line,str));
    }

    public static String getItemFromJson(String line, String s){
        line = line.replace('{',' ').replace('}',' ').replace(':',',')
                .replace('"',' ').replaceAll("\\s", "");
        String[] arr = line.split(",");
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < arr.length-1; i+=2){
            if (!arr[i + 1].equals("null")){
                sb.append(arr[i]);
                sb.append("=");
                sb.append(arr[i+1]);
                sb.append(" ");}
        }
        return sb.toString();
    }

}