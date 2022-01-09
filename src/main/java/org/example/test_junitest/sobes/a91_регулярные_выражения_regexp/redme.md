###RegEx API
[Документация Class Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)

and 

[Это тоже хороший туториал с примерами](http://tutorials.jenkov.com/java-regex/matcher.html)


[abc]               -   a, b или c
[^abc]              -   символ, исключая a, b и c
[a-z]               -   символ между a и z
[a-d[m-p]]          -   между a и d, или между m и p

Кроме стандартных классов символов существуют предопределенные
класы символов:

.                   -   любой символ
\d или \p{Digit}    -   [0-9]
\D                  -   [^0-9]
\s или \p{Space}    -   [ \t\n\x0B\f\r]
\S                  -   [^\s]
\w                  -   [0-9_A-Za-z]
\W                  -   [^\w]
\p{Lower}           -   [a-z]
\p{Upper}           -   [A-Z]
\p{Punkt}           -   !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
\p{Blank}           -   Пробел или табуляция

При создании регулярного выражения могут использоваться логические
операции:

ab                  -    после a следует b
a|b                 -   a либо b
(a)                 -   а

Скобки кроме их логического назначения также используются для выделения групп.
Для определения регулярных выражений недостаточно одних классов символов, т. к. в шаблоне часто нужно указать количество повторений. Для этого
существуют квантификаторы.
a?                  -   a один раз или ни разу
a*                  -   a ноль или более раз
a+                  -   a один или более раз
a{n}                -   a n раз
a{n,}               -   a n или более раз
a{n,m}              -   a от n до m
ищем повторы слов в строке
"(?i) \\b ([a-z]+) \\b (?: \\s+ \\1 \\b )+"
```
\b       match a word boundary 
         граница слова
[a-z]+   match a word with one or more characters the parentheses capture the word as a group 
        из одного или нескольких символов, слово как группу возьмем в круглые скобки
   
\b       match a word boundary
        соответствует границе слова
(?:      indicates a non-capturing group (which starts here)
         указывает группу без захвата (которая начинается здесь)   
\s+      match one or more white space characters
         соответствует одному или нескольким пробелам
\1       is a back reference to the first (captured) group so the word is repeated here
         является обратной ссылкой на первую (захваченную) группу, поэтому слово здесь повторяется
\b       match a word boundary
        соответствовать границе слова
)+       indicates the end of the non-capturing group and allows it to occur one or more times
        указывает конец группы без захвата и позволяет ей встречаться один или несколько раз
```
или без именованных групп
```
I used this regular expression: "\b(\w+)(?:\W+\1\b)+"

When using this regular expression in Java, we have to "escape" the backslash characters with additional backslashes (as done in the code above).

\w ----> A word character: [a-zA-Z_0-9]
\W ----> A non-word character: [^\w]
\b ----> A word boundary
\1 ----> Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)
+ ----> Match whatever it's placed after 1 or more times

The \b boundaries are needed for special cases such as "Bob and Andy"
 (we don't want to match "and" twice).
  Another special case is "My thesis is great" (we don't want to match "is" twice).
```