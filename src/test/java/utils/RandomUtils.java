package utils;

import com.github.javafaker.Faker;
import data.SoftwareSolution;

public class RandomUtils {
    private Faker faker = new Faker();
    String[] ind = {
            "FinTech", "Enterprise", "Недвижимость", "Агроиндустрия", "Мультимедиа",
            "Логистика", "eLearning", "Био- и мединдустрия", "iGaming", "Промышленность",
            "Телекоммуникации", "Нефть и газ", "eCommerce", "Юриспруденция", "Ритейл",
            "Охрана здоровья", "Туризм и гостиничный бизнес", "Авиастроение", "Прочее"
    };

    public String getRandomIndustry() {
        return faker.options().option(ind);
    }

    public SoftwareSolution getRandomSoftwareSolution() {
        return faker.options().option(SoftwareSolution.values());
    }
}
