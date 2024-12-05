package Lvl_II.h08_Multistreams;

public class AAA_ReadMe {
/**
 *  Многопоточность - это принцип построения программы, при котором несколько блоков кода
 *          могут выполняются одновременно.
 *  1й вариант создания потока - class MyThread extends Thread {public void run(){код}}
 *          запуск - new MyThread().start();
 *  2й вариант создания потока - class MeRunnableImpl implements Runnable { public void run(){код}}
 *          запуск - new Thread (new MeRunnableImpl()).start();
 *          Из за того, что в Java отсутсвует множественное наследование, чаще используют 2-ой вариант.
 *  Thread - применяет интерфейс {@Link Runnable}
 *      getName setName - имя потока
 *      getPriority setPriority - приоритет потока
 *      sleep - задержка потока, указываются миллисекунды (1 сек = 1000 м.сек), необходимо подключать выброску ошибки
 *      join - ожидает окончание потока
 *  Concurrency, Concurrent - Означает выполнение сразу нескольких задач. В зависимости от процессора
 *      компьютера и может достигаться разными способами.
 *  Parallelism - Выполнение 2-х и более задач в одно и то же время, т.е. параллельно. В компьютерах с
 *      многоядерным процессором concurrency может достигаться за счет parallelism
 *  Asynchronous - одновременное выполнение действий, при котором можно достичь Parallelism
 *  Synchronous - последовательное выполнение действий
 *  synchronized - вписывание данного параметра к методу, дает возможность одновременно использовать
 *      1 поток, где другие потоки становятся в очередь за возможностью применения данного метода.
 *      public synchronized void abc() {код метода}
 *  volatile - volatile int = 1; епременная хранится в main процессоре, используется как
 *      переменная между потоками, которую видят другие потоки. (то есть хранится только в
 *      основной памяти <<main memory>>). Для синхронизации значения переменной между потоками
 *      ключевое слово volatile используется тогда, когда только один поток может изменять
 *      значение этой переменной, а остальные потоки могут его только читать.
 *  DateRace - ситуация когда потоки не синхроно работают с переменной изменяя ее и читая асинхроно.
 *  Монитор - это сущность/механизм, благодаря которому достигается корректная работа при синхронизации.
 *      В Java у каждого класса и объекта есть привязанный к нему монитор. Монитор не применим
 *      к статичным методам
 *      Пример блока:   static final {@link Object} lock = new {@link Object};
 *                      public void abc {код метода}
 *                      synchronized(lock) {часть блокируемого кода}
 *  wait(): освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор,
 *      пока другой поток не вызовет метод
 *  notify() notify(): продолжает работу потока, у которого ранее был вызван метод wait()
 *  deadlock - это явление, когда несколько процессов пытаются обратиться к одним и тем же
 *      данным и в итоге блокируют друг другу доступ к ним.
 *  Livelock - это ситуация в многопоточном программировании, когда два или более потока находятся
 *      в состоянии постоянного переключения и не могут продвинуться дальше, хотя они активны и
 *      выполняют некоторую работу.
 *  Lock starvation - ситуация, когда менее приоритетные потоки ждут долгое время или все время
 *      для того, что бы могли запуститься.
 *  ReentrantLock — одна из реализаций интерфейса Lock — класс ReenterantLock. Он позволяет одному
 *      и тому же потоку вызывать метод lock, даже если он его вызывал ранее, без освобождения
 *      блокировки. У класса ReentrantLock, кроме методов интерфейса Lock, есть фабричный метод newCondition().
 *  Daemon потоки (Демон потоки) - это удобный инструмент для выполнения фоновых задач, которые не должны
 *      блокировать завершение приложения. Однако следует с осторожностью использовать их для задач,
 *      которые должны быть обязательно завершены, так как демон-потоки могут быть внезапно остановлены
 *      в любой момент. setDaemon() = true до запуска потока через метод start, isDaemon() присвоение
 *      потоку режим демон.
 *  interrupt(); - используется для прерывании, пример в run() if(isInterrupted()).
 *  Thread pool - это набор предварительно инициализированных потоков, размер которого может быть
 *      как фиксированным, так и переменным. Если задач больше, чем потоков, то задачи ждут в
 *      очереди (Task Queue).
 *  ExecutorService - Интерфейс для работы с пулом потоков, множеством потоков.
 *  execute() - Метод передает наше задание (task) в thread pool, где оно выполняется одним из потоков
 *  shutdown() - После выполнения метода, говорит что новых задач не будет, где выполнение предыдущих
 *      заданий не будет и прекращает свою работу.
 *  ScheduledExecuterService - данный интерфейс добавляет возможность запускать отложенные задачи с
 *      определенной задержкой или определенным периодом.
 *  scheduleAtFixedRate - Создает и выполняет периодическое действие, которое включается сначала после
 *      заданной начальной задержки, а затем с заданным периодом ; то есть выполнение начнется после
 *      initialDelay, затем initialDelay+period, затем initialDelay + 2 * period и т. д.
 *  scheduleWithFixedDelay - метод принимает три параметра: задачу (Runnable), начальную задержку и период задержки.
 *      Начальная задержка: Время, которое будет ждать выполнение первой задачи после вызова метода.
 *      Период задержки: Время, которое будет ждать между завершением одной задачи и началом следующей.
 *  Callable<V> — расширенный аналог интерфейса Runnable для асинхронных операций. Позволяет возвращать
 *      типизированное значение и кидать checked exception. Несмотря на то, что в этом интерфейсе отсутствует
 *      метод run(), многие классы java. В отличии от Runnable имеет return type не void и может выбрасывать
 *      Exception
 *  submit - это метод из интерфейса ExecutorService который расширяет Executor. Поскольку submit возвращает
 *      значение, то в нем происходит подготовка возвращаемого значения. Работает с Callable<V>/
 *      А так же передает наше задание в task Thread pool, для выполнения его одним из потоков, и возвращает
 *      тип Future, в котором и хранится результат выполнения нашего задания
 *      get в Callable позволяет получить результат выполнения нашего задания из объекта Future
 *  Future - объект ждущий результатов выполнения задачи
 *      Объекты Future используются для соединения низкоуровневого кода, основанного на обратном вызове, с
 *      высокоуровневым кодом, основанном на синтаксисе async / await .
 *      Как получить данные из будущего объекта в Java?
 *      Метод submit() возвращает объект Future, который мы можем использовать для получения результата вычисления.
 *      Метод get() блокирует выполнение до тех пор, пока вычисление не будет завершено, а затем возвращает результат.
 *      Если вычисление выдает исключение, метод get() выдаст ExecutionException.
 *  Semaphore - это средство для синхронизации доступа к какому-то ресурсу. Его особенность заключается в том,
 *      что при создании механизма синхронизации он использует счетчик. Счетчик указывает нам, сколько потоков
 *      одновременно могут получать доступ к общему ресурсу.
 *      Это синхронизатор, позволяющий ограничить доступ к какому-то ресурсу. В конструктор Семафор нужно
 *      передавать количество потоков, которым семафор будет разрешать одновременно использовать этот ресурс
 *  CountDownLatch - отслеживает выполнение задач каждым учеником, и сможет продолжить свою работу только после
 *      выполнения этих задач.
 *  Exchanger предназначен для обмена данными между потоками. Он является типизированным и типизируется типом
 *      данных, которыми потоки должны обмениваться. Обмен данными производится с помощью единственного метода
 *      этого класса exchange(): ?
 *  AtomicInteger предоставляет операции с значением int, которые могут быть прочитаны и записаны атомарно,
 *      в дополнение содержит расширенные атомарные операции. У него есть методы get и set, которые работают,
 *      как чтение и запись по переменным. РАботать может без синхронизации.
 *  ConcurrentHashMap - позволяет множеству читателей одновременное чтение без использования блокировок. Это
 *      достигается разделением Map на различные части, основываясь на «уровне одновременности» и блокированием
 *      только части Map при обновлении.
 *  CopyOnWriteArrayList . Это специализированный набор классов, добавленных в JDK 1.5 вместе с их более
 *      популярным двоюродным братом ConcurrentHashMap . Они являются частью concurrent collection framework
 *      и расположены в пакете java. util. потокобезопасный вариант ArrayList в Java.
 *  ArrayBlockingQueue<E> — класс блокирующей очереди, построенный на классическом кольцевом буфере. Здесь нам
 *      доступна возможность управлять “честностью” блокировок. Если fair=false (по умолчанию), то очередность
 *      работы потоков не гарантируется. это реализация Java-очереди с параллельным и ограниченным блокированием,
 *      поддерживаемая массивом . Он упорядочивает элементы FIFO
 *
*/
}
