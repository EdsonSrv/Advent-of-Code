/*
 *
 * Dia 5 parte 2
 * String's nice:
 * 1.- contiene un par de letras que se repite
 * 2.- contiene una letra que se repite con una letra entre ellas
 *
 */

def isNice(String string){
	isContainPairLetter(string) && isContainBetwenTwo(string)
}

def isContainPairLetter(String st){
	def flag = false
	for (int i = 0; i < st.length()-1; i++)
		for (int j = 1; j < st.length(); j++){
			def sub = ""+st.charAt(i)
			sub = sub + st.charAt(j)
			if (( st.split(sub, -1).length ) - 1 >= 2){
				flag = true
				flag
			}
		}
	flag
}

def isContainBetwenTwo(String st){
	for (i in (0..st.length()-3)){
		def letter = st.charAt(i)
		def pattern = ~/.*${letter}.${letter}.*/
		if(st ==~ pattern)
			return true
	}
	false
}

def f = new File("input")
def total = 0
f.eachLine() {
	line -> 
	if(isNice(line)) total++
}

println total