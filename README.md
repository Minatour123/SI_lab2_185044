# SI_lab2_185044
Дамјан Илиќ, бр. на индекс: 185044

Група на код:

Јас ја добив групата на код 1.


Control Flow Graph:

![Control Flow Graph](https://github.com/Minatour123/SI_lab2_185044/raw/master/SIlab2_185044.jpg)


Цикломатска комплексност:

Цикломатската комплекност е 7, ја добиваме преку P+1, каде P е бројот на предикатни јазли.


Тест случаи според Every statement критериумот: 

![Every Statement Test Cases](https://github.com/Minatour123/SI_lab2_185044/raw/master/everyteststatement.JPG)

1. allUsers //empty
user 1      null

2. allUsers //empty
user2
username: Damjan2
password; Moranesthodastoi
email: damjan@gmail.com

3. allUsers //empty
user3
username: Damjan3
password: grrwutenD
email: damjanilicgmail.com

4. allUsers //empty
user4
username: Damjanius
password: hahafunny
email: damjan.999@gmail,com

5. allUsers //empty
username: null
password: random
email: damjan@gmail.com
 
 
Тест случаи според Every Branch критериумот:
1. user == null, поминува 1-11
2. user.getUsername()=="Damjan2" && user.getEmail()=="damjan@gmail.com" && !allUsers.contains(user.getUsername()), поминува 1-2, 2-3, 3-4.1, 4.1-4.2, 4.2-5, 5-6, 6-7, 7-8, 7-4.3, 8-4.3, 5-7, 4.3-5.2, 4.2-9, 9-10
3. user.getUsername() == null, поминува 1-2, 2-11
4. user.getEmail()=="damjan.999@gmail,com", поминува 1-2, 2-3, 3-4.1, 4.1-4.2, 4.2-5, 5-6, 6-7, 7-8, 7-4.3, 8-4.3, 5-7, 4.3-4.2, 4.2-9, 9-11


Објаснување на напишаните unit тестови:

Every statement test cases:
1. За тест случај 1 имаме user==null што значи дека првиот услов не е исполнет и програмата ќе врати false

2. За тест случај 2 имaме објект каде што сите вредности се валидни па затоа програмата ќе врати true.

3. За тест случај 3 имаме објект со променливата email во user3 објектот со погрешна вредност, при проверката за карактерот "@", враќа false.

4. За тест случај 4 имаме објект каде што променливата email во user4 објектот има погрешна вредност, при проверката за карактерот ".", враќа false.


5. За тест случај 5 имаме објект каде што променливата username во user5 објектот има вредност null па ќе прекине програмата кај условот за проверка на username. 

Every branch test cases: (*broj-*broj* znachi deka ja pominuva taa granka)
1. 1-11 user треба да биде null. Функцијата враќа false.
2. 1-2, 2-3, 3-4.1, 4.1-4.2, 4.2-5, 5-6, 6-7, 7-8, 7-4.3, 8-4.3, 5-7, 4.3-4.2, 4.2-9, 9-10 сите податоци треба да бидата валидни. Функцијата враќа true.
3. 1-2, 2-11 ако во вториот услов барем една проверка нема да е точна. Функцијата враќа false.
4. 1-2, 2-3, 3-4.1, 4.1-4.2, 4.2-5, 5-6, 6-7, 7-8, 7-4.3, 8-4.3, 5-7, 4.3-4.2, 4.2-9, 9-11 кога mail-от не е валиден. Функцијата враќа false.
