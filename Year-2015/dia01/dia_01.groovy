def line
new File("input").withReader { line = it.readLine() }  
def floor = 0
for(char c: line){
	if (c == '(') floor += 1
	if (c == ')') floor -= 1
}
println "$floor"
