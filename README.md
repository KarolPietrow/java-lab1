# Laboratorium 1

## Zadanie 1.
Zdefiniuj klasę Point posiadającą dwa publiczne, ostateczne pola x, y. Napisz konstruktor ustawiający te wartości.
Zdefiniuj klasę Segment reprezentującą odcinek, posiadającą dwa prywatne punkty klasy Point. Wygeneruj akcesory i mutatory klasy Segment. Napisz publiczną metodę, która zwraca długość odcinka. W kolejnym kroku usuń mutatory i utwórz konstruktor ustawiający te pola na wartości swoich dwóch parametrów.

## Zadanie 2.
Zdefiniuj w klasie Segment publiczną metodę toSvg(), która zwróci napis zawierający kod języka znacznikowego SVG pozwalający wyświetlić tę linię.

## Zadanie 3.
Napisz funkcję (metodę klasy głównej), która przyjmie: obiekt segment klasy Segment oraz obiekt point klasy Point. Funkcja powinna zwrócić odcinek prostopadły do segment, rozpoczynający się w punkcie point o długości równej odcinkowi segment. Następnie zmodyfikuj tę metodę tak, aby zwracała tablicę dwóch możliwych do konstrukcji linii oraz przenieś tę metodę jako statyczną do klasy Segment. Szczególne przypadki należy zignorować.

## Zadanie 4.
Zdefiniuj klasę Polygon posiadającą prywatną tablicę punktów. Konstruktor tej klasy powinien przyjmować tablicę punktów. Napisz publiczną metodę toSvg() działającą analogicznie jak w poprzednim zadaniu.

## Zadanie 5.
W klasie Polygon napisz konstruktor kopiujący, wykonujący głęboką kopię obiektu.
