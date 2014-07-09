# humanity

A Java library for generating text based on a popular imageboard.

- Requires Java 1.8
- Builds with maven

## Samples

See the tests for this functioning sample:

```java
NGramSentenceGenerator generator = new NGramSentenceGenerator(3);
FourchanBoardHarvester harvester = new FourchanBoardHarvester(10);
harvester.harvestBoard(generator, BOARD);
harvester.awaitTermination(5, TimeUnit.MINUTES);
for(int i = 0; i < n; i++){
    System.out.println(generator.get());
}
```

Output from a sample run on 4chan's /g/:

    Doesnt mean I would do the same shit.
    It allows you to write code and live preview it at the end wins.
    I literally had a dream that Gabe Newell offered me his own keycaps from his keyboard to replace the graphic or remove it without damaging the lens.
    so are you guys gonna have an irc channel for this.
    Mostly because Im lazy.
    Emacs doesnt already have the lib to work on other OSes If it cant be that bad.

Output will vary on the N used in the `NGramSentenceGenerator`, and input trained with.
