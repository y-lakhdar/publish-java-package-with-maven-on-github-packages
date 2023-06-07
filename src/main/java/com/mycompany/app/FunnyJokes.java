package com.mycompany.app;

import java.util.Random;

/**
 * The FunnyJokes class represents a collection of funny jokes. It provides methods to tell random jokes, tell jokes by index, and retrieve the total number of jokes.
 */
public class FunnyJokes {
  private static final String[] JOKES = {
      // Jokes array containing funny jokes
      // Add or modify jokes as desired
      "Why don't scientists trust atoms? Because they make up everything!",
      "I'm reading a book about anti-gravity. It's impossible to put down!",
      "Why did the scarecrow win an award? Because he was outstanding in his field!",
      "Why don't skeletons fight each other? They don't have the guts!",
      "Did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them!",
      "Why did the tomato turn red? Because it saw the salad dressing!",
      "What do you call a snowman with a six-pack? An abdominal snowman!",
      "Why don't eggs tell jokes? Because they might crack up!",
      "How does a penguin build its house? Igloos it together!",
      "Why did the bicycle fall over? Because it was two-tired!"};

  /**
   * Constructs a FunnyJokes object.
   */
  public FunnyJokes() {
    // Empty constructor
  }

  /**
   * Tells a random joke from the collection of jokes.
   */
  public void tellRandomJoke() {
    Random random = new Random();
    int index = random.nextInt(JOKES.length);
    String joke = JOKES[index];
    System.out.println(joke);
  }

  /**
   * Tells a joke from the collection of jokes based on the provided index.
   *
   * @param index the index of the joke to tell
   */
  public void tellJokeByIndex(int index) {
    if (index >= 0 && index < JOKES.length) {
      String joke = JOKES[index];
      System.out.println(joke);
    } else {
      System.out.println("Invalid joke index!");
    }
  }

  /**
   * Retrieves the total number of jokes.
   *
   * @return the number of jokes
   */
  public int getNumberOfJokes() {
    return JOKES.length;
  }

  /**
   * The entry point of the program.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    FunnyJokes funnyJokes = new FunnyJokes();
    funnyJokes.tellRandomJoke();
    funnyJokes.tellJokeByIndex(2);
    System.out.println("Total number of jokes: " + funnyJokes.getNumberOfJokes());
  }
}
