def f = new File("input")
def floor = 0
f.eachLine() {
	line -> 
	for(char c: line){
		if (c == '(') floor += 1
		if (c == ')') floor -= 1
	}
}
println "$floor"
