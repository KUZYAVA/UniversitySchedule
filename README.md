Сервис "Учебный день ИЕНиМ УрФУ" разработан специально для 
студентов Института естественных наук и математики Уральского федерального университета (УрФУ). Сервис предоставляет 
доступ к актуальному расписанию занятий на текущий день.

Сервис включает в себя ряд эндпоинтов:

• /registration: Этот эндпоинт предназначен для регистрации новых пользователей. Процесс регистрации включает в себя 
указание необходимой информации, такой как имя пользователя, пароль, номер группы, 
а также выбор роли: "Студент" или "Администратор".

• /login: После успешной регистрации пользователи могут авторизоваться в системе.

• /logout: Этот эндпоинт позволяет пользователям выйти из своей учетной записи.

• /schedule: Это основной эндпоинт сервиса, предоставляющий доступ к расписанию занятий. После успешной авторизации 
студенты видят расписание своей группы на текущий день. 


• /admin: Этот эндпоинт доступен только администраторам системы.
Администраторы могут временно скрывать или показывать расписание для отдельных групп, например, в случае внеплановых изменений или технических работ.
