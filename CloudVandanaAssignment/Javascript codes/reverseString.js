function reverseWords(sentence) {
    // Split the sentence into an array of words
    let words = sentence.split(" ");
  
    // Reverse each word in the array
    let reversedWords = words.map(word => {
      return word.split("").reverse().join("");
    });
  
    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(" ");
  
    return reversedSentence;
  }

let sentence = "Hello World! This is an example.";
let reversedSentence = reverseWords(sentence);
console.log(reversedSentence);