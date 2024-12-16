package Lvl_II.h09_IO_NIO;

public class AAA_ReadMe {
/**
 *  FileWriter и FileReader используются для записи и чтения данных из текстовых файлов (это классы потока символов).
 *      Рекомендуется не использовать классы FileInputStream и FileOutputStream, если вам нужно читать и записывать
 *      какую-либо текстовую информацию, поскольку это классы потока байтов.
 *  try -with-resources — это оператор try, который объявляет один или несколько ресурсов . Ресурс — это объект, который
 *      должен быть закрыт после того, как программа завершит работу с ним. Оператор try -with-resources гарантирует,
 *      что каждый ресурс будет закрыт в конце оператора.
 *  BufferedReader и BufferedWriter - Текст, записанный в буферизованный писатель, хранится во внутреннем буфере и
 *      записывается в базовый писатель только тогда, когда буфер заполняется или очищается . Аналогично, чтение текста
 *      из буферизованного читателя может привести к чтению большего количества символов, чем было запрошено;
 *      дополнительные символы сохраняются во внутреннем буфере.
 *  FileInputStream и FileOutputStream предназначены для чтения и записи файлов. Они являются основными инструментами
 *      при взаимодействии с файловой системой.
 *  DataInputStream и DataOutputStream - Поток ввода данных позволяет приложению считывать примитивные типы данных Java
 *      из базового потока ввода машинно-независимым способом . Приложение использует поток вывода данных для записи
 *      данных, которые впоследствии могут быть считаны потоком ввода данных.
 *  Serilization Сериализация в Java — это процесс преобразования объекта в последовательность байтов, которую можно
 *      сохранить в файле, передать по сети или сохранить в памяти. Сериализация позволяет сохранить состояние объекта,
 *      включая его поля и значения, и восстановить объект позднее путем десериализации.
 *  RandomAccessFile — это класс в Java, который позволяет читать и записывать данные в файл в произвольном порядке. Он
 *      предоставляет методы для работы как с текстовыми, так и с бинарными файлами, позволяя перемещаться по файлу и
 *      изменять данные в любом месте.
 *  File Класс, определенный в пакете java.io, не работает напрямую с потоками. Его задачей является управление
 *      информацией о файлах и каталогах. Хотя на уровне операционной системы файлы и каталоги отличаются, но в Java они
 *      описываются одним классом File.
 *  Buffer - это блок памяти, в который мы моджем записывать информацию, а так же читать ее.
 *  Channel - в отличии от стримов, может читать файл так и записывать в него.
 *      Канал читает и записыва
 *  Wrap - ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes()); автоматически распределяет размер буффера
 *  Compact() - сдвиг с позици к ачалу буффера и с переносом всех байт ближе к началу.
 *  buffer.mark - запоминает позицию
 *  buffer.reset - позиция принимает значение метки
 *  FileVisitor - используется для обхода дерева файлов. Логика обхода дерева файлов заключается в классе,
 *      имплементирующем интерфейс FileVisitor
 *      preVisitDirectory - срабатывает перед обращением к элементу папки;
 *      visitFile - срабатывает при обращении к файлу;
 *      postVisitDirectory - срабатывает после обращения ко всем элементам папки;
 *      visitFileFailed - срабатывает когда файл по каким-то причинам недоступен.
 *  FileVisitResult
 *      - CONTINUE :продолжать обход по файлам
 *      - TERMINATE :немедленно прекратить обход по файлам
 *      - SKIP_SUBTREE :в данную директорию заходить не надо
 *      - SKIP_SIBLINGS :в данной директории продолжать обход по файлам не нужно
 *
 *
*/
}
