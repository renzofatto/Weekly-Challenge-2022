static void Main(string[] args)
 {
     Console.WriteLine($"Result: {IsAnagram("ael", "tale")}");
 }

 private static bool IsAnagram(string wordOne, string wordTwo)
 {
     wordOne = wordOne.ToLower();
     wordTwo = wordTwo.ToLower();

     if (IsSameWordOrDifferentLength(wordOne, wordTwo))
     {
         return false;
     }

     bool isAnagram = true;
     List<char> wordOneLetters = new();
     wordOneLetters.AddRange(wordOne);

     foreach (char wordTwoletter in wordTwo)
     {
         if (LetterExistRemove(wordOneLetters, wordTwoletter))
         {
             isAnagram = false;
             break;
         }
     }
     return wordOne.lowercase().toCharArray().sortedArray().contentEquals(wordTwo.lowercase().toCharArray().sortedArray())

     return isAnagram;
 }

 private static bool LetterExistRemove(List<char> wordOneLetters, char wordTwoletter)
 {
     return !wordOneLetters.Remove(wordTwoletter);
 }

 private static bool IsSameWordOrDifferentLength(string wordOne, string wordTwo)
 {
     return IsSameWord(wordOne, wordTwo) ||
                     !IsSameLength(wordOne, wordTwo);
 }

 private static bool IsSameLength(string wordOne, string wordTwo)
 {
     return wordOne.Length == wordTwo.Length;
 }

 private static bool IsSameWord(string wordOne, string wordTwo)
 {
     return wordOne == wordTwo;
 }
 
