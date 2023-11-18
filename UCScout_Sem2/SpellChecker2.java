public class SpellChecker2
{
  private String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};

   // Re-write the spellcheck(word) (and optionally the printStartsWith(firstLetters)) methods to use enhanced for-each loops.

   /* Write a spellcheck() method using an enhanced for-each loop
    * that takes a word as a parameter and returns true if it is
    * in the dictionary array. Return false if it is not found.
    */
  public Boolean SpellChecker(String w) {
    for (String word : dictionary)
    {
        if (word == w) {
          return true;
        }
        else {
          continue;
        }
    }
    return false;
 

  }







   public static void main(String[] args)
   {
     SpellChecker checker = new SpellChecker();
     
     String word = "catz";
     if (checker.spellcheck(word) == true)
        {
         System.out.println(word + " is spelled correctly!");
        }
     else
     {
         System.out.println(word + " is misspelled!");
     }
    // Optional (not autograded)
    // checker.printStartsWith("a");
   }
}
