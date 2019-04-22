/*
 *
 * Dia 5 parte 2
 * String's nice:
 * 
 *
 */

def example1 = "qjhvhtzxzqqjkmpb"
def example2 = "xxyxx"
def example3 = "uurcxstgmygtbstg"
def example4 = "ieodomkazucvgmuy"

def isNice(String string){
	
}


def f = new File("input")
def total = 0
f.eachLine() {
	line -> 
	if(isNice(line)) total++
}

println total