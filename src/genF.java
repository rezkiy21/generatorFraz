public class genF {
    public static void main(String[] args) {
        String [] wordListOne = {"круглосуточный", "трех-звенный", "3000 - футовый",
                                "взаимный", "обоюдный выигрыш", "фронтэнд", "на основе веб-технологий", "проникающий",
                                "умный", "шесть сигм", "метод критического пути", "динамичный"};
        String [] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный",
                                "центральный", "распрделенный", "кластеризованный", "фирменный", "нестандартный ум",
                                "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный"};
        String [] wordListThree = {"процесс", "выход из положения", "пункт разгрузки", "тип структуры",
                                "талант", "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор",
                                "образец", "пункт следования"};
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int rand1 = (int) (Math.random()* oneLenght);
        int rand2 = (int) (Math.random()* twoLenght);
        int rand3 = (int) (Math.random()* threeLenght);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Все что нам нужно, - это " + phrase);

    }
}
