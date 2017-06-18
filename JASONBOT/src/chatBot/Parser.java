package chatBot;

import java.io.*;
import java.util.*;

import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.*;

public class Parser {
	StanfordCoreNLP pipeline;
	public Parser(){
	    // Create a CoreNLP pipeline. To build the default pipeline, you can just use:
	    //   StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
	    // Here's a more complex setup example:
	    //   Properties props = new Properties();
	    //   props.put("annotators", "tokenize, ssplit, pos, lemma, ner, depparse");
	    //   props.put("ner.model", "edu/stanford/nlp/models/ner/english.all.3class.distsim.crf.ser.gz");
	    //   props.put("ner.applyNumericClassifiers", "false");
	    //   StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

	    // Add in sentiment
	    Properties props = new Properties();
	    props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, sentiment");

	    pipeline = new StanfordCoreNLP(props);
	}
  public HashMap<String, ArrayList<String>> annotate(String G) throws IOException {

    
    HashMap<String, ArrayList<String>> POSSets = new HashMap<String, ArrayList<String>>();

    String Sentence = G;
    // Initialize an Annotation with some text to be annotated. The text is the argument to the constructor.
    Annotation annotation;

      annotation = new Annotation(Sentence);

    // run all the selected Annotators on this text
    pipeline.annotate(annotation);

    // An Annotation is a Map with Class keys for the linguistic analysis types.
    // You can get and use the various analyses individually.
    // For instance, this gets the parse tree of the first sentence in the text.

    List<CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);
    if (sentences != null && ! sentences.isEmpty()) {
      for (int g = 0; g<sentences.size();g++) {
    	  CoreMap sentence = sentences.get(g);
      for (CoreMap token : sentence.get(CoreAnnotations.TokensAnnotation.class)) {
        if (POSSets.get(token.get(CoreAnnotations.PartOfSpeechAnnotation.class))==null){
        	ArrayList<String> newList = new ArrayList<String>();
        	POSSets.put(token.get(CoreAnnotations.PartOfSpeechAnnotation.class),newList);
        }
        boolean notRedundant = true;
        for (String string : POSSets.get(token.get(CoreAnnotations.PartOfSpeechAnnotation.class))){
        	if (string.equalsIgnoreCase(token.get(CoreAnnotations.LemmaAnnotation.class))){
        		notRedundant = false;
        	}
        }
        if(notRedundant)
        POSSets.get(token.get(CoreAnnotations.PartOfSpeechAnnotation.class)).add(token.get(CoreAnnotations.LemmaAnnotation.class));
      }
      if (POSSets.get("Sentiment")==null){
      ArrayList<String> newList = new ArrayList<String>();
      POSSets.put("Sentiment",newList);
      POSSets.get("Sentiment").add(sentence.get(SentimentCoreAnnotations.SentimentClass.class));
      }
      
    }
    }
    return POSSets;
  }

}
