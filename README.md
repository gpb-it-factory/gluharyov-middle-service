# gluharyov-middle-service

## Middle service for minibank


Этот проект является middle-слоем приложения "Мини-банк"

- Является Java-сервисом
- Принимает запросы от телеграмм-бота по протоколу HTTP
- Выполняет валидацию
- Выполняет бизнес-логику
- Маршрутизирует запросы в банк по протоколу HTTP


```plantuml
@startuml

participant "TelegramBot" as report
participant "Middle Java Service" as report2
database "Backend Service" as db



report -> report2: HTML
activate report2
report2 -> db:  HTML
activate db
db --> report2:  HTML
deactivate db
report2 --> report: HTML
deactivate report2


@enduml

