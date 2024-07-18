package org.example;


import org.apache.commons.lang3.math.NumberUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*

✅Задание:

Создай Maven проект с названием "MyProject". В этом проекте:
- Добавь зависимость на библиотеку Log4j версии x.x.x. и другие внешние библиотеки(на свое усмотрение)
- Настрой Maven для компиляции и упаковки проекта в JAR файл.
- Создай класс "Main", который использует апи из подключенных библиотек.
- Включи BOM для управления версиями зависимостей в проекте.

- Проверь транзитивные зависимости проекта.

После выполнения задания ответь на следующие вопросы:

1. Какие фазы Maven были использованы в процессе сборки проекта "MyProject"?
2. Какие плагины Maven были настроены в файле pom.xml? Какие цели они выполняют?
3. Какие транзитивные зависимости были выявлены в проекте?
4. Какие преимущества дает использование BOM в управлении зависимостями проекта?

✅Создай sayHello плагин по документации maven
https://maven.apache.org/guides/plugin/guide-java-plugin-development.html
 */
public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.log(Level.INFO, "---------------------------------> TEST");
        logger.log(Level.INFO, NumberUtils.compare(1, 2));
    }
}