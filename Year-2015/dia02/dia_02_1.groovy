def f = new File("input")
f.eachLine() {
	line -> 
	println "$line"
}
