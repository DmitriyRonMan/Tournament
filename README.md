## Задание 1. Турнир (обязательное к выполнению)
Ваша задача — разработать класс, управляющий турниром игроков. Каждый игрок описывается дата-классом <code>Player</code> с полями <code>id</code>, <code>name</code>, <code>strength</code> (сила).

Сам же турнир описывается классом <code>Game</code> с методами:

+ <code>register (Player player)</code> — метод регистрации игрока, если игрок не зарегистрирован, то он не сможет играть в турнире. Вам нужно хранить всех зарегистрированных игроков в поле класса <code>Game</code> в виде списка.
+ <code>round (String playerName1, String playerName2)</code> — метод соревнования между двумя игроками. Если хотя бы один из игроков не зарегистрирован, должно выкинуться исключение <code>NotRegisteredException</code> — сами создайте его класс. Обратите внимание, что игроки передаются методу через имя — полную информацию об игроке нужно будет найти в коллекции зарегистрированных игроков (см. аналог в виде <code>findById</code> из прошлых домашних заданий). Выигрывает тот игрок, у которого больше <code>strength</code> (сила), если сила одинаковая, то будет ничья. Метод должен возвращать одно число — <code>0</code> в случае ничьи, <code>1</code> в случае победы первого игрока и <code>2</code> в случае победы второго игрока.

Напишите на класс <code>Game</code> тесты, покрыв по бранчам на 100%.

Итого: отправьте на проверку ссылку на репозиторий GitHub с вашим проектом.