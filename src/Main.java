public class Main {
    public static void main(String[] args) {
        Author bykov = new Author("Василий", "Быков");
        Author pushkin = new Author("Александр", "Пушкин");
        Book obelisk = new Book("Обелиск", bykov, 2020);
        Book onegin = new Book("Онегин", pushkin, 2021);
        System.out.println(obelisk);
        System.out.println(onegin);
        obelisk.setYear(2022);
        System.out.println(obelisk);
        System.out.println(bykov.equals(pushkin));
        System.out.println(obelisk.equals(onegin));

    }
}