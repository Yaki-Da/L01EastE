Регулярные выражения — более продвинутый способ поиска соответствий или ошибок в тексте. Это набор символов
        (шаблон), который ищет соответствия в файле. Их часто применяют для обработки текста или редактирования,
        а также в создании скриптов для проверки на валидность.
    Pattern pattern1 = Pattern.compile("ABCD");
    Matcher matcher1 = pattern1.matcher(s1);

________________________________________________________________________________________________________________________
Регулярные выражения — это инструмент для поиска, замены и проверки текста. Они представляют собой особый язык, который
позволяет задавать шаблоны и искать или проверять текст, соответствующий этим шаблонам.

Регулярные выражения состоят из специального набора символов, которые обозначают определенные шаблоны. Вот основные
элементы регулярных выражений:

Символы — буквы, цифры и другие символы.
Мета-символы — специальные символы, которые имеют особое значение. Например, . для любого символа, \d для цифры.
Квантификаторы — указывают, сколько раз элемент может появляться. Например, * для нуля или более раз, + для одного или
                 более раз.
Группы и диапазоны — позволяют объединять символы и задавать диапазоны. Например, [A-Za-z] для любой буквы.

________________________________________________________________________________________________________________________
Спецсимволы в регулярных выражениях
Список некоторых часто используемых специальных символов в регулярных выражениях:

\d — соответствует любой цифре от 0 до 9.
\w — соответствует любому символу латиницы, цифре или символу подчеркивания (в ASCII).
\s — соответствует любому пробельному символу.
\b — обозначает границу слова.
^ — соответствует началу строки.
$ — соответствует концу строки.
. — соответствует любому символу, кроме перевода строки.
* — повторяет предшествующий символ 0 или более раз.
+ — повторяет предшествующий символ 1 или более раз.
? — предшествующий символ встречается 0 или 1 раз.
{n} — точное количество повторений предшествующего символа, где n — число.
Экранирование символов — способ, при котором специальные символы в регулярных выражениях (например, ., *, +) перестают
работать как команды и становятся обычными символами. Чтобы программа поняла их как обычные знаки, а не как инструкции,
перед ними ставят обратный слеш (\).

Пример экранирования:

Если нужно найти точку в тексте, вместо того чтобы использовать просто ., следует экранировать символ точкой с обратным
слешем \.. Например, регулярное выражение \. будет искать именно точку, а не любой символ.

________________________________________________________________________________________________________________________
Валидация данных через регулярные выражения
Проверка валидности номера телефона
Если номер телефона должен вводиться с +7, используйте регулярное выражение, которое проверяет наличие этого префикса и
далее последовательность цифр. Пример подходящего регулярного выражения и кода для его проверки:

^\+7\d{10}$
Где:

^ — начало строки.
\+7 — указывает, что номер должен начинаться с +7. Символ + является специальным и означает один или более предыдущего
      символа. Чтобы использовать его в буквальном значении, как часть телефонного кода +7, необходимо его экранировать:
      \+. В выражении ^+7\d{10}$ символ + будет воспринят как специальный, поэтому работа будет происходить некорректно.
\d{10} — означает, что после +7 должно идти ровно 10 цифр.
$ — конец строки.

Для более сложных требованиий к формату номера телефона, например, учитывать код страны или различные разделители,
шаблон регулярного выражения можно усложнить. Пример для проверки номера телефона с кодом страны:

^\+?\d{1,3}[-.\s]?\(?\d{1,4}?\)?\d{1,4}\d{1,9}$
Где:

^\+? — начало номера с символа «+». Cимвол ? означает, что предшествующий символ может встречаться либо 0, либо 1 раз.
Экранированный символ + и ? говорят о том, что номер может как начинаться с символа +, так и обходиться без него.
Например, выражение может захватить номера как в формате +71234567890, так и в формате 71234567890.

\d{1,3} — код страны из 1-3 цифр.
(Опционально) [-.\s]? — разделитель: тире, точка, пробел.
(Опционально) \(?\d{1,4}?\)? — код региона в скобках из 1-4 цифр.
\d{1,4} — 1-4 цифры.
\d{1,9} — основная часть номера из 1-9 цифр.

________________________________________________________________________________________________________________________
Проверка валидности имени
Для проверки имени используйте регулярное выражение, которое позволяет только буквы и некоторые специальные символы.
Например, дефис или апостроф. Пример простого регулярного выражения для проверки имени:

^[A-Za-zА-Яа-яёЁ]+([-'][A-Za-zА-Яа-яёЁ]+)*$
Где:

^ — начало строки.
[A-Za-zА-Яа-яёЁ]+ — указывает, что имя должно начинаться с одной или более букв (латиница или кириллица, включая букву
«ё»).
([-'][A-Za-zА-Яа-яёЁ]+)* — указывает, что имя может содержать дефис или апостроф, за которым следует одна или более
букв, и это может повторяться несколько раз.

$ — конец строки.

________________________________________________________________________________________________________________________
Проверка общего формата текста
Проверка валидности текста может включать проверку правильности формата, содержания и длины текста. Ниже приведены несколько распространенных сценариев проверки валидности текста и примеры регулярных выражений для каждого из них.

Чтобы убедиться, что текст соответствует определенному формату, например, содержит только буквы, пробелы и знаки препинания, используйте:

^[A-Za-zА-Яа-яёЁ\s]+$
Где:

^ — начало строки.
[A-Za-zА-Яа-яёЁ\s]+ — один или более символов, включающих буквы и пробелы.
$ — конец строки.

________________________________________________________________________________________________________________________
Проверка общего формата текста с пунктуацией
Регулярное выражение для проверки, что строка начинается с заглавной буквы и заканчивается знаком пунктуации, может
выглядеть так:

^[A-ZА-Я].*[.!?]$
Где:

^[A-ZА-Я] — строка должна начинаться с заглавной буквы (латиница или кириллица).
.* — любая последовательность символов (0 или более).
[.!?]$ — строка должна заканчиваться точкой, вопросительным или восклицательным знаком.

________________________________________________________________________________________________________________________
Проверка длины текста
Для проверки текста длиной от 1 до 100 символов используйте следующий шаблон:

^.{1,100}$
Где:

^ — начало строки.
.{1,100} — количество от 1 до 100 раз. Укажите свой диапазон.
$ — конец строки.

________________________________________________________________________________________________________________________
Проверка наличия определенных слов или фраз
Чтобы убедиться, что текст содержит определенные слова или фразы, используйте:

\bexample\b"
Где:

\b — граница слова.
example — слово, которое должно присутствовать в тексте. Укажите свое слово.
\b — граница слова.
Используйте только латинские буквы.

________________________________________________________________________________________________________________________
Валидация URL
Для проверки правильности формата URL используйте:

^(https?:\/\/)?([\w\-]+\.)+[\w\-]+(\/[\w\-\.]*)*\/?$
Где:

^ — начало строки.
(Опционально) (https?:\/\/)? — http или https, за которым следует «: //».
([\w\-]+\.)+ — одно или более слов / дефисов, за которыми следует точка.
[\w\-]+ — одно или более слов / дефисов.
(\/[\w\-\.]*)* — ноль или более раз символ «/», слова, дефисы или точки.
(Опционально) \/? — символ «/» в конце строки.
$ — конец строки.