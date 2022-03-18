package com.javachallengers.newfeatures;

import org.junit.jupiter.api.Test;

public class TextBlocks {

  @Test
  void oldWayToStoreString() {
    String customerProductSQL = "select product.name, customer.name, address.city " +
                               "  from product " +
                               "  inner join customer on customer.product_id = product.id " +
                               "  inner join address on customer.address_id = address.id";
  }

  @Test
  void usingTextBlocks() {
    String customerProductSQL = """
      select product.name, customer.name, address.city 
        from product 
        inner join customer on customer.product_id = product.id 
        inner join address on customer.address_id = address.id
     """;
  }

  @Test
  void syntaxTextBlocksError() {
//    """ Big text here... Test... Test... Test...   // Compilation error here
//     Big text here... Test... Test... Test...
//     """;
  }

  @Test
  void syntaxTextBlocksErrorOneLiner() {
//     """ Some text here... Test... Test..."""; // Compilation error here
  }

  void oneLinerTextBlock() {
    String someText =  """
    Some text here... Test... Test...Some text here... // Compiles fine
    """;
  }

  void usingDoubleQuotesTextBlocks() {
    String someText =  """
    ""Some text here... Test... Test...Some text here...'`'"" // Compiles fine
    """;
  }

  @Test
  void threeDoubleQuotesWorkaroundTextBlocks() {
    String someText =  """
    ""\" Some text here... Test... Test...Some text here... ""\"
    """;
    System.out.println(someText);
  }

  @Test
  void indentationWithoutSpacesTextBlocks() {
    String someText =  """
      Some text here... Test... Test...Some text here... 
      Lorem Ipsum has been the industry's standard dummy text 
      ever since the 1500s, when an unknown printer took a galley 
      of type and scrambled it to make a type specimen book.
      """;
    System.out.println(someText);
  }

  @Test
  void indentationWithSpacesTextBlocks() {
    String someText =  """
          Some text here... Test... Test...Some text here... 
          Lorem Ipsum has been the industry's standard dummy text 
          ever since the 1500s, when an unknown printer took a galley 
          of type and scrambled it to make a type specimen book.
      """;
    System.out.println(someText);
  }

  @Test
  void indentationWithSpacesLastThreeQuotesAtTheEndTextBlocks() {
    String someText =  """
            apiVersion: v3
            kind: Service
            metadata:
              labels:
                run: customer-registration-service-dev""";

    System.out.println(someText);
  }

  @Test
  void explicitIndentationMethod() {
    String someText =  """
            apiVersion: v3
            kind: Service
            metadata:
              labels:
                run: customer-registration-service-dev""".indent(4);

    System.out.println(someText);
  }

  @Test
  void textInOneLine() {
      String someText =  """
            apiVersion: v3
            kind: Service
            metadata:
              labels:
                run: customer-registration-service-dev
            """.replaceAll("\n", System.lineSeparator());

      System.out.println(someText);
  }


   // Bad Indentation
  public final String badIndentation = """
                                       Some text here... Test... Test...Some text here... 
                                       Lorem Ipsum has been the industry's standard dummy text 
                                       ever since the 1500s, when an unknown printer took a galley 
                                       of type and scrambled it to make a type specimen book.
                                       """;

  // Good Indentation
  public final  String goodIndentation = """
    Some text here... Test... Test...Some text here...
    Lorem Ipsum has been the industry's standard dummy text
    ever since the 1500s, when an unknown printer took a galley
    of type and scrambled it to make a type specimen book.
  """;

  @Test
  void chuckNorrisBadIndentation() {
    final String chuckNorrisBadIndentation = """
               Carlos Ray "Chuck" Norris (born March 10, 1940) is an American martial artist and actor. He is a black belt in Tang Soo Do, 
               Brazilian jiu jitsu and judo.[1] After serving in the United States Air Force, Norris won many martial arts championships 
               and later founded his own discipline Chun Kuk Do. Shortly after, in Hollywood, Norris trained celebrities in martial arts. 
               Norris went on to appear in a minor role in the spy film The Wrecking Crew (1969). Friend and fellow martial artist Bruce Lee 
               invited him to play one of the main villains in Way of the Dragon (1972).
               """;
  }

  @Test
  void chuckNorrisGoodIndentation() {
    final String chuckNorrisGoodIndentation = """
Carlos Ray "Chuck" Norris (born March 10, 1940) is an American martial artist and actor. He is a black belt in 
Tang Soo Do, Brazilian jiu jitsu and judo.[1] After serving in the United States Air Force, 
Norris won many martial arts championships and later founded his own discipline Chun Kuk Do. Shortly after, 
in Hollywood, Norris trained celebrities in martial arts. Norris went on to appear in a minor role in the spy film 
The Wrecking Crew (1969). Friend and fellow martial artist Bruce Lee invited him to play one of the main villains 
in Way of the Dragon (1972).
""";
  }


}
