package 基础知识;

import java.util.Scanner;

/*
 * 猜字游戏
 * String[] 放要猜的字
 * StringBuilder[] 放等长度的字符串****
 * 
 */
public class Exercise0735 {
	public static void main(String[] args) {
		String[] words = {"program","write","that"};
		StringBuilder[] guess = new StringBuilder[words.length];
		EnterTheGame(words, guess);
	}
	
	public static void initStringBuilder(String[] words,StringBuilder[] guess) {
		for(int j=0;j<words.length;j++) {
			guess[j] = new StringBuilder();
			for(int i=0;i<words[j].length();i++) {
				//guess[i].Capacity() = 25;
				//init(guess[i]);
				guess[j].append('*');
			}
		}
	}
	
	public static void init(StringBuilder s) {
		for(int i=0;i<s.length();i++) {
			s.setCharAt(i, '*');
		}
	}
	
	public static boolean inWords(String guessChar,String words) {
		return words.contains(guessChar)?true:false;
	}
	
	public static boolean inStringBuilder(String guessChar,StringBuilder guess) {
		return guess.toString().contains(guessChar)? true:false;
	}
	
	public static void changeStringBuilder(String guessChar,String words,StringBuilder guess) {
	//	char[] array = words.toCharArray();
		for(int i=0;i<words.length();i++) {
			if(guessChar.charAt(0)==words.charAt(i)) {
				guess.setCharAt(i, words.charAt(i));
			}
		}
	}
	
	public static boolean GotAnswer(String words,StringBuilder guess) {
		return  words.equals(guess.toString())?true:false;
	}
	
	public static void EnterTheGame(String[] words,StringBuilder[] guess) {
		int count = 0;
		initStringBuilder(words, guess);
		int missTimes = 0;
		Scanner input = new Scanner(System.in);
		while (count<words.length) {
			System.out.print("(Guess) Enter a letter in word "+guess[count]+"->");
		//	System.out.print(guess[count]+"->");
			String guessChar = input.next();
			if(inWords(guessChar, words[count]) && !inStringBuilder(guessChar, guess[count])) {
				changeStringBuilder(guessChar, words[count], guess[count]);
			}
			else if(inWords(guessChar, words[count]) && inStringBuilder(guessChar, guess[count])) {
				System.out.println(guessChar+" is already in the word");
			}
			else if(!inWords(guessChar, words[count]) && !inStringBuilder(guessChar, guess[count])) {
				System.out.println(guessChar+" is not in the word");
				missTimes++;
			}
			if(GotAnswer(words[count], guess[count])) {
				System.out.print("The word is "+guess[count]+". You missed "+missTimes+" time");
				missTimes = 0;
				System.out.print(" Do you want to guess another word? Enter y or n>");
				String yn = input.next();
		//		System.out.println(yn);
				if(yn.equals("y")) {
					count++;
		//			System.out.println(count);
				}
				else if(yn.equals("n")) {
					System.out.println("The game is over");
					break;
				}
			}
		}
		input.close();
	}
	
}
