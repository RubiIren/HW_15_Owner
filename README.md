Для запуска тестов:
- [ ] API тест
gradle clean test --tests ApiTests -DbaseUri=https://reqres.in/ -Dtoken=QpwL5tke4Pnpja7X4
- [ ] Web удаленный запуск
./gradlew clean test --tests WebTest -Ddevice=remote
- [ ] Web локальный запуск
./gradlew clean test --tests WebTest -Ddevice=local
