// // Реализовать в классе Program, метод выводящий все данные о товаре. Создать в Main все объекты товаров и проверить работу метода, 
// созданного в классе Program

public class task{
    public static void main(String[] args) {

       Food bread = new Bread("Borodinskiy", 100.5, 1, "unit", "31/03/23", "1 sort");
       Program.show(bread);

       Eggs eggs = new Eggs("egs", 100.2, 1, "tray", "31/04/23", 10);
       Program.show(eggs);
    
       Good milk = new Milk("Milkie", 150.5, 1, "bottle", 1, "23/03/23", 3.5);
       Program.show(milk);

       Lemonade lemon = new Lemonade("Lemonnn", 150.7, 1, "bottle", 1);
       Program.show(lemon);

       Kids diaper = new Diaper("Huggy", 300.5, 1, "package", 0, true, "s-m", 1, 5, "soft");
       Program.show(diaper);

       Pacifier pacify = new Pacifier("Soska", 150.9, 1, "unit", 0, true);
       Program.show(pacify);

       Good mask = new Masks("Hydromask", 100.3, 1, "unit", 1);
       Program.show(mask);

       Hygiene paper = new ToiletPaper("Softy", 250.0,1, "package",8, 4);
       Program.show(paper);
    
    
    
    }
}