def line
new File("input").withReader { line = it.readLine() }  
def floor = 0
line.each {
	if (it == '(') floor += 1
	if (it == ')') floor -= 1
}
println "$floor"