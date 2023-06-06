# Post Mortem Slutprojekt

Malte Lindkvist 2023-06-06

## Inledning

Här har jag arbetat med ett valfritt slutprojekt i programmering där jag bestämde mig för att göra en simpel miniräknare.

## Bakgrund

Jag började med att skapa en switch case för de olika metoder som jag ville implementera, alltså plus, minus, multiplikation och division.
Sedan skapade jag enkla variabler för "input" numren som användes, jag använde sedan dessa variabler i funktionen.
Sist men inte minst lade jag till texten som guidar användaren genom miniräknaren, presenterar svar och förklarar errors.
På tala om errors gjorde jag en funktion som gör att numren måste hålla sig inom ett specifikt värde, så att du inte kan använda funktion 73 när det bara finns 4 att välja på.


```


## Positiva erfarenheter

Det som gick lättare var den mattematiska delen eftersom att skapandet av variabler och hjälpen av att det i princip redan finns en miniräknare i java.
Det var också ganska mycket lättare att göra switch cases än tidigare, vilket var en trevlig överraskning.

## Negativa erfarenheter

Det som inte gått lika bra var det jag skulle använda för att pausa mitt program när någonting hade gått snett.
Jag testade mig fram med olika och landade tillslut på System.exit(0);
 vilket avslutar mitt program. Jag försökte tidigare använde mig av return vilket startade om mitt program så snabbt att man knappt hade tid att läsa mitt error meddelande.

## Sammanfattning

Det jag kommit fram till är att det inte var det svåraste projektet men det var
 definitivt inte mitt bästa, det finns mycket som kan förbättras, t.ex mängden funktioner, användarvänligheten...
Ifall jag skulle göra detta igen skulle jag försöka bestämma mig vad jag ska göra lite tidigare så att jag inte slösar tid.
Jag skulle också försöka hålla mig till största del till det jag är säker på och implementera små delar
av det jag är mer osäker på.