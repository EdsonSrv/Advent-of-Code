/*
 *
 * Dia 5 
 * String's nice:
 * 1.- Contiene al menos 3 vocales
 * 2.- Contiene al menos una letra seguida dos veces
 * 3.- No contiene las subcadenas; ab, cd, pq, xy.
 *
 */

def example1 = "ugknbfddgicrmopn" //is nice
def example2 = "aaa" //is nice
def example3 = "jchzalrnumimnmhp" //is naughty
def example4 = "haegwjzuvuyypxyu" // is naughty
def example5 = "dvszwmarrgswjxmb" // is naughty

def isNice(String string){
	isCointainTrheeVowels(string) &&
	twoEqualsLetter(string) &&
	!isContainRestrictedLetters(string)
}

def isCointainTrheeVowels(String st){
	def total_vowels = 0
	vowels = "aeiou"
	vowels.each{
		for (i in (0..st.length()-1))
			if (st.charAt(i) == it) total_vowels++
	}
	total_vowels >= 3
}

def twoEqualsLetter(String st){
	def flag = false
	(0..st.length()-1).each{
		if (it < st.length()-1)
			if(st.charAt(it).equals(st.charAt(it+1)))
				flag = true
	}
	flag
}

def isContainRestrictedLetters(String st){
	if (st.contains("ab")) true
	else if (st.contains("cd")) true
	else if (st.contains("pq")) true
	else if (st.contains("xy")) true
	else false
}

def f = new File("input")
def total = 0
f.eachLine() {
	line -> 
	if(isNice(line)) total++
}

println total