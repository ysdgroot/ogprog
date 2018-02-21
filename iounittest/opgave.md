Unit tests voor invoer/uitvoer
==============================

Ook wanneer een programma invoer en uitvoer gebruikt, is het 
mogelijk om hiervoor unit tests te schrijven. In deze oefening
illustreren we dit aan de hand van één van de voorbeelden
uit de les.

Maak een nieuw IDEA-project aan met daarin een kopie van de
klasse
[ToUpper4](https://github.ugent.be/kcoolsae/Prog2/tree/master/src/prog2/nio/ToUpper4.java). Je
moet een unit test schrijven voor de methode `translate` van deze
klasse.

Eerst moet je een aanpassing doen aan de klasse `ToUpper4` zodat het
gemakkelijker wordt om die te testen. (Dat een programma gemakkelijk
kan getest worden, is iets waar je best al rekening mee houdt bij het
ontwerp.)

* Verander `translate` zodat ze als parameters een (binaire) invoer- en een
  uitvoerstroom neemt, in plaats van steeds het standaard invoer-
  en uitvoerkanaal.
* Pas de `main`-methode aan zodat het programma nog steeds hetzelfde
  doet als voorheen. Probeer dit ook uit door het programma in een
  Java-archief (jar) te verpakken en vanop de
  opdrachtlijn uit te voeren. (Zoals in de les.)

Schrijf een unit test voor de nieuwe `translate`. Gebruik hiervoor

* Als invoer: een bestand dat je vanuit het *class path*
  benadert. Zorg dat dit bestand enkele speciale tekens bevat (ë, à,
  ç, …), enkele cijfers, enkele overtollige blanco's en meer dan één
  lijn.

* Als uitvoer: een zogenaamde *ByteArrayOutputStream*. Raadpleeg de
  elektronische documentatie (de API) om te weten hoe je een
  dergelijke *OutputStream* aanmaakt, en hoe je die na afloop kunt
  omzetten naar een string, om te controleren of `translate` zijn werk
  correct heeft gedaan.



