/*
 *
 * Dia 5
 * String's nice:
 * 1.- Contiene al menos 3 vocales
 * 2.- Contiene al menos una letra seguida dos veces
 * 3.- No contiene las subcadenas; ab, cd, pq, xy.
 *
 */

def isNice(String string){
	isCointainTrheeVowels(string) &&
	twoEqualsLetter(string) &&
	!isContainRestrictedLetters(string)
}

def isCointainTrheeVowels(String st){
	def total_vowels = 0
	"aeiou".each{ v ->
		(0..st.length()-1).each{ i ->
			if (st.charAt(i) == v) total_vowels++
		}
	}
	total_vowels >= 3
}

def twoEqualsLetter(String st){
	def flag = false
	(0..st.length()-1).each{
			if(it < st.length()-1 && st.charAt(it).equals(st.charAt(it+1)))
				flag = true
	}
	flag
}

def isContainRestrictedLetters(String st){
	switch(true) {
		case st.contains("ab"):
			true
		break
		case st.contains("cd"):
			true
		break
		case st.contains("pq"):
			true
		break
		case st.contains("xy"):
			true
		break
		default:
			false
		break
	}
}

def f = new File("input")
def total = 0
f.eachLine() {
	line ->
	if(isNice(line)) total++
}

println total