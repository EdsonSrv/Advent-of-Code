def f = new File("input")
def floor = 0
def position = 1
f.eachLine() {
	line -> 
	for(char c: line){
		if (c == '(') floor += 1
		if (c == ')') floor -= 1
		if (floor == -1) break
		position += 1
	}
}
println "$position"
