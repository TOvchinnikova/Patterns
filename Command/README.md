Команда — это поведенческий паттерн проектирования, который превращает запросы в объекты, позволяя передавать их как аргументы при вызове методов, ставить запросы в очередь, логировать их, а также поддерживать отмену операций.

Аналогия

Вы пришли в ресторан. Вы (Client) просите официанта (Invoker) принести блюда (Command). Официант перенаправляет запрос шеф-повару (Receiver), который знает, что и как готовить. Другой пример: вы (Client) включаете (Command) телевизор (Receiver) с помощью пульта (Invoker).