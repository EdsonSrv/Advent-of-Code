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
	cointainTrheeVowels(string)
}

def cointainTrheeVowels(String st){
	def total_vowels = 0
	vowels = "aeiou"
	for (char v: vowels){
		for (int i = 0; i < st.length(); i++){
			if (st.charAt(i) == v) total_vowels++
		}
	}
	total_vowels >= 3
}

def twoEqualsLetter(String st){

}

println twoEqualsLetter(example1)

def f = new File("input")
def total = 0
f.eachLine() {
	line -> 
	if(isNice(line)) total++
}

//println total