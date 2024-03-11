
## Réponses aux questions, à la fin de l'exo1 de TP1:

#### Question 1: Décrivez ce que vous observez en base de données lorsque l'on déclare une classe comme `ClassTestJPA` ?
* Réponse:   
    * Quand la classe `ClassTestJPA` est declarée avec l'annotation `@Entity`, cela indique à JPA que cette classe est une entité persistante et doit être mappée à une table dans la base de données. 
    * La classe `ClassTestJPA` contient les attributs `myIdTest`, `jpaSeed`, `savedAt`, et `powerType`. Ces champs seront mappés aux colonnes correspondantes désormais de la table `ClassTestJPA` , et la clé primaire sera annoté avec `@Id`. 

#### Question 2: Quels sont les effets des propriétés ajoutées dans les @Column dans la classe `ClassTestJPATwo` ?
* Réponse:
    * Le fait d'utiliser les annotations `@column` c'est pour spécifier les propriétés des colonnes associées aux champs de la classe . 
    * Dans le cas de `@Column(unique)`: Cette propriété spécifie que la colonne correspondante dans la base de données doit avoir des valeurs uniques pour chaque enregistrement. Par conséquent, la colonne `testName` sera définie comme une contrainte d'unicité dans la base de données. 
    * `@Column(precision = 1)`: Cette propriété spécifie la précision de la colonne dans la base de données. Dans ce cas, la précision de la colonne jpaSeed sera limitée à un chiffre après la virgule. et finalement le fait d'écrire @column tout court , les valeurs par défauts seront prises pour cette colonne.

#### Question 3: À votre avis, dans quels cas est-il nécessaire de mettre les annotations `@Column` ?
* Réponse: 
  * Les annotations `@Column` sont nécessaires lorsqu'on veut spécifier des propriétés spécifiques (non par défaut) , cela peut inclure des propriétés d'unicité , de précision , longueur maximale etc . 

  
   Mais si on n'a pas besoin de spécifier aucune propriété on peut ne pas utiliser `@Column` , car JPA utilisera les valeurs par défaut lors de la création des colonnes dans la base de données.
   


##### Notes pour l'exo1 de TP1:
`TP1 a été réalisé sur la VM ayant l’adresse iP “129.88.210.113”, en faisant des changements dans docker-compose.yml (dernier port 8080 au lieu de 5050) => donc il faut utiliser http://129.88.210.113 pour visualiser la BD générée par l’application SpringBoot sur intelliJ. `