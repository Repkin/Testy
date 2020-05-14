

## Spis treści
* [Streszczenie](#streszczenie)
* [Technologie](#technologie)
* [Testy](#testy)



### Streszczenie
Aplikacja została stworzona i przetestowana w ramach zaliczenia przedmiotu _"Zaawansowane bazy danych"_. Jest to bardzo prosta aplikacja do podstawowej diagnostyki samochodu na podstawie trzech zmiennych. Testy aplikacji przeprowadziłem przy pomocy **JUnit**

### Technologie

Testy przeprowadziłem przy użyciu:
junit-jupiter version 5.6.2
Aplikacja oraz testy zostały napisane w wersji **Java 1.8**

### Testy

Wykonałem 7 testów jednostkowych:

1. Przetestowanie aplikacji, gdy jedna z trzech zmiennych ma wartość null, przez co aplikacja powinna zwrócić IllegalArgumentException.

2. Przetestowanie aplikacji, gdy wszystkie z trzech zmiennych mają wartości w zakresie między minimum a maksimum.
3. Przetestowanie aplikacji, gdy zmienna fuelUsage ma wartości poza granicami maksymalnymi.

4. Przetestowanie aplikacji, gdy zmienna CarMillage ma wartości poza granicami maksymalnymi.

5. Przetestowanie aplikacji, gdy zmienna treadThickness ma wartości poza granicami maksymalnymi.
6. Przetestowanie aplikacji, gdy wartości zmiennych są równe granicznym wartościom. 
7. Przetestowanie aplikacji, gdy jedna ze zmiennych (w tym wypadku fuelUsage) posiada wartości mniejsze niż 0, przez co aplikacja powinna zwrócić IllegalArgumentException.

