import java.nio.file.Files;
import java.nio.file.Paths;

//main class where the TAs test from 

//they will run 
//biol<sequence arr size> <file path>



public class biol {
	//need this as main for biol class
	//program accesses arguments from command line using string [] args
	public static void main(String[] args) {
		
		//code to read in the values of file path and sequence arr size
		
		int size_of_sequences = Integer.parseInt(args [0]);
		String file_path = args[1];
		//need to use java library to get contents of file path
		String contents = new String (Files.readAllBytes(Paths.get(file_path)));
		//form contents need to get each individual command which is split by new lines
		String[] commands = contents.split("/n");
		//need to go through each command 
		for (int i = 0; i < commands.length; i++) {
			execute(commands[i]);
		}
		//this method gets 
		public static void execute() {
			
		}
		
		
		
		//make a method to get which command it is 
		//make a method that takes in the command and then does what the command asks
		
		
		//enum
		//also stors linked list of characters we have to implement ourseles
		//define a class for element that has two fields, the type and the linked list
		//
		//
		//
		//
		//
		
		//class element{
		//Type t;
		//linkedList l;
		
		//define enum by saying public enum Type{
		//then list the possibilities for the enum -- can be dna, rna or unused in this case
		
		
		
		//example String s = "insert   5   DNA   Actg"
		//String[] avr = s.split("\\s+");
		//check what the word at index 1, to know what command it is 
		//so for this one
		//class element
		//type shoudl be DNA and the linked list should be linkedList
		
		
		//dont do anything if the elemnets of the array are not valid inputs
		
		
		
	}

}
